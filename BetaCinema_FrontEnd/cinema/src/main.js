import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import vuetify from './plugins/vuetify'
import { loadFonts } from './plugins/webfontloader'
import "./assets/style.css"

import Vuesax from 'vuesax-alpha'

import 'vuesax-alpha/theme-chalk/index.css'
// dark mode
import 'vuesax-alpha/theme-chalk/dark/css-vars.css'

import "bootstrap";
import "bootstrap/dist/css/bootstrap.min.css";

// import { BootstrapVue, IconsPlugin } from 'bootstrap-vue'

// import 'bootstrap/dist/css/bootstrap.css'
// import 'bootstrap-vue/dist/bootstrap-vue.css'

// import { VueCarousel } from 'vue-carousel'
// import Swiper from 'swiper';
// import 'swiper/swiper-bundle.css';


import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome'
import { library } from '@fortawesome/fontawesome-svg-core'
import { faFacebook, faYoutube, faTiktok, faInstagram } from '@fortawesome/free-brands-svg-icons'

import axios from 'axios'

window.axios = axios

library.add(faFacebook, faYoutube, faTiktok, faInstagram)


loadFonts()

createApp(App)
  .use(router)
  .use(store)
  .use(vuetify)
  .use(Vuesax)
  // .use(VueCarousel)
  // .use(Swiper)
  // .use(BootstrapVue)
  // .use(IconsPlugin)
  .component('font-awesome-icon', FontAwesomeIcon)
  .mount('#app')
