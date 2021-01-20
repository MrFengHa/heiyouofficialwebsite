<template>
  <div class="sy_box_two">
    <div class="mainbox">
      <img src="../../assets/homePageRes/sy_box_two.jpg" style="max-width: 1000px;width: 100%">
      <ul class="nav_two">
        <li v-for="(casetype,index) in caseTypeData">
         <a href="http://www.baidu.com" @mouseover="setTab(index)" :class="currentIndex==index?'hover':''" >{{casetype.cnName}}\{{casetype.enName}}</a>
        </li>
      </ul>
    </div>

  </div>

</template>

<script>
  // function setTab(name,cursel,n){
  //   for(i=1;i<=n;i++){
  //     var menu=document.getElementById(name+i);
  //     var con=document.getElementById("con_"+name+"_"+i);
  //     menu.className=i==cursel?"hover":"";
  //     con.style.display=i==cursel?"block":"none";
  //   }
  // }
  export default {
    name: "ClassicCase",
    data() {
      return{
        caseTypeData:[],
        currentIndex:0
      }
    },
    methods:{
      findAllCaseType(){
        let _this = this;
        this.$http.get("casetype/findAll").then((res)=>{
        _this.caseTypeData =res.data.data.caseTypesList;
        })
      },
      setTab(index){
        this.currentIndex = index;
      }
    },
    created() {
      this.findAllCaseType();
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




  a {
    font-size: 11px;
    text-decoration: none;
    color: #666;
    blr: expression(this.onFocus=this.blur());
    outline: none;
  }
  a:-webkit-any-link {
    color: -webkit-link;
    cursor: pointer;
    text-decoration: underline;
  }






</style>
