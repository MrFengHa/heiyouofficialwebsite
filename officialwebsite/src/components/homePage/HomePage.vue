<template>
  <div>

    <!--页眉-->
    <carousel></carousel>
    <!--我们能为您提供什么服务-->
    <services></services>
    <!--经典案例-->
    <classic-case></classic-case>
    <!--我们的伙伴-->
    <our-partner></our-partner>

  </div>
</template>

<script>
  import Carousel from "./Carousel";
  import Services from "./Services";
  import ClassicCase from "./ClassicCase";
  import OurPartner from "./OurPartner";

  export default {
    name: "HomePage",
    components: { OurPartner, ClassicCase, Services, Carousel},
  }
</script>

<style scoped>

</style>
