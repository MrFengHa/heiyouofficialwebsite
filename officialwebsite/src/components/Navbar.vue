<template>
  <div>
    <b-navbar class="navbarClass" toggleable="lg" type="dark"  >
      <b-navbar-brand href="/">
        <img  class="navbarLogo" src="../assets/navbar/logo.jpg">
      </b-navbar-brand>

      <b-navbar-toggle target="nav-collapse"></b-navbar-toggle>

      <b-collapse id="nav-collapse" is-nav>
        <b-navbar-nav>
          <b-nav-item href="/">首页</b-nav-item>
          <b-nav-item href="#/intoBlackOli/groupProfile">走进黑油</b-nav-item>
          <b-nav-item href="#">集团业务</b-nav-item>
          <b-nav-item href="#">公司新闻</b-nav-item>
          <b-nav-item href="#">上市公司</b-nav-item>
          <b-nav-item href="#">联系我们</b-nav-item>
        </b-navbar-nav>
      </b-collapse>
    </b-navbar>
  </div>
</template>

<script>
  export default {
    name: "Navbar",
    data(){
      return{

      }
    }
  }
</script>

<style scoped>
  .navbarClass {
    background-color: #313236;
  }
  .navbarLogo{
    width: 150px;
  }
</style>
