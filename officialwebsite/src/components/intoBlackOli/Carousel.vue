<template>
  <el-carousel :interval="5000" arrow="always" height="400px">
    <el-carousel-item v-for="(item,index) in imagePath" :key="index">
     <img :src="item"/>
    </el-carousel-item>
  </el-carousel>
</template>

<script>
  import {baseUrl} from "../../constJS";
    export default {
        name: "Carousel",
      data() {
        return {
          imagePath: [
            baseUrl + "show/intoBlackOli/Carousel/1.jpg",
            baseUrl + "show/intoBlackOli/Carousel/2.jpg",
            baseUrl + "show/intoBlackOli/Carousel/3.jpg",
            baseUrl + "show/intoBlackOli/Carousel/4.jpg",
            baseUrl + "show/intoBlackOli/Carousel/5.jpg",
            baseUrl + "show/intoBlackOli/Carousel/6.jpg",
          ]
        }
      }
    }
</script>

<style scoped>

</style>
