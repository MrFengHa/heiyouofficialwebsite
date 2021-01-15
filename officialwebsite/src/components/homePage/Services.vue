<template>
  <div class="sy_box_onebj">
    <div class="sy_box_one">
      <img src="../../assets/homePageRes/sy_box_bj1.jpg" style="max-width: 1000px;width: 100%" alt="网络连接错误-加载失败">
      <div class="service" >
        <div>
          <img src="../../assets/homePageRes/sy_onebox_1.jpg" width="225" height="140" alt="网络连接错误-加载失败">
          <p class="bt">展馆规划</p>
          数字展览和科技馆设计的创意革命
          <br>
          "为客户把航展览展示设计的大未来"
          <a href="#" class="more"></a>
        </div>

        <div>
          <img src="../../assets/homePageRes/sy_onebox_2.jpg" width="225" height="140" alt="网络连接错误-加载失败">
          <p class="bt">VR与AR</p>
          拒绝平庸的平面设计，
          <br>
          潮流的视觉艺术。
          <a href="#" class="more"></a>
        </div>
        <div>
          <img src="../../assets/homePageRes/sy_onebox_3.jpg" width="225" height="140" alt="网络连接错误-加载失败">
          <p class="bt">数字多媒体</p>
          镜头记录和展示您的形象，
          <br>
          影像传播和提升您的风采。
          <a href="#" class="more"></a>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
  export default {
    name: "Services"
  }
</script>

<style scoped>
  .sy_box_onebj {
    width: 100%;
    margin-top: -6px;
    background-color: #e6e6e6;
    overflow: hidden;
    list-style-type: none;
  }

  .sy_box_one {
    width: 75%;
    margin: 0 auto;
    padding-bottom: 70px;
    overflow: hidden;
  }

  .service{
    width: 100%;
    margin: 0px auto;
    max-width: 1000px;
  }
  .service div img {
    display: inline;

  }

  .service div .bt {
    font-weight: 700;
    color: #e11425;
    font-size: 26px;
    padding: 25px 0;
  }

  a {
    font-size: 12px;
    text-decoration: none;
    color: #666;
    blr: expression(this.onFocus=this.blur());
    outline: none;
  }

  * {
    padding: 0;
    margin: 0;
  }

  .service div {
    float: left;
    width: 33.33%;
    font-family: microsoft yahei;
    text-align: center;
    color: #666;
    font-size: 16px;
    line-height: 20px;
    min-width: 250px;
  }

  .service div a.more {
    background: url(../../assets/homePageRes/sy_onebox_a.jpg) no-repeat;
    width: 42px;
    height: 42px;
    display: block;
    margin: 15px auto 0;
    text-decoration: none;
  }
</style>
