import Vue from 'vue'
import Router from 'vue-router'
import HomePage from "../components/homePage/HomePage";
import IntoBlackOil from "../components/intoBlackOli/IntoBlackOil";
import GroupProfile from "../components/intoBlackOli/childView/GroupProfile";
import EnterpriseEnvironment from "../components/intoBlackOli/childView/EnterpriseEnvironment";
import TeamBuilding from "../components/intoBlackOli/childView/TeamBuilding";
import ChairmanInformation from "../components/intoBlackOli/childView/ChairmanInformation";
Vue.use(Router)

export default new Router({
  routes: [
    {path: '/', component: HomePage},
    {
      path: '/intoBlackOli', component: IntoBlackOil,
      children: [
        {path: "/intoBlackOli/groupProfile", component: GroupProfile},
        {path: "/intoBlackOli/enterpriseEnvironment", component: EnterpriseEnvironment},
        {path: "/intoBlackOli/teamBuilding", component: TeamBuilding},
        {path: "/intoBlackOli/ChairmanInformation", component: ChairmanInformation},
      ]
    }
  ]
})
