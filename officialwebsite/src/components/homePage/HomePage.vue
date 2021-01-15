<template>
  <div>

    <!--页眉-->
    <carousel></carousel>
    <!--我们能为您提供什么服务-->
    <services></services>
    <!--经典案例-->
    <classic-case></classic-case>
  </div>
</template>

<script>
  import Carousel from "./Carousel";
  import Services from "./Services";
  import ClassicCase from "./ClassicCase";
  export default {
    name: "HomePage",
    components: {ClassicCase, Services, Carousel},
  }
</script>

<style scoped>

</style>
