<template>
  <div class="sy_box_three">
    <div class="sy_box_three">
      <div class="mainbox">
        <div class="lfwz_three">
          <img src="../../assets/homePageRes/sy_three_1.jpg"/>
          黑油企业二十年服务于中国三大石油、中国中铁、中国建筑等国字头国有大型特大型企业，足迹遍布祖国的山山水水，成为服务国资委直属企业的一匹黑马。在攀登数字展览设计和科技馆创意规划设计的征途上，黑油企业秉承“精确完美，诚实守信”的服务理念，在市场开发和业务延伸方面坚持做到，合作一个企业，创建一个品牌的从业守则，已成为业界一道亮丽的景色。
          <br>
          <br>
          电话:
          <span class="f-red">010-62015772</span>
          &nbsp;&nbsp;&nbsp;邮箱:
          <span class="f-red">bjcr1000@126.com</span>
        </div>
        <div class="tmall-brand" style="margin:140px auto 0">
          <div style="overflow:hidden; position:relative; width:600px">
            <el-carousel :interval="5000" arrow="never" height="425px">
              <el-carousel-item v-for="(item,index) in ourList" :key="index" >
               <img width="550px"  :src="item">
              </el-carousel-item>
            </el-carousel>
          </div>

        </div>
      </div>
    </div>

  </div>
</template>

<script>
import {baseUrl} from "../../constJS";

export default {
    name: "OurPartner",
    data(){
      return{
        ourList:[ baseUrl+"show/ourPartner/PAGE1.jpg",baseUrl+"show/ourPartner/PAGE2.jpg",baseUrl+"show/ourPartner/PAGE3.jpg"]
      }
    }
  }
</script>

<style scoped>
  .f-red {
    color: #c00000;
  }
  .sy_box_three {
    width: 1900px;
    margin: 0 auto;
    background: #dadcdb;
    padding-bottom: 50px;
    overflow: hidden;
  }

  * {
    padding: 0;
    margin: 0;
    list-style-type: none;
  }

  .mainbox {
    width: 1000px;
    margin: 0 auto;
    overflow: hidden;
  }

  .sy_box_three .lfwz_three {
    text-align: left;
    float: left;
    width: 400px;
    font: 16px/30px microsoft yahei;
    overflow: hidden;
  }

  img {
    border: 0;
  }

  .tmall-brand {
    float: right;
    position: relative;
    height: 500px;
    width: 575px;
    padding-top: 50px;
    padding-bottom: 20px;
    overflow: hidden;
  }


</style>
