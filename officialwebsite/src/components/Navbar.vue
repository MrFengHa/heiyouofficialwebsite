<template>
  <div>
    <b-navbar class="navbarClass" toggleable="lg" type="dark"  >
      <b-navbar-brand href="/">
        <img  class="navbarLogo" src="../assets/navbar/logo.jpg">
      </b-navbar-brand>

      <b-navbar-toggle target="nav-collapse"></b-navbar-toggle>

      <b-collapse id="nav-collapse" is-nav>
        <b-navbar-nav>
          <b-nav-item href="#">首页</b-nav-item>
          <b-nav-item href="#/intoBlackOli">走进黑油</b-nav-item>
          <b-nav-item href="#">集团业务</b-nav-item>
          <b-nav-item href="#">公司新闻</b-nav-item>
          <b-nav-item href="#">上市公司</b-nav-item>
          <b-nav-item href="#">联系我们</b-nav-item>
        </b-navbar-nav>


        <!-- Right aligned nav items -->
<!--        <b-navbar-nav class="ml-auto">-->
<!--          <b-nav-item-dropdown text="Lang" right>-->
<!--            <b-dropdown-item href="#">中文</b-dropdown-item>-->
<!--            <b-dropdown-item href="#">EN</b-dropdown-item>-->
<!--          </b-nav-item-dropdown>-->
<!--          <b-nav-form>-->
<!--            <b-form-input size="sm" class="mr-sm-2" placeholder="Search"></b-form-input>-->
<!--            <b-button size="sm" class="my-2 my-sm-0" type="submit">Search</b-button>-->
<!--          </b-nav-form>-->
<!--        </b-navbar-nav>-->


        <!--        <b-nav-item-dropdown right>-->
        <!--          &lt;!&ndash; Using 'button-content' slot &ndash;&gt;-->
        <!--          <template v-slot:button-content>-->
        <!--            <em>User</em>-->
        <!--          </template>-->
        <!--          <b-dropdown-item href="#">Profile</b-dropdown-item>-->
        <!--          <b-dropdown-item href="#">Sign Out</b-dropdown-item>-->
        <!--        </b-nav-item-dropdown>-->

      </b-collapse>
    </b-navbar>
  </div>
</template>

<script>
  export default {
    name: "Navbar",
    data(){
      return{
        intoBlackOli : ""
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
