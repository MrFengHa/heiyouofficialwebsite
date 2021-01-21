<template>
  <div>
    <div>
      <el-button type="primary"  @click="toAddCase()" round>添加</el-button>
    </div>
    <el-table
      :data="tableData.filter(data => !search || data.cnName.toLowerCase().includes(search.toLowerCase()))"
      style="width: 100% ; margin-top: 10px">
      <el-table-column
        label="序号"
        type="index">
      </el-table-column>
      <el-table-column
        label="项目名称"
        prop="name">
      </el-table-column>
      <el-table-column
        label="案例类型"
        prop="caseType.cnName">
      </el-table-column>
      <el-table-column
        label="展示类型"
        prop="exhibitionType.name">
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
        name: "CaseList",
      data() {
        return {
          tableData: [],
          search: ''
        }
      },
      methods: {
        toAddCase() {
          this.$router.push({path: "/case/caseToAdd"});
        },
        findAll(){
          let _this = this;
          this.$http.get("case/findAll").then((res)=>{
            _this.tableData = res.data.data.caseList;
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
