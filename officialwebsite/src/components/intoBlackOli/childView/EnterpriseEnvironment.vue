<template>
  <div class="game163" style="margin:0 auto">

    <el-carousel class="bigImg" height="600px"  direction="vertical" :autoplay="true">
      <el-carousel-item v-for="item in imageArray" :key="item.imagePath" >
       <img :src=item.imagePath>
        <h4 align="center">{{item.imageTitle}}</h4>
      </el-carousel-item>
    </el-carousel>

  </div>
</template>

<script>


  import {baseUrl} from "../../../constJS";

  export default {
    name: "EnterpriseEnvironment",
    data() {
      return {
        imageArray :[
          {imagePath:baseUrl+"/show/intoBlackOli/IntoBlackOil/EnterpriseEnvironment/1.jpg",imageTitle:"策划中心"},
          {imagePath:baseUrl+"/show/intoBlackOli/IntoBlackOil/EnterpriseEnvironment/2.jpg",imageTitle:"公司行政区"},
          {imagePath:baseUrl+"/show/intoBlackOli/IntoBlackOil/EnterpriseEnvironment/3.jpg",imageTitle:"公司历史墙"},
          {imagePath:baseUrl+"/show/intoBlackOli/IntoBlackOil/EnterpriseEnvironment/4.jpg",imageTitle:"公司文化墙"},
          {imagePath:baseUrl+"/show/intoBlackOli/IntoBlackOil/EnterpriseEnvironment/5.jpg",imageTitle:"接待大厅"},
          {imagePath:baseUrl+"/show/intoBlackOli/IntoBlackOil/EnterpriseEnvironment/6.jpg",imageTitle:"接待大厅"},
          {imagePath:baseUrl+"/show/intoBlackOli/IntoBlackOil/EnterpriseEnvironment/7.jpg",imageTitle:"平面事业部"},
          {imagePath:baseUrl+"/show/intoBlackOli/IntoBlackOil/EnterpriseEnvironment/8.jpg",imageTitle:"休闲区茶台"},
          {imagePath:baseUrl+"/show/intoBlackOli/IntoBlackOil/EnterpriseEnvironment/9.jpg",imageTitle:"影视历史设备陈列"},
          {imagePath:baseUrl+"/show/intoBlackOli/IntoBlackOil/EnterpriseEnvironment/10.jpg",imageTitle:"影视墙"},
          {imagePath:baseUrl+"/show/intoBlackOli/IntoBlackOil/EnterpriseEnvironment/11.jpg",imageTitle:"展览事业部"},
          {imagePath:baseUrl+"/show/intoBlackOli/IntoBlackOil/EnterpriseEnvironment/12.jpg",imageTitle:"作品查询"}
        ],

      }
    },
    created() {
      this.$store.commit('setIntoBlackOilPage',1)
    }
  }
</script>

<style scoped>
  * {
    padding: 0;
    margin: 0;
    list-style-type: none;
  }

  .game163 {
    position: relative;
    overflow: hidden;
    width: 1000px;
  }

  .game163 .bigImg {
    position: relative;
    width: 1000px;
  }

  .game163 .bigImg h4 {
    font-size: 16px;
    font-weight: 700;
    line-height: 33px;
    overflow: hidden;
    text-align: center;
    font-family: microsoft yahei;
  }

</style>
