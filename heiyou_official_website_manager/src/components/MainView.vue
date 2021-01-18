<template>
  <el-container>
    <el-header style="height: 10vh; background-color: #545c70;" >
      <harder-view></harder-view>
    </el-header>
    <el-container>
      <el-aside width="15%" style="height: 87vh">
        <menu-item></menu-item>
      </el-aside>
      <el-container>
        <el-main>
          <router-view ></router-view>
        </el-main>

      </el-container>
    </el-container>
  </el-container>
</template>

<script>
  import MenuItem from "../components/MenuItem";
  import HarderView from "./HarderView";
    export default {
        name: "MainView",
      components: {  HarderView, MenuItem},

    }
</script>

<style scoped>
  .el-header, .el-footer {

    background-color: #B3C0D1;
    color: #333;
    text-align: left;
    line-height: 50px;
  }

  .el-aside {
    background-color: #D3DCE6;
    color: #333;
    text-align: center;
    line-height: 200px;
  }

  .el-main {
    background-color: #E9EEF3;
    color: #333;
    text-align: right;
    line-height: 30px;

  }

  body > .el-container {
    margin-bottom: 40px;
  }

  .el-container:nth-child(5) .el-aside,
  .el-container:nth-child(6) .el-aside {
    line-height: 260px;
  }

  .el-container:nth-child(7) .el-aside {
    line-height: 320px;
  }
</style>
