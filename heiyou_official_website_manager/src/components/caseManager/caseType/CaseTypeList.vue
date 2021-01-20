<template>
  <div>
    <div>
      <el-button type="primary"  @click="toAddCaseType()" round>添加</el-button>
    </div>
    <el-table
      :data="tableData.filter(data => !search || data.cnName.toLowerCase().includes(search.toLowerCase()))"
      style="width: 100% ; margin-top: 10px">
      <el-table-column
        label="序号"
        type="index">
      </el-table-column>
      <el-table-column
        label="中文名称"
        prop="cnName">
      </el-table-column>
      <el-table-column
        label="英文名称"
        prop="enName">
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
          <el-button
            size="mini"
            type="success"
            @click="handleEdit(scope.$index, scope.row)">更新</el-button>
          <el-button
            size="mini"
            type="danger"
            @click="handleDelete(scope.$index, scope.row)">删除</el-button>
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
    export default {

        name: "CaseType",
      data() {
        return {
          tableData: [],
          search: ''
        }
      },
      methods: {
        toAddCaseType() {
          this.$router.push({path: "/caseType/caseTypeToAdd"});
        },
        findAll(){
          let _this = this;
          this.$http.get("casetype/findAll").then((res)=>{
            _this.tableData = res.data.data.caseTypesList;
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
