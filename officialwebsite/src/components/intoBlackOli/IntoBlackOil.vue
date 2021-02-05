<template>
  <div>
    <carousel></carousel>
    <into-black-oil-button></into-black-oil-button>
    <router-view/>
  </div>

</template>

<script>


  import Carousel from "./Carousel";
  import IntoBlackOilButton from "./IntoBlackOilButton";
  export default {
    name: "IntoBlackOil",
    components: {IntoBlackOilButton, Carousel}
  }
</script>

<style scoped>
*{
  width: 1900px;
}
</style>
