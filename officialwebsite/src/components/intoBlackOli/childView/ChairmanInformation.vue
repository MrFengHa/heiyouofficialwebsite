<template>
  <div class="mainbox">
    <div class="abuot_box">
      <div class="wzbox">
        <div class="bta">
          <p align="center">
            <span class="f24 f-red"><img :src="titleImagePath" alt=""></span>
          </p>
          <p align="center">
			<span class="f24 f-red"><br>
</span>
          </p>
          <p>
            <span class="f24 f-red">黑油集团<span style="font-family:&quot;">董事长</span>— 杜鹃</span>
          </p>
          <p>
            <br>
            <span class="f24 f-red"></span>
          </p>
          <span class="f24 f-red"> </span>
        </div>
        <p style="text-align:justify;">
          <span style="line-height:1.5;">&nbsp; &nbsp;<span
            style="line-height:1.5;">&nbsp;&nbsp;&nbsp; </span></span><span
          style="line-height:1.5;font-family:'Microsoft YaHei';">杜鹃，毕业于中国传媒大学电视剧导演专业、清华大学EMBA专业双学位。现任黑油（北京）品牌服务机构、北京黑油数字展览股份有限公司</span><span
          style="line-height:1.5;font-family:'Microsoft YaHei';">、北京中艺今典国际文化传媒有限公司董事长、艺术总监。</span>
        </p>
        <p style="text-align:justify;">
		<span style="line-height:1.5;"><br>
</span>
        </p>
        <p style="text-align:justify;">
          <span style="line-height:1.5;font-family:'Microsoft YaHei';">&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; 曾任大庆电视台高级编辑，著名记者，影视剧导演。多部优秀作品曾在央视著名栏目播出。先后获得国际论文一等奖，纪录片分别获得国家级金牛奖等和省影视作品奖项。</span>
        </p>
        <p style="text-align:justify;">
		<span style="line-height:1.5;"><br>
</span>
        </p>
        <p style="text-align:justify;">
          <span style="line-height:1.5;font-family:'Microsoft YaHei';">&nbsp; &nbsp;&nbsp;&nbsp; 多年来，她以"百川不弃涓流细，高山能容块垒多"的事业情怀，聚川纳山，凝聚了一批行业精英，打造了一支创意精良、设计制作优异、执行实施高效的专业资深团队，成为业内的一支“精神标杆”。</span>
        </p>
        <p style="text-align:justify;">
		<span style="line-height:1.5;"><br>
</span>
        </p>
        <p style="text-align:justify;">
          <span style="line-height:1.5;font-family:'Microsoft YaHei';">&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; 逆水行舟，不进则退。公司成立二十年来，走过了由创业到发展到奠定行业坚实地位到从业辉煌的不凡历程。然而，她从不留恋于以往的成就，面对行业新的机遇和挑战，她依然以“诚信”来担负起对客户、员工以及社会的基本责任，努力创造着更多价值。</span>
        </p>
        <p style="text-align:justify;">
		<span style="line-height:1.5;"><br>
</span>
        </p>
        <p style="text-align:justify;">
          <span style="line-height:1.5;font-family:'Microsoft YaHei';">&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; 她坚信荣耀的背后是团结和付出、是真诚的携手；客户一句句的肯定、一声声的称赞，凝聚的是她对事业的执着追求，为了真正做到对客户项目规划的精准程度，她下到过深200米的煤矿深处，走到过苍茫无垠的大漠油井架上，也乘坐石油工程机跨海飞行。她率领的团队所做的这一切，都为了对客户需求专业化、个性化的解决方案精准到位物有所值。</span>
        </p>
        <p style="text-align:justify;">
		<span style="line-height:1.5;"><br>
</span>
        </p>
        <p style="text-align:justify;">
          <span style="line-height:1.5;font-family:'Microsoft YaHei';">&nbsp; &nbsp;&nbsp;&nbsp; 今天，杜鹃依然在品牌规划设计、影视精品策划制作行业孜孜不倦、追求不悔的路上努力奋进。</span>
        </p>
        <p style="text-align:justify;">
          <br>
        </p>
        <span class="f20">
	      <p style="text-align:justify;">
		      <span style="line-height:2.0;font-family:'Microsoft YaHei'; font-size: 20px">&nbsp; &nbsp;&nbsp; 相信她对客户和行业的真诚态度，以及精益求精的做事准则，</span><span
          class="f-red" style="line-height:1.5;font-family:'Microsoft YaHei';">一定会迎来更多的杜鹃花烂漫的璀璨景象。</span></p></span>
      </div>
    </div>

    <el-carousel :interval="3000" arrow="always">
      <el-carousel-item v-for="item in lifeImageArray" :key="item">
        <img :src="item">
      </el-carousel-item>
    </el-carousel>
    <div style="font-size:20px; color:#ff0000; font-weight:700; padding:25px 0; text-align:center">董事长杜鹃的出国考察和差旅生涯</div>
  </div>
</template>

<script>
  import {baseUrl} from "../../../constJS";

  export default {
    name: "ChairmanInformation",
    data() {
      return {
        titleImagePath: baseUrl + "show/intoBlackOli/IntoBlackOil/ChairmanInformation/1.jpg",
        lifeImageArray :[
          baseUrl+"show/intoBlackOli/IntoBlackOil/ChairmanInformation/lifeArray/1.jpg",
          baseUrl+"show/intoBlackOli/IntoBlackOil/ChairmanInformation/lifeArray/2.jpg",
          baseUrl+"show/intoBlackOli/IntoBlackOil/ChairmanInformation/lifeArray/3.jpg",
          baseUrl+"show/intoBlackOli/IntoBlackOil/ChairmanInformation/lifeArray/4.jpg",
          baseUrl+"show/intoBlackOli/IntoBlackOil/ChairmanInformation/lifeArray/5.jpg",
          baseUrl+"show/intoBlackOli/IntoBlackOil/ChairmanInformation/lifeArray/6.jpg",
          baseUrl+"show/intoBlackOli/IntoBlackOil/ChairmanInformation/lifeArray/7.jpg",
        ]
      }
    }
  }
</script>

<style scoped>
  * {
    padding: 0;
    margin: 0;
    list-style-type: none;
  }

  .mainbox {
    width: 1000px;
    margin: 0 auto;
    overflow: hidden;
    text-align: left;
  }

  .abuot_box {
    font-size: 16px;
    color: #2e3136;
    line-height: 30px;
    font-family: microsoft yahei;
    padding-bottom: 50px;
    overflow: hidden;

  }

  .f24 {
    font-size: 24px;
  }

  .f-red {
    color: #c00000;
  }
</style>
