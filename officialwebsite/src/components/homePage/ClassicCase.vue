<template>
  <div class="sy_box_two">
    <div class="mainbox">
      <img src="../../assets/homePageRes/sy_box_two.jpg" style="max-width: 1000px;width: 100%">
      <ul class="nav_two">
        <li v-for="(casetype,index) in caseTypeData">
          <a href="http://www.baidu.com" @mouseover="setTab(index,casetype.id)" :class="currentIndex==index?'hover':''">{{casetype.cnName}}\{{casetype.enName}}</a>
        </li>
      </ul>
      <ul class="box_two">
        <li v-for="item in showCaseData" :key="item.id" >
          <a href="www.baidu.com" :title="item.name">
            <img :src="'http://localhost:8080/case/'+item.name+'/1.jpg'">
            <span class="jies">{{item.name}}</span>
            <span class="alink">点击查看</span>
          </a>
        </li>
      </ul>
    </div>

  </div>

</template>

<script>

  export default {
    name: "ClassicCase",
    data() {
      return {
        caseTypeData: [],
        caseData:[],
        showCaseData:[],
        currentIndex: 0
      }
    },
    methods: {
      findAllCaseType() {
        let _this = this;
        this.$http.get("casetype/findAll").then((res) => {

          _this.caseTypeData = res.data.data.caseTypeList;

        })
      },
      findAllCase() {
        let _this = this;
        this.$http.get("case/findAll").then((res) => {

          _this.caseData = res.data.data.caseList;
          _this.setTab(0,12);
        })

      },
      setTab(index,id) {
        this.currentIndex = index;
        this.showCaseData.length = 0;
        //案例类型相同的显示到界面上
        for (let caseData of this.caseData){
          if (id==caseData.caseTypeId){
            this.showCaseData.push(caseData);

          }

        }

      }
    },
    created() {
      this.findAllCaseType();
      this.findAllCase();

    }
  }
</script>

<style scoped>
  div {
    display: block;
  }

  * {
    padding: 0;
    margin: 0;
    list-style-type: none;
  }


  .sy_box_two {
    width: 100%;
    margin: 0 auto;
    min-height: 476px;
    background-color: #313236;
    overflow: hidden;
  }

  .sy_box_two .mainbox {
    border-bottom: 6px solid #c30d23;
    padding-bottom: 30px;
  }

  .mainbox {
    width: 75%;
    margin: 0 auto;
    overflow: hidden;
    max-width: 1000px;
  }

  .sy_box_two .nav_two {
    width: 100%;
    max-width: 1000px;
    overflow: hidden;
  }

  ul, menu, dir {
    display: block;
    /*list-style-type: disc;*/
    margin-block-start: 1em;
    margin-block-end: 1em;
    margin-inline-start: 0px;
    margin-inline-end: 0px;
    padding-inline-start: 40px;
  }

  .sy_box_two .nav_two li {
    float: left;
    width: 25%;
    text-align: center;
    overflow: hidden;
  }

  li {
    display: list-item;
    text-align: -webkit-match-parent;
  }

  .sy_box_two .nav_two li a {
    float: left;
    width: 100%;
    height: 42px;
    line-height: 42px;
    border: 1px solid #e9edec;
    color: #fff;
    font-size: 20px;
    text-decoration: none;
    font-family: microsoft yahei;
    overflow: hidden;
  }


  .sy_box_two .nav_two li a.hover {
    float: left;
    width: 99%;
    height: 42px;
    line-height: 42px;
    background-color: #c30d23;
    border: 1px solid #c30d23;
    color: #fff;
    font-size: 20px;
    text-decoration: none;
    font-family: microsoft yahei;
    overflow: hidden;
  }




  .sy_box_two .box_two {
    width: 100%;
    max-width: 1000px;
    padding-top: 40px;
    overflow: hidden;
  }

  .sy_box_two .box_two li {
    float: left;
    width: 333px;
    font-family: microsoft yahei;
    text-align: center;
    color: #666;
    font-size: 14px;
    line-height: 18px;
  }

  .sy_box_two .box_two li a {
    width: 309px;
    background-color: #eaeeef;
    padding: 9px 7px;
    padding-bottom: 15px;
    margin: 0px 5px 40px 5px;
    display: block;
    font-family: microsoft yahei;
    font-size: 14px;
  }
  img {
    border: 0;
  }
  .sy_box_two .box_two li a img {
    border: 4px solid #eaeeef;
    margin: 0 auto;
    width: 300px;
    height: 169px;
  }

  .sy_box_two .box_two li .jies {
    padding: 10px 0px 5px;
    display: block;
    overflow: hidden;
  }

  a {
    font-size: 12px;
    text-decoration: none;
    color: #666;
    blr: expression(this.onFocus=this.blur());
    outline: none;
  }



  /*a:-webkit-any-link {*/
  /*  color: -webkit-link;*/
  /*  cursor: pointer;*/
  /*  text-decoration: underline;*/
  /*}*/

</style>
