<template>
  <div class="ej_back">
    <div class="mainbox clear30"><img :src="titleImgPath" width="1000" height="225"
                                      alt="走进黑油">
      <ul class="nav_zoujin">
        <li v-for="(item,index) in buttonValue" :key="index"><a :href="item.hrefPath" :title="item.name"
                                                                @mouseover="hoverSetTab(index)"
                                                                @click="clickSetTab(index)"
                                                                @mouseout="remSetHab(index)"
                                                                :class="$store.getters.getIntoBlackOilPageNum==index||currentIndex==index?'hover':'' "
                                                                >{{item.name}}</a>
        </li>
      </ul>
    </div>
  </div>
</template>

<script>
  import {baseUrl} from "../../constJS"

  export default {
    name: "IntoBlackOilButton",
    data() {
      return {
        titleImgPath: baseUrl + "show/intoBlackOli/IntoBlackOil/about_img1.jpg",
        buttonValue: [
          {name: "集团概况", hrefPath: "#/intoBlackOli/groupProfile"},
          {name: "企业环境", hrefPath: "#/intoBlackOli/enterpriseEnvironment"},
          {name: "团队建设", hrefPath: "#/intoBlackOli/teamBuilding"},
          {name: "董事长介绍", hrefPath: "#"},
          {name: "精英智库", hrefPath: "#"},
          {name: "客户见证", hrefPath: "#"},
        ],

        currentIndex: 0
      }
    },
    methods: {
      /**
       * 鼠标悬浮在标签上
       * @param index
       */
      hoverSetTab(index) {
        this.currentIndex = index;
      },
      /**
       * 鼠标点击标签
       * @param index
       */
      clickSetTab(index){
        this.$store.commit('setIntoBlackOilPage',index)
      },

      /**
       * 鼠标离开标签
       */
      remSetHab(){
        this.currentIndex =99;
      }

    }
  }
</script>

<style scoped>
  .ej_back {
    width: 1900px;
    margin: 0 auto;
    background: #e6e6e6;
    overflow: hidden;
  }

  .clear30 {
    margin-top: 30px;
    overflow: hidden;
  }

  .mainbox {
    width: 1000px;
    margin: 0 auto;
    overflow: hidden;
  }

  .ej_back .nav_zoujin {
    width: 1000px;
    border-left: 1px solid #333;
    margin-bottom: 50px;
    margin-left: 0px;
    padding-left: 0;
    overflow: hidden;
  }

  .ej_back .nav_zoujin li {
    float: left;
    width: 166px;
    text-align: center;
    overflow: hidden;
  }

  .ej_back .nav_zoujin li a.hover {
    background-color: #c30d23;
    border: 1px solid #c30d23;
    border-left: 0px;
    color: #fff;
    text-decoration: none;
    overflow: hidden;
  }

  .ej_back .nav_zoujin li a {
    float: left;
    width: 165px;
    height: 50px;
    line-height: 50px;
    border: 1px solid #333;
    border-left: 0px;
    color: #333;
    font-size: 22px;
    text-decoration: none;
    font-family: microsoft yahei;
    overflow: hidden;
  }

  a {
    font-size: 12px;
    text-decoration: none;
    color: #666;
    blr: expression(this.onFocus=this.blur());
    outline: none;
  }

</style>
