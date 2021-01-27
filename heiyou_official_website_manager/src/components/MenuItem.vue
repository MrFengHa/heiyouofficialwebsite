<template>
  <el-menu

    :default-active="this.$route.path"
    class="el-menu-vertical-demo menuHeight"
    background-color="#545c64"
    text-color="#fff"
    active-text-color="#ffd04b"
    router>

    <el-submenu index="/exhibits/">
      <template slot="title">
        <i class="el-icon-location"></i>
        <span>经典案例</span>
      </template>
      <el-menu-item v-for="(item,i) in exhibitsList" :key="i" :index="item.path" >
        {{item.menuName}}
      </el-menu-item>

    </el-submenu>

    <el-submenu index="/information/">
      <template slot="title">
        <i class="el-icon-message"></i>
        <span>用户留言</span>
      </template>
      <el-menu-item v-for="(item,i) in informationList" :key="i" :index="item.path" >
        {{item.menuName}}
      </el-menu-item>

    </el-submenu>


    <el-submenu index="/news/">
      <template slot="title">
        <i class="el-icon-news"></i>
        <span>新闻管理</span>
      </template>
      <el-menu-item v-for="(item,i) in informationList" :key="i" :index="item.path" >
        {{item.menuName}}
      </el-menu-item>

    </el-submenu>

  </el-menu>
</template>

<script>
  export default {
    name: "MenuItem",
    data() {
      return {
        exhibitsList: [
          {path: "/caseType/caseTypeList", menuName: "案例类型"},
          {path: "/case/caseList", menuName: "案例管理"},

        ],
        informationList: [
          {path: "/information/informationList", menuName: "留言列表"},
        ],

        informationList: [
          {path: "/newsType/newsTypeList", menuName: "新闻类型列表"},
          {path: "/news/newsList", menuName: "新闻列表"}
        ],



      }

    },
    methods: {


    }
  }
</script>

<style scoped>
  .menuHeight {
    height: 100%;

  }
</style>
