<template>
  <div id="app" style="text-align: center">
    <!--    <img src="./assets/logo.png">-->
    <router-view/>
  </div>
</template>

<script>
  export default {
    name: 'App',

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
