<template>
  <div>
    <!--导航栏-->
    <navbar></navbar>
   <home-page></home-page>
  </div>
</template>


<script>
  import Navbar from "./homePage/Navbar";
  import HomePage from "./homePage/HomePage";



  export default {
    name: "Main",
    components: {HomePage, Navbar},
  }
</script>

<style scoped>
  *{
    max-width: 1900px;
  }
</style>
