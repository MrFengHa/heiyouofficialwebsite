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

        ]


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
