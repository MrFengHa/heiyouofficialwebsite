// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import store from './store'
import { BootstrapVue, IconsPlugin } from 'bootstrap-vue'
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'
import 'element-ui/lib/theme-chalk/index.css';
import ElementUI from 'element-ui';
import axios from 'axios';

axios.defaults.baseURL = "http://localhost:8080/"; // 关键步骤–填写后台请求统一的地址
axios.defaults.headers.post['Content-Type'] = 'application/json;charset=UTF-8';

Vue.prototype.$http=axios;

Vue.use(ElementUI);
// Install BootstrapVue
Vue.use(BootstrapVue)
// Optionally install the BootstrapVue icon components plugin
Vue.use(IconsPlugin)

Vue.config.productionTip = false


/* eslint-disable no-new */

new Vue({
  el: '#app',
  router,
  store,
  render: h => h(App)
})
