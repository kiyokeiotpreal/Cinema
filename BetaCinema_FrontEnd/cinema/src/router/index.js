import { createRouter, createWebHistory } from 'vue-router'
import Login from '@/components/Login'
import Home from '@/pages/Home'



const routes = [
  {
    path: '/',
    component: Home
  },

  {
    path: '/login',
    component: Login
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
