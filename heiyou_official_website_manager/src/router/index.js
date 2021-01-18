import Vue from 'vue'
import Router from 'vue-router'
import MainView from "../components/MainView";
import CaseTypeList from "../components/caseManager/caseType/CaseTypeList";
import CaseTypeManager from "../components/caseManager/caseType/CaseTypeManager";

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'MainView',
      component: MainView,
      children: [
        {path: "/caseType/caseTypeList", component: CaseTypeList},
        {path: "/caseType/caseTypeToAdd", component: CaseTypeManager},
      ]
    }
  ]
})
