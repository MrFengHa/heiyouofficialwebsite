<template>
  <div>
    <el-table
      :data="tableData.filter(data => !search || data.name.toLowerCase().includes(search.toLowerCase()))"
      style="width: 100% ; margin-top: 10px">
      <el-table-column
        label="序号"
        type="index">
      </el-table-column>
      <el-table-column
        label="客户名称"
        prop="name">
      </el-table-column>
      <el-table-column
        label="手机号码"
        prop="phoneNumber">
      </el-table-column>
      <el-table-column
        label="留言信息"
        prop="desc">
      </el-table-column>
      <el-table-column
        align="right">
        <template slot="header" slot-scope="scope">
          <el-input
            v-model="search"
            size="mini"
            placeholder="输入关键字搜索"/>
        </template>
        <template slot-scope="scope">

        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
    export default {
        name: "InformationList",
      data() {
        return {
          tableData: [],
          search: ''
        }
      },
      methods: {
        findAll(){
          let _this = this;
          this.$http.get("information/getAllInformation").then((res)=>{
            console.log()
            _this.tableData = res.data.data.informationList;
          })
        },

        handleEdit(index, row) {
          //this.$router.push({path: "/exhibitionHall/exhibitionHallToUpdate?id="+row.id});
          this.$message({
            message:"该功能正在开发中。。。",
            type:"info"
          })
        },
        handleDelete(index, row) {
          let _this = this;
          this.$http.post("casetype/deleteCaseType",row).then((res)=>{
            if (res.data.success) {
              this.$message({
                  message: "删除成功",
                  type: 'success',
                }
              );
              _this.findAll()
            } else {
              this.$message({
                message: "删除失败",
                type: 'error'
              });
            }
          })
        }
      },
      created() {
        this.findAll();
      }
    }
</script>

<style scoped>

</style>
