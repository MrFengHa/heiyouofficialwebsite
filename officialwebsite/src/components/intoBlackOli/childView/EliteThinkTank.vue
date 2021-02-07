<template>
  <div class="mainbox">
    <div class="abuot_box"><p>
      <img :src="titleImagePath" alt="">
    </p>
      <p>
        <br>
      </p>
      <p>
        <br>
      </p>
      <p>
        &nbsp;&nbsp;&nbsp;&nbsp; 作为文化创意企业，<span style="font-size:32px;color:#E53333;">“脑力产能”</span>是<span style="color:#009900;"></span>黑油股份发展壮大的基本保障，也是我们创造价值的最大资本。<br>
        <br>
        &nbsp;&nbsp;&nbsp;&nbsp; 多年来，公司一方面通过持续的招贤纳士，吸收了北京电影学院、中国戏剧学院、中国传媒大学导演系/文学系/摄影系/编导系/动画系；清华、北大、人大、中央工艺美术学院、鲁美、中国建筑学院雕塑系/油画系/广告系等中国优秀高校的优秀毕业生，作为企业的中坚力量。<br>
        <br>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;另一方面，也通过各种合作形式，与上述院校以及清华同衡规划设计院、北京清尚建筑装饰工程有限公司的学者、专家建立了紧密的业务联系。<br>
        <br>
        <br>
        　　<span style="font-size:24px;">因此，我们运作的各种项目都能依托深厚的学术素养和充沛的艺术灵感。</span>
      </p></div>
  </div>
</template>

<script>
  import {baseUrl} from "../../../constJS";

  export default {
    name: "EliteThinkTank",
    data() {
      return {
        titleImagePath: baseUrl + "show/intoBlackOli/IntoBlackOil/EliteThinkTank/1.jpg",
      }
    },
    created() {
      this.$store.commit('setIntoBlackOilPage', 4)
    }
  }
</script>

<style scoped>
  .mainbox {
    width: 1000px;
    margin: 0 auto;
    overflow: hidden;
  }

  .abuot_box {
    font-size: 16px;
    color: #2e3136;
    line-height: 30px;
    font-family: microsoft yahei;
    padding-bottom: 50px;
    overflow: hidden;
    text-align: left;
  }
</style>
