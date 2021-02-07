<template>
  <div class="game163" style="margin:0 auto">

    <el-carousel class="bigImg" height="615px"  direction="vertical" :autoplay="true">
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
    name: "TeamBuilding",
    data(){
      return{
        imageArray :[
          {imagePath:baseUrl+"/show/intoBlackOli/IntoBlackOil/TeamBuilding/1.jpg",imageTitle:"团队建设"},
          {imagePath:baseUrl+"/show/intoBlackOli/IntoBlackOil/TeamBuilding/2.jpg",imageTitle:"团队建设"},
          {imagePath:baseUrl+"/show/intoBlackOli/IntoBlackOil/TeamBuilding/3.jpg",imageTitle:"团队建设"},
          {imagePath:baseUrl+"/show/intoBlackOli/IntoBlackOil/TeamBuilding/4.jpg",imageTitle:"团队建设"}
        ],
      }
    },
    created() {
      this.$store.commit('setIntoBlackOilPage',2)
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
