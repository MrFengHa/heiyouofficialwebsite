<template>
  <div>
    <div style="text-align: left">
      <el-button type="success" @click="to"> 返回</el-button>
    </div>
    <el-form :model="formValue" :rules="rules" ref="formValue" label-width="100px" class="demo-formValue">
      <el-form-item label="新闻标题" prop="news_Title">
        <el-input v-model="formValue.news_Title"></el-input>
      </el-form-item>
      <el-form-item label="新闻类型" prop="newsType_id">
        <el-select v-model="formValue.newsType_id" clearable placeholder="请选择" style="float: left;width:100%">
          <el-option
            v-for="item in newsTypeList"
            :key="item.newsType_id"
            :label="item.newsType_name"
            :value="item.newsType_id">
          </el-option>
        </el-select>
      </el-form-item>

      <el-form-item ref="upload_attach_item_iamge" label="封面图片" prop="files" size='small'>
        <el-upload style="float: left"

                   :drag="true"
                   ref="upload_attach"
                   class="upload-demo"
                   action=""
                   multiple
                   accept=".jpg,.png,.jpeg"
                   :limit="1"
                   :on-change="changFileImage"
                   :on-exceed="handleExceed"
                   :on-remove="removeImageFile"
                   :file-list="fileList"
                   :auto-upload="false"

        >
          <i class="el-icon-upload"></i>
          <div class="el-upload__text">将文件拖到此处，或<em>点击上传</em></div>

          <div class="el-upload__tip" slot="tip">只能上传jpg/png文件，且不超过500kb</div>
        </el-upload>
        <el-progress :percentage="progressPercent" v-show="show_progress"></el-progress>

      </el-form-item>

      <el-form-item label="正文">
        <Upload
          :show-upload-list="false"
          :on-success="handleSuccess"
          :format="['jpg','jpeg','png','gif']"
          accept=".jpg,.png,.jpeg"
          :max-size="2048"
          multiple
          :action="uploadPath"
        >
          <Button icon="ios-cloud-upload-outline"></Button>
        </Upload>
        <quill-editor
          ref="myQuillEditor"
          class="editor"
          v-model="formValue.news_Content"
          :options="editorOption"
          @blur="onEditorBlur($event)"
          @focus="onEditorFocus($event)"
          @ready="onEditorReady($event)"
        />
      </el-form-item>


      <el-form-item label="新闻描述" prop="news_Desc">
        <el-input v-model="formValue.news_Desc"></el-input>
      </el-form-item>

      <el-form-item>
        <el-button type="primary" @click="submitForm('formValue')" v-if="!isUpdate">{{buttonTitle}}</el-button>
        <el-button type="primary" @click="updateExhibits('formValue')" v-if="isUpdate">{{buttonTitle}}</el-button>
        <el-button @click="resetForm('formValue')">重置</el-button>
      </el-form-item>
    </el-form>

  </div>
</template>

