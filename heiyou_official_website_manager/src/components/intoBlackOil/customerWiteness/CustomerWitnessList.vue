<template>
  <div>
    <div>
      <el-button type="primary" @click="toAddCustomerWitness()" round>添加</el-button>
    </div>
    <el-table
      :data="tableData.filter(data => !search || data.customerWitness_Title.toLowerCase().includes(search.toLowerCase()))"
      style="width: 100% ; margin-top: 10px">
      <el-table-column
        label="序号"
        type="index"
        width="200px">
      </el-table-column>
      <el-table-column
        label="客户见证标题"
        prop="customerWitness_Title"
      >
      </el-table-column>
      <el-table-column
        label="创建时间"
        prop="customerWitness_CreateTime">
      </el-table-column>
      <el-table-column
        label="客户见证描述"
        prop="customerWitness_Desc">
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
            type="info"
            @click="seeNews(scope.$index, scope.row)">查看
          </el-button>
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
    name: "CustomerWitnessList",
    data() {
      return {
        tableData: [],
        search: ''
      }
    },
    methods: {
      findAll() {
        let _this = this;
        this.$http.get("intoBlackOilCustomerWitness/getAllCustomerWitness").then((res) => {
          console.log()
          _this.tableData = res.data.data.customerWitnesses;
        })
      },

      handleEdit(index, row) {
        this.$router.push({path: "/intoBlackOil/customerWitnessToUpdate/" + row.customerWitness_Id});

      },
      handleDelete(index, row) {
        let _this = this;
        this.$http.post("intoBlackOilCustomerWitness/deleteCustomerWitness", row).then((res) => {
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

      },
      toAddCustomerWitness() {
        this.$router.push({path: "/intoBlackOil/customerWitnessToAdd"});
      },
      seeNews(index, row) {
        this.$router.push({path: "/intoBlackOil/customerWitnessArticleSee/" + row.customerWitness_Id});
      }
    },
    created() {
      this.findAll();
    }
  }
</script>

<style scoped>

</style>
