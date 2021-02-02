<template>
  <div class="sy_news_box">
    <div class="mainbox">
      <div class="sy_news">
        <div class="title">> 公司动态</div>
        <div class="box">
          <ul>
            <li><b>·</b> &nbsp<a href="/index.php?m=view&a=index&aid=263" title="董事长杜鹃彰显强大信心，黑油股份成长空间广阔">董事长杜鹃彰显强大信心，黑油股份成长空间广阔</a>
            </li>
          </ul>
        </div>
      </div>
      <div class="sy_news" style="padding:0 20px"></div>
      <div class="sy_news"></div>
    </div>
  </div>
</template>

<script>
  export default {
    name: "News",
    created() {
          this.$http.get("news/findByNewTypeName")
    }
  }
</script>

<style scoped>
  .sy_news_box {
    width: 1900px;
    margin: 0 auto;
    background-color: #45464b;
    padding: 15px 0;
  }

  .mainbox {
    width: 1000px;
    margin: 0 auto;
    overflow: hidden;
  }

  .sy_news {
    float: left;
    width: 320px;
    margin: 30px 0;
    overflow: hidden;
  }

  .sy_news .title {
    text-align: left;
    height: 25px;
    line-height: 25px;
    background: url(../../assets/homePageRes/sy_news_tlbj.jpg) no-repeat 245px center #c30d23;
    color: #fff;
    font-size: 14px;
    font-weight: 700;
    padding: 0 10px;
    font-family: microsoft yahei;
    overflow: hidden;
  }

  .sy_news .box {
    width: 316px;
    padding: 10px 0 10px 4px;
    color: #ededed;
    overflow: hidden;
  }

  .sy_news .box ul {
    padding: 10px 0;
    font-size: 14px;
    overflow: hidden;
  }

  .sy_news .box ul li {
    float: left;
    width: 305px;
    height: 24px;
    line-height: 24px;
    white-space: nowrap;
    text-overflow: ellipsis;
    text-overflow: ellipsis;
    -ms-text-overflow: ellipsis;
    -o-text-overflow: ellipsis;
    overflow: hidden;
  }

  .sy_news .box ul li a {
    font: 14px/20px microsoft yahei;
    color: #ededed;
  }

  a {
    font-size: 12px;
    text-decoration: none;
    color: #666;
    blr: expression(this.onFocus=this.blur());
    outline: none;
  }
</style>
