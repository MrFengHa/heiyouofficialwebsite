import Vue from 'vue'
import Router from 'vue-router'
import MainView from "../components/MainView";
import CaseTypeList from "../components/caseManager/caseType/CaseTypeList";
import CaseTypeManager from "../components/caseManager/caseType/CaseTypeManager";
import CaseList from "../components/caseManager/case/CaseList";
import CaseManager from "../components/caseManager/case/CaseManager";
import InformationList from "../components/information/InformationList";
import NewsTypeList from "../components/news/newsType/NewsTypeList";
import NewTypeManager from "../components/news/newsType/NewTypeManager";
import NewsList from "../components/news/news/NewsList";
import NewsManager from "../components/news/news/NewsManager";
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
        {path: "/case/caseList", component: CaseList},
        {path: "/case/caseToAdd", component: CaseManager},
        {path: "/information/informationList", component: InformationList},
        {path: "/newsType/newsTypeList", component: NewsTypeList},
        {path: "/newsType/newsTypeToAdd", component: NewTypeManager},
        {path: "/newsType/newsTypeToUpdate/:newsType_id", component: NewTypeManager},
        {path: "/news/newsList", component: NewsList},
        {path: "/news/newsToAdd", component: NewsManager},
      ]
    }
  ]
})
