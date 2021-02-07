<template>
  <div style="height: 424px">
    <video :src="videoPath" autoplay="true" height="100%" width="1900px" loop>
      <!--      controls="controls"-->
      您的浏览器不支持视频播放，请您更换版本更高的浏览器，推荐使用谷歌浏览器
    </video>
  </div>
</template>

<script>
  import {baseUrl} from "../../constJS";

  export default {
    name: "Carousel",
    data() {
      return {
        videoPath:baseUrl+"show/homePage/Carousel/video.mp4"
      }
    }
  }
</script>

<style scoped>

</style>
