<template>
  <div>
    <carousel></carousel>
    <into-black-oil-button></into-black-oil-button>
    <div class="ej_back">
      <router-view/>
    </div>


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

.ej_back {
  width: 1900px;
  margin: 0 auto;
  background: #e6e6e6;
  overflow: hidden;
}
</style>