<script>
  import 'quill/dist/quill.core.css'
  import 'quill/dist/quill.snow.css'
  import 'quill/dist/quill.bubble.css'
  import loading from "../../../loading";
  import {quillEditor} from 'vue-quill-editor'
  import {baseUrl} from "../../../constant"
  // 工具栏配置
  const toolbarOptions = [
    ['bold', 'italic', 'underline', 'strike'], //加粗，斜体，下划线，删除线
    ['blockquote', 'code-block'], //引用，代码块


    [{header: 1}, {header: 2}], // 标题，键值对的形式；1、2表示字体大小
    [{list: 'ordered'}, {list: 'bullet'}], //列表
    [{script: 'sub'}, {script: 'super'}], // 上下标
    [{indent: '-1'}, {indent: '+1'}], // 缩进
    [{direction: 'rtl'}], // 文本方向


    [{size: ['small', false, 'large', 'huge']}], // 字体大小
    [{header: [1, 2, 3, 4, 5, 6, false]}], //几级标题


    [{color: []}, {background: []}], // 字体颜色，字体背景颜色
    [{font: []}], //字体
    [{align: []}], //对齐方式
    ['link', 'image', 'video'],

    ['clean'], //清除字体样式
    // ['image', 'video'], //上传图片、上传视频
  ]

  // 标题
  const titleConfig = {
    'ql-bold': '加粗',
    'ql-color': '颜色',
    'ql-font': '字体',
    'ql-code': '插入代码',
    'ql-italic': '斜体',
    'ql-link': '添加链接',
    'ql-background': '背景颜色',
    'ql-size': '字体大小',
    'ql-strike': '删除线',
    'ql-script': '上标/下标',
    'ql-underline': '下划线',
    'ql-blockquote': '引用',
    'ql-header': '标题',
    'ql-indent': '缩进',
    'ql-list': '列表',
    'ql-align': '文本对齐',
    'ql-direction': '文本方向',
    'ql-code-block': '代码块',
    'ql-formula': '公式',
    'ql-image': '图片',
    'ql-video': '视频',
    'ql-clean': '清除字体样式',
    'ql-upload': '文件'
  };
  export default {
    name: "NewsManager",
    components: {quillEditor},
    data() {
      //验证密码
      var validateAttachImage = (rule, value, callback) => {

        if (this.imageFileList.length == 0) {
          callback(new Error('请选择封面图片'));
        } else {
          callback();
        }
      };
      return {
        formValue: {},
        isUpdate: false,
        buttonTitle: "创建",
        newsTypeList: [],
        isUpdate: false,
        fileList: [],
        //上传文件进度条
        progressPercent: 0,
        show_progress: false,
        buttonTitle: "创建",
        editorOption: {
          modules: {
            toolbar: {
              container:toolbarOptions,//富文本工具栏
              handlers: {
                'image': function (value) {
                  if (value) {
                    // 调用iview图片上传
                    document.querySelector('.ivu-upload .ivu-btn').click()
                  } else {
                    this.quill.format('image', false);
                  }
                }
              }
            },

          },
          theme: 'snow',
        },
        uploadPath:baseUrl+ "news/saveNewsImage",
        rules: {

          news_Title: [
            {required: true, message: '请输入新闻标题', trigger: 'blur'},
          ],
          newsType_id: [
            {required: true, message: '请选择新闻类型', trigger: 'change'}
          ],


          image: [
            {required: true, validator: validateAttachImage}
          ],
        },
      }
    },
    methods: {
      /*********************跳转页面Start***********************************/
      to() {
        this.$router.push({path: "/news/newsList"});
      },
      /*********************跳转页面End***********************************/
      /*********************富文本组件上传图片Start*************************/
      addQuillTitle() {
        const oToolBar = document.querySelector('.ql-toolbar'),
          aButton = oToolBar.querySelectorAll('button'),
          aSelect = oToolBar.querySelectorAll('select');
        aButton.forEach(function (item) {
          if (item.className === 'ql-script') {
            item.value === 'sub' ? item.title = '下标' : item.title = '上标';
          } else if (item.className === 'ql-indent') {
            item.value === '+1' ? item.title = '向右缩进' : item.title = '向左缩进';
          } else {
            item.title = titleConfig[item.classList[0]];
          }
        });
        aSelect.forEach(function (item) {
          item.parentNode.title = titleConfig[item.classList[0]];
        });
      },
      // 图片
      handleSuccess(res, file) {
        let quill = this.$refs.myQuillEditor.quill
        let length = quill.getSelection().index;
        quill.insertEmbed(length, 'image', res.data.path)
        quill.setSelection(length + 1)
      },
      /*********************富文本组件上传图片End*************************/

      /**********************富文本组件函数Start******************************/
      onEditorBlur(quill) {

      },
      onEditorFocus(quill) {

      },
      onEditorReady(quill) {

      },
      /**********************富文本组件函数End******************************/
      /**********************封面图片上传组件Start****************************/
      /**
       * 选择文件后，给fileList对象赋值
       *
       */
      changFileImage(file, fileList) {
        //选择文件后，给fileList对象赋值
        this.fileList = fileList
      },
      removeImageFile(file, fileList) {
        this.fileList = fileList
      },

      handleExceed(image, fileList) {
        this.$message.warning(`当前限制最多选择1个文件`);
      },
      /**********************封面图片上传组件End****************************/

      /**
       * 重置方法
       * @param formName
       */
      resetForm(formName) {

        this.$refs[formName].resetFields();
      },
      /**
       * 上传表单
       * @param formName
       */
      submitForm(formName) {

        let _this = this;
        this.$refs[formName].validate((valid) => {
          if (valid) {
            let data = new FormData();
            console.log(this.fileList.length)
            data.append("coverImage", this.fileList[0].raw);
            for (let key in this.formValue) {
              if (key != "exhibitionHall") {
                data.append(key, this.formValue[key])
              }
            }
            const _loading = loading(`文件上传中，请稍后...`)

            // this.show_progress = true
            const config = {
              onUploadProgress: progressEvent => {
                // progressEvent.loaded:已上传文件大小
                // progressEvent.total:被上传文件的总大小
                this.progressPercent = Number((progressEvent.loaded / progressEvent.total * 100).toFixed(0))
                _loading.setText('文件上传中，进度：' + this.progressPercent + "%") //更新dialog进度，优化体验
              },
              headers: {
                'Content-Type': 'multipart/form-data'
              }
            }
            this.$http.post("news/saveNews", data, config).then(res => {
              if (res.data.success == true) {

                this.$message({
                    message: "创建成功",
                    type: 'success',
                  }
                );
                _loading.close(); // 关闭加载框
                // this.show_progress = false
                this.progressPercent = 0
                setTimeout(function () {
                  _this.fileList = []//情况附件
                  _this.to();

                }, 100)

              } else {
                this.$message({
                  message: res.data.message,
                  type: 'error'
                });
              }
            })
          } else {
            this.$message({
              message: '请填写完整信息再后提交',
              type: 'error'
            });
            return false;
          }
        });
      },

      updateExhibits(formName) {
        console.log(this.formValue)
        let _this = this;
        this.$refs[formName].validate((valid) => {
          if (valid) {
            this.$http.post("newsType/updateNewsType", this.formValue).then(res => {
              if (res.data.success == true) {

                this.$message({
                    message: "更新成功",
                    type: 'success',
                  }
                );
                setTimeout(function () {

                  _this.to();

                }, 100)

              } else {
                this.$message({
                  message: res.data.message,
                  type: 'error'
                });
              }
            })
          } else {
            this.$message({
              message: '请填写完整信息再后提交',
              type: 'error'
            });
            return false;
          }
        });
      },

    },
    created() {

      this.$http.get("newsType/getAllNewType").then(res => {
        this.newsTypeList = res.data.data.newTypeList;
      })

      if (this.$route.params.newsType_id != null) {
        this.$http.get("newsType/getNewsTypeById?newsType_id=" + this.$route.params.newsType_id).then(res => {
          this.formValue = res.data.data.newsType;

        })

        this.buttonTitle = "更新";
        this.isUpdate = true;
      }
    },
    mounted() {
      this.addQuillTitle()
    },
  }
</script>

<style scoped lang="less">
  .editor {
    /*height: 500px;*/
    background-color: white;

  }

  .ivu-upload {
    display: none;
  }
</style>
