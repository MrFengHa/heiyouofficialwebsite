<template>
  <div>
    <div style="text-align: left">
      <el-button type="success" @click="to"> 返回</el-button>
    </div>
    <el-form :model="formValue" :rules="rules" ref="formValue" label-width="100px" class="demo-formValue">
      <el-form-item label="类型名称" prop="newsType_name">
        <el-input v-model="formValue.newsType_name"></el-input>
      </el-form-item>
      <el-form-item label="备注" prop="newsType_desc">
        <el-input v-model="formValue.newsType_desc"></el-input>
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
    export default {
        name: "NewsManager",
      data() {
        return {
          formValue: {},
          isUpdate: false,
          buttonTitle: "创建",

          rules: {
            newsType_name: [
              {required: true, message: '请输入文章类型名称', trigger: 'blur'},
            ]
          }
        }
      },
      methods: {
        to() {
          this.$router.push({path: "/newsType/newsTypeList"});
        },

        resetForm(formName) {
          this.$refs[formName].resetFields();
        },
        submitForm(formName) {

          console.log(this.formValue)
          let _this = this;
          this.$refs[formName].validate((valid) => {
            if (valid) {
              this.$http.post("newType/saveNewsType", this.formValue).then(res => {
                if (res.data.success == true) {

                  this.$message({
                      message: "创建成功",
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

        updateExhibits(formName){
          console.log(this.formValue)
          let _this = this;
          this.$refs[formName].validate((valid) => {
            if (valid) {
              this.$http.post("newType/updateNewsType", this.formValue).then(res => {
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
        }
      },
      created() {
        if (this.$route.params.newsType_id != null) {
          this.$http.get("newType/getNewsTypeById?newsType_id="+this.$route.params.newsType_id).then(res=>{
            this.formValue= res.data.data.newsType;
            console.log(res.data)
          })

          this.buttonTitle = "更新";
          this.isUpdate = true;
        }
      }
    }
</script>

<style scoped>

</style>
