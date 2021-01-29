<template>
  <div>
    <div>
      <el-button type="primary" @click="toAddNewType()" round>添加</el-button>
    </div>
    <el-table
      :data="tableData.filter(data => !search || data.newsType_name.toLowerCase().includes(search.toLowerCase()))"
      style="width: 100% ; margin-top: 10px">
      <el-table-column
        label="序号"
        type="index"
        width="200px">
      </el-table-column>
      <el-table-column
        label="类型名称"
        prop="newsType_name"
      >
      </el-table-column>
      <el-table-column
        label="备注"
        prop="newsType_desc">
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
            @click="handleEdit(scope.$index, scope.row)">更新
          </el-button>
          <el-button
            size="mini"
            type="danger"
            @click="handleDelete(scope.$index, scope.row)">删除
          </el-button>
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
  export default {
    name: "NewsTypeList",
    data() {
      return {
        tableData: [],
        search: ''
      }
    },
    methods: {
      findAll() {
        let _this = this;
        this.$http.get("newsType/getAllNewType").then((res) => {
          console.log()
          _this.tableData = res.data.data.newTypeList;
        })
      },

      handleEdit(index, row) {
        this.$router.push({path: "/newsType/newsTypeToUpdate/"+row.newsType_id});

      },
      handleDelete(index, row) {
        // let _this = this;
        // this.$http.post("casetype/deleteCaseType", row).then((res) => {
        //   if (res.data.success) {
        //     this.$message({
        //         message: "删除成功",
        //         type: 'success',
        //       }
        //     );
        //     _this.findAll()
        //   } else {
        //     this.$message({
        //       message: "删除失败",
        //       type: 'error'
        //     });
        //   }
        // })

        this.$message({
          message:"暂不支持删除功能",
          type:'info'
        })
      },
      toAddNewType() {
        this.$router.push({path: "/newsType/newsTypeToAdd"});
      }
    },
    created() {
      this.findAll();
    }
  }

</script>

<style scoped>

</style>
