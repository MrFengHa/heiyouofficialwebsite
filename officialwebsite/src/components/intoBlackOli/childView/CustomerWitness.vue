<template>
  <div class="mainbox">
    <div class="block">
      <el-carousel height="563px">
        <el-carousel-item v-for="item in lifeImageArray" :key="item">
          <img :src="item" style="width: 100%">
        </el-carousel-item>
      </el-carousel>
    </div>

    <div class="ej_xzdt_tj" style="margin-top:50px;">
      <ul>
        <li v-for="(item,index) in customerWitnesses" :key="index"><a :href="'#/intoBlackOilCustomerWitness/showArticle?customerWitness_Id='+item.customerWitness_Id" :title="item.customerWitness_Title">
          <!--          :class="index%2==0?'write':''"-->
          <img :src="baseUrlPath+item.customerWitness_CoverUrl" width="430"
               height="190" :alt="item.customerWitness_Title"></a>
          <div class="rf_wz"><p><a :href="'#/intoBlackOilCustomerWitness/showArticle?customerWitness_Id='+item.customerWitness_Id" :title="item.customerWitness_Title" class="f-666 f14 f-wh">{{item.customerWitness_Title}}</a>
          </p>
            <p style="font-size: 12px">新闻来源： | {{item.customerWitness_CreateTime}}</p>
            <p class="clear10 line-18 f-999" v-html="item.customerWitness_Content">
            </p>
          </div>
        </li>
      </ul>
    </div>
  </div>
</template>

<script>
  import {baseUrl} from "../../../constJS";

  export default {
    name: "CustomerWitness",
    data() {
      return {
        titleImagePath: baseUrl + "show/intoBlackOli/IntoBlackOil/CustomerWitness/1.jpg",
        lifeImageArray: [
          baseUrl + "show/intoBlackOli/IntoBlackOil/CustomerWitness/1.jpg",
          baseUrl + "show/intoBlackOli/IntoBlackOil/CustomerWitness/2.jpg",
          baseUrl + "show/intoBlackOli/IntoBlackOil/CustomerWitness/3.jpg",
          baseUrl + "show/intoBlackOli/IntoBlackOil/CustomerWitness/4.jpg",
          baseUrl + "show/intoBlackOli/IntoBlackOil/CustomerWitness/5.jpg",
          baseUrl + "show/intoBlackOli/IntoBlackOil/CustomerWitness/6.jpg",
        ],
        baseUrlPath: baseUrl,
        customerWitnesses: []
      }
    },
    created() {
      let _this = this;
      this.$http.get("intoBlackOilCustomerWitness/getAllCustomerWitness").then(res => {
        _this.customerWitnesses = res.data.data.customerWitnesses;
      })


    }
  }
</script>

<style scoped>
  .mainbox {
    width: 1000px;
    margin: 0 auto;
    overflow: hidden;
  }

  .ej_xzdt_tj {
    width: 1000px;
    overflow: hidden;
  }

  .ej_xzdt_tj ul {
    width: 1000px;
    padding-bottom: 15px;
    overflow: hidden;
  }

  .ej_xzdt_tj ul li {
    width: 960px;
    padding: 20px;
    border-top: 1px solid #d9d9d9;
    overflow: hidden;
  }

  a {
    font-size: 12px;
    text-decoration: none;
    color: #666;
    blr: expression(this.onFocus=this.blur());
    outline: none;
  }

  .ej_xzdt_tj ul li img {
    float: left;
    width: 350px;
    height: 197px;
  }

  .ej_xzdt_tj ul li .rf_wz {
    float: right;
    width: 550px;
    color: #666;
    overflow: hidden;
    margin-left: 10px;
    text-align: left;
  }

  .write {
    background-color: rgb(240, 240, 240);
  }

  a.f-666 {
    color: #666;
  }

  a.f-wh {
    font-weight: 700;
  }

  a.f14 {
    font-size: 14px;
  }

  .f14 {
    font-size: 14px;
  }

  p {
    font-size: 12px;

    height: 50px; /* 是line-height的三倍bai，如du果设置了padding属性，也要zhi加dao上padding的高度*/
    overflow: hidden;
  }


  .f-wh {
    font-weight: 700;
  }

  .f-666 {
    color: #666;
  }

  .line-18 {
    line-height: 18px;
  }

  .f-999 {
    color: #999;
  }

  .clear10 {
    margin-top: 10px;
    overflow: hidden;
  }

  .clear10 p:after {
    content: "...";
  }

  * {
    padding: 0;
    margin: 0;
    list-style-type: none;
  }
</style>
