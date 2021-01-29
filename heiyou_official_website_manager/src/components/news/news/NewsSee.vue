<template>
<div>
  <div v-html="news.news_Content"></div>
</div>
</template>

<script>
  export default {
    name: "NewsSee",
    data(){
      return{
        news:{}
      }
    },
    methods:{

    },
    created() {
      console.log(this.$route.params.news_Id)
      let _this = this;
      this.$http.get("news/getNewsById?news_Id="+this.$route.params.news_Id).then(res=>{
        _this.news = res.data.data.news;
        console.log(_this.news)
      })
    }
  }
</script>

<style scoped>

</style>
