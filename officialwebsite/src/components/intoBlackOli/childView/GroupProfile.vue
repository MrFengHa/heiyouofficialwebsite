<template>
  <div>
    <h1>集团概况</h1>
    <h1>{{$store.state.intoBlackOilPage}}111</h1>
  </div>

</template>

<script>
    export default {
        name: "GroupProfile",
      created() {
        console.log(this.$store.state.getters.getIntoBlackOilPageNum)
      }
    }
</script>

<style scoped>

</style>
