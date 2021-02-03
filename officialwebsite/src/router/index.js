import Vue from 'vue'
import Router from 'vue-router'
import HomePage from "../components/homePage/HomePage";
import IntoBlackOil from "../components/intoBlackOli/IntoBlackOil";

Vue.use(Router)

export default new Router({
  routes: [
    {path: '/', component: HomePage},
    {path: '/intoBlackOli', component: IntoBlackOil}
  ]
})
