<template>
  <div>
    <div style="text-align: left">
      <el-button type="success" @click="to"> 返回</el-button>
    </div>
    <el-form :model="formValue" :rules="rules" ref="formValue" label-width="100px" class="demo-formValue">
      <el-form-item label="名称" prop="name">
        <el-input v-model="formValue.name"></el-input>
      </el-form-item>

      <el-form-item label="案例类型" prop="caseTypeId">
        <el-select v-model="formValue.caseTypeId" clearable placeholder="请选择" style="float: left;width:100%">
          <el-option
            v-for="item in caseTypeList"
            :key="item.id"
            :label="item.cnName"
            :value="item.id">
          </el-option>
        </el-select>
      </el-form-item>

      <el-form-item label="展示类型" prop="caseTypeId">
        <el-select v-model="formValue.exhibitionTypeId" clearable placeholder="请选择" style="float: left;width:100%">
          <el-option
            v-for="item in exhibitionTypeList"
            :key="item.id"
            :label="item.name"
            :value="item.id">
          </el-option>
        </el-select>
      </el-form-item>


      <el-form-item ref="upload_attach_item_iamge" label="展示图片" prop="files" size='small' v-if="!isUpdate">
        <el-upload style="float: left"

                   :drag="true"
                   ref="upload_attach"
                   class="upload-demo"
                   action=""
                   multiple
                   accept=".jpg,.png,.jpeg"
                   :limit="10"
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


      <el-form-item>
        <el-button type="primary" @click="submitForm('formValue')" v-if="!isUpdate">{{buttonTitle}}</el-button>
        <el-button type="primary" @click="updateExhibits()" v-if="isUpdate">{{buttonTitle}}</el-button>
        <el-button @click="resetForm('formValue')">重置</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
  import loading from "../../../loading";

  export default {
    name: "CaseManager",

    data() {
      //验证文件
      var validateAttachFiles = (rule, value, callback) => {

        if (this.fileList.length == 0) {
          callback(new Error('请选择展示图片'));
        } else {
          callback();
        }
      };
      return {
        formValue: {},
        caseTypeList: [],
        exhibitionTypeList: [],

        isUpdate: false,
        fileList: [],
        //上传文件进度条
        progressPercent: 0,
        show_progress: false,

        buttonTitle: "创建",

        rules: {
          name: [
            {required: true, message: '请输入中文名称', trigger: 'blur'},
          ],
          caseTypeId: [
            {required: true, message: '请选择案例类型', trigger: 'change'}
          ],
          exhibitionTypeId: [
            {required: true, message: '请选择展示类型', trigger: 'change'}
          ],
          files: [
            {required: true, validator: validateAttachFiles}
          ],
        }
      }
    },
    methods: {
      to() {
        this.$router.push({path: "/case/caseList"});
      },
      changFileImage(file, fileList) {
        //选择文件后，给fileList对象赋值
        this.fileList = fileList
      },
      removeImageFile(file, fileList) {
        this.fileList = fileList
      },
      handleExceed(image, fileList) {
        this.$message.warning(`当前限制最多选择 4个文件`);
      },
      resetForm(formName) {
        this.$refs[formName].resetFields();
        this.fileList = [];
      },
      submitForm(formName) {

        let _this = this;
        this.$refs[formName].validate((valid) => {
          if (valid) {
            let data = new FormData();
            for (let i = 0; i < this.fileList.length; i++) {
              data.append("files", this.fileList[i].raw);
            }

            for (let key in this.formValue) {
              console.log(key)
              data.append(key, this.formValue[key])
            }
            const _loading = loading(`文件上传中，请稍后...`)
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


            this.addCase(data, _loading, config)


          } else {
            this.$message({
              message: '请填写完整信息再后提交',
              type: 'error'
            });
            return false;
          }
        });
      },

      addCase(data, _loading, config) {
        let _this = this;
        this.$http.post("case/createCase", data, config).then((res) => {

          _loading.close(); // 关闭加载框
          // this.show_progress = false
          this.progressPercent = 0
          if (res.data.success == true) {

            this.$message({
                message: "创建成功",
                type: 'success',
              }
            );
            setTimeout(function () {
              _this.fileList = [];// 提交完成清空附件列表
              _this.to();

            }, 100)

          } else {
            this.$message({
              message: res.data.msg,
              type: 'error'
            });
          }
        }).catch(function (error) { // 请求失败处理
        });
      },

    },
    created() {
      let _this = this;
      this.$http.get("casetype/findAll").then(res => {
        _this.caseTypeList = res.data.data.caseTypeList;
      })
      this.$http.get("exhibitionType/readAll").then(res => {
        _this.exhibitionTypeList = res.data.data.exhibitionTypeList;
      })
    }
  }
</script>

<style scoped>

</style>
