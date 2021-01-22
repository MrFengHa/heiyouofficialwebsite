<template>


  <div id="fooder">
    <div class="zp_food">
      <div class="wzxx">
        <p style=" font: 12px/2 simsun, Tahoma, Helvetica, Arial, sans-serif;">全国统一服务热线</p>
        <p class="tel">TEL:010-62015772</p>
        <p class="line-20">
          北京黑油数字展览股份有限公司
          成立于1988年，是一家专业化很高的的品牌服务机构，拥有平面、影视、展览三大板块，由于展览设计在运作方式和管理模式方面存在独特性，为提高管理和服务水平，2012年公司将展览展示业务板块拆分出来，单独成了了黑油展览展示公司。
          <br>
          定位与专业化集成展览展示设计施工服务商
          <br>
          目前公司实际拥有丑人和黑油两大品牌
        </p>

      </div>
      <dl class="wmfw">
        <dt>我们的服务</dt>

        <dd><a href="www.baidu.com" title="展览展示">展览展示</a></dd>
        <dd><a href="www.baidu.com" title="品牌视觉">品牌视觉</a></dd>
        <dd><a href="www.baidu.com" title="影视作品">影视作品</a></dd>
        <dd><a href="www.baidu.com" title="数字虚拟展馆">数字虚拟展馆</a></dd>
      </dl>
      <div class="sy_lxwm">
        <dt>联系我们</dt>
        <dd>
          地址：北京市西城区安德路112号124室
          <br>
          电话:010-62015772
          <br>
          邮编:100011
          <br>
          邮箱：bjcr1000@126.com
          <br>
          QQ:767038992
        </dd>
        <dd>
          <a target="_blank" href="http://wpa.qq.com/msgrd?v=3&uin=924459&site=qq&menu=yes" @click.prevent="noFunction()">
            <img border="0" src="http://wpa.qq.com/pa?p=2:924459:51" alt="点击这里给我发消息" title="点击这里给我发消息" data-bd-imgshare-binded="1">
          </a>
        </dd>
      </div>
      <div class="syewm">
        <img src="../../assets/homePageRes/webeqcode.jpg" width="92" height="92" alt data-bd-imgshare-binded="1">
          官方网站
        <img src="../../assets/homePageRes/wxeqcode.jpg" width="92" height="92" alt data-bd-imgshare-binded="1">
          官方微信
      </div>
      <div class=""></div>
    </div>
    <div class="zp_db">
      <div class="mainbox">
        1988 ©北京黑油数字展览股份有限公司 All Right Reserved&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="http://beian.miit.gov.cn" target="_blank"
           style="color:#fff;font-size:14px;float:none;">京ICP备19029976号</a>
      </div>
    </div>
  </div>

</template>

<script>
  export default {
    name: "Fooder",
    data(){
      return{

      }
    },
    methods:{
      noFunction(){
        this.$message({
            message: "该功能正在研发中........",
            type: 'info',
          }
        )
      }
    }
  }
</script>

<style scoped>


  div {
    display: block;
  }

  #fooder {
    width: 1900px;
    margin: 0 auto;
    overflow: hidden;
    background: #636363;
    color: #fff;
    font-family: microsoft yahei;
  }

  /******************************************************************************************/
  #fooder .zp_food {
    width: 1000px;
    margin: 0 auto;
    padding: 30px 0;
    overflow: hidden;
  }

  #fooder .zp_db {
    width: 100%;
    background-color: #1b1b1b;
    height: 50px;
    line-height: 50px;
    overflow: hidden;
    text-align: center;
    font-size: 14px;
    font-family: microsoft yahei;
    color: #fff;
  }

  #fooder .wzxx {
    text-align: left;
    float: left;
    width: 283px;
    padding-right: 30px;
    border-right: 1px solid #b1b1b1;
  }


  p {
    display: block;
    margin-block-start: 1em;
    margin-block-end: 1em;
    margin-inline-start: 0px;
    margin-inline-end: 0px;
    margin: 0;

  }

  #fooder .wzxx .tel {
    font: 26px/1 microsoft yahei;
    padding: 10px 0px 20px;
    margin: 0;
  }

  .line-20 {
    line-height: 10px;
    font: 12px/2 simsun, Tahoma, Helvetica, Arial, sans-serif;
  }

  /******************************************************************************************/
  /******************************************************************************************/
  #fooder .wmfw {
    text-align: left;
    float: left;
    padding: 0 30px;
    border-right: 1px solid #b1b1b1;
    margin: 0;
  }

  dl {
    display: block;
    margin-block-start: 1em;
    margin-block-end: 1em;
    margin-inline-start: 0px;
    margin-inline-end: 0px;
  }

  #fooder .wmfw dt {
    font: 18px/1 microsoft yahei;
    padding: 10px 0px 20px;
  }

  dd {
    display: block;
    margin-inline-start: 40px;
    font-size: 12px;
    margin: 0;
    padding: 0px 0px 7px;

  }

  #fooder .zp_food a {
    color: #fff;
  }

  a {
    font-size: 12px;
    text-decoration: none;
    color: #666;
    blr: expression(this.onFocus=this.blur());
    outline: none;
  }

  /*****************************************************************************************/
  #fooder .sy_lxwm {
    text-align: left;
    float: left;
    width: 165px;
    padding: 0 25px;
    border-right: 1px solid #b1b1b1;
  }

  #fooder .sy_lxwm dt {
    font: 18px/1 microsoft yahei;
    padding: 10px 0px 20px;
  }

  /*******************************************************************************************/

  #fooder .syewm {
    float: left;
    width: 92px;
    text-align: center;
    margin-left: 25px;
    font: 12px/2 simsun, Tahoma, Helvetica, Arial, sans-serif;
    text-align: center;
  }

  #fooder .syly {
    float: right;
    width: 208px;
    overflow: hidden;
  }

  .mainbox {
    width: 1000px;
    margin: 0 auto;
    overflow: hidden;
  }
</style>
