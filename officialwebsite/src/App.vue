<template>
  <div id="app" style="text-align: center">
    <!--导航栏-->
    <navbar style=" max-width: 1900px;"></navbar>
    <router-view/>

    <!--新闻-->
    <news></news>
    <!--底部-->
    <fooder></fooder>
  </div>
</template>

<script>
  import Navbar from "./components/Navbar";
  import News from "./components/News";
  import Fooder from "./components/Fooder";
  export default {
    name: 'App',

  components: { Navbar,News,Fooder},

  }
</script>

<style>
  .video-js .vjs-big-play-button{}
  div{
    width:100%;    /*宽度设置固定值*/
    margin:0 auto;

  }

  body {
    text-align: left;
  }
</style>
