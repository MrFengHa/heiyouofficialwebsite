<template>
  <div class="mainbox clear30">
    <div class="ej_news_main"><h1 class="title">{{customerWitness.customerWitness_Title}}</h1>
      <div class="xspan">
        <div class="lf time"><span>新闻来源：</span>| <span> 发布时间：{{customerWitness.customerWitness_CreateTime}}</span></div>
      </div>
      <div class="box" v-html="customerWitness.customerWitness_Content">
        <div>
          <br>
        </div>
      </div>
      <div class="spanb"><span class="lf">
        <strong>上一篇：</strong><a :href="prev.href">{{prev.title}}</a></span><span class="rf">
        <strong>下一篇：</strong><a :href="next.href">{{next.title}}</a></span></div>
    </div>
  </div>
</template>

<script>
  export default {
    name: "CustomerWitnessArticle",
    data() {
      return {
        customerWitness: {},
        customerWitnessList: [],
        prev: {
          title: "",
          href: ""
        },
        next: {
          title: "",
          href: ""
        },
        currentIndex:0,
        maxIndex:0

      }
    },
    methods:{
      prev(){

      },
      next(){

      }
    },
    created() {
      let _this = this;
      this.$http.get("intoBlackOilCustomerWitness/findArticleById?customerWitness_Id=" + this.$route.query.customerWitness_Id).then(res => {
        _this.customerWitness = res.data.data.customerWitness;
      })
      this.$http.get("intoBlackOilCustomerWitness/getAllCustomerWitness").then(res => {
        _this.customerWitnessList = res.data.data.customerWitnesses;
        _this.maxIndex=_this.customerWitnessList.length-1
        for(let i = 0;i<_this.customerWitnessList.length;i++){
          if (_this.customerWitness.customerWitness_Id==_this.customerWitnessList[i].customerWitness_Id){
            _this.currentIndex = i;

          }
        }

        if (this.currentIndex==0){
          this.prev.title="无";
          this.prev.href = "#";
        }else{
          this.prev.title=this.customerWitnessList[this.currentIndex-1].customerWitness_Title;
          this.prev.href = '#/intoBlackOilCustomerWitness/showArticle?customerWitness_Id='+this.customerWitnessList[this.currentIndex-1].customerWitness_Id;
        }
        if (this.currentIndex==this.maxIndex){
          this.next.title="无";
          this.next.href = "#";
        }else{
          this.next.title=this.customerWitnessList[this.currentIndex+1].customerWitness_Title;
          this.next.href = '#/intoBlackOilCustomerWitness/showArticle?customerWitness_Id='+this.customerWitnessList[this.currentIndex+1].customerWitness_Id;
        }



      })

    }
  }
</script>

<style scoped>
  .clear30 {
    margin-top: 30px;
    overflow: hidden;
  }

  .mainbox {
    width: 1000px;
    margin: 0 auto;
    overflow: hidden;
  }

  .ej_news_main {
    width: 1000px;
    padding: 30px 0px;
    border-top: 2px solid #ddd;
    margin-top: 5px;
    overflow: hidden;
  }

  .ej_news_main .title {
    text-align: left;
    font: 700 16px/2 "simsun";
    padding-bottom: 0px;
    overflow: hidden;
  }

  .ej_news_main .xspan {
    width: 100%;
    height: 30px;
    line-height: 30px;
    text-align: center;
    color: #666;
  }

  .time {
    text-align: left;
    font-size: 12px;
  }

  .lf {
    float: left;
  }

  .rf {
    float: right;
  }

  .ej_news_main .box {
    font: 14px/30px Arial, Helvetica, sans-serif;
    padding: 50px 0;
    color: #333;
    text-align: justify;
  }

  .ej_news_main .spanb {
    width: 1000px;
    padding: 25px 0;
    line-height: 40px;
    background: url(../../../assets/intoBlackOil/x.gif) repeat-x left top;
    color: #999;
    overflow: hidden;
  }

  .ej_news_main .spanb span a {
    color: #999;
  }


</style>
