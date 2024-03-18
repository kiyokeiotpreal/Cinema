
<template>


      <div>

    <div class="hidden md:block " style="width: 100%; height: 30px;">
            <div class="ml-4 flex items-center md:ml-6 " style="float: right ; ">
              <router-link to="/login"><vs-button style="height: 25px;" type="gradient" :active="active == 0" @click="showLogin"> Đăng nhập </vs-button></router-link>
              <router-link to="/login"><vs-button style="height: 25px;" type="gradient" :active="active == 0" @click="showSignUp"> Đăng ký </vs-button></router-link>
            </div>
      </div>

           <Disclosure as="nav" class="bg-gray-800 justify-center " v-slot="{ open }" style="height:120px; width: 100%;">
        <div class="row flex h-16 items-center justify-center col-xl-12 col-lg-12 col-md-10" style="">
            <div class="flex-shrink-0 col-xl-3 col-sm-12  col-lg-8 xl:justify-center  justify-center" style="display: flex; align-items: center;" >
              <img class="h-8 w-8 ml-5" src="logo.png" alt="Your Company" style="height:auto; width: auto;"/>

              <div class="center con-selects" style="">
                <vs-select v-model="value" placeholder="Select">
                  <vs-option label="Vuesax" value="1"> Vuesax </vs-option>
                  <vs-option label="Vue" value="2"> Vue </vs-option>
                  <vs-option label="Javascript" value="3"> Javascript </vs-option>
                  <vs-option disabled label="Sass" value="4"> Sass </vs-option>
                  <vs-option label="Typescript" value="5"> Typescript </vs-option>
                  <vs-option label="Nodejs" value="7"> Nodejs </vs-option>
                </vs-select>
              </div>
              
            </div>


            <div class="hidden lg:block col-xl-9 col-lg-12" >
              <div class="ml-10 flex items-baseline space-x-4 justify-center mt-1" style="width: 100%;">
                <a v-for="item in navigation" :key="item.name" :href="item.href" :class="[item.current ? 'bg-gray-900 text-white' : 'text-gray-300 hover:bg-gray-700 hover:text-white', 'rounded-md px-3 py-2 text-sm font-medium']" :aria-current="item.current ? 'page' : undefined">{{ item.name }}</a>
              </div>
            </div>
          <div class="-mr-2 flex lg:hidden">
            <!-- Mobile menu button -->
            <DisclosureButton class="relative inline-flex items-center justify-center rounded-md bg-gray-800 p-2 text-gray-400 hover:bg-gray-700 hover:text-white focus:outline-none focus:ring-2 focus:ring-white focus:ring-offset-2 focus:ring-offset-gray-800">
              <span class="absolute -inset-0.5" />
              <span class="sr-only">Open main menu</span>
              <Bars3Icon v-if="!open" class="block h-6 w-6" aria-hidden="true" />
              <XMarkIcon v-else class="block h-6 w-6" aria-hidden="true" />
            </DisclosureButton>
          </div>
        </div>


      <DisclosurePanel class="lg:hidden mt-5" style="background: rgb(31 41 55 / var(--tw-bg-opacity));;">
        <div class="space-y-1 px-2 pb-3 pt-2 sm:px-3">
          <DisclosureButton v-for="item in navigation" :key="item.name" as="a" :href="item.href" :class="[item.current ? 'bg-gray-900 text-white' : 'text-gray-300 hover:bg-gray-700 hover:text-white', 'block rounded-md px-3 py-2 text-base font-medium']" :aria-current="item.current ? 'page' : undefined">{{ item.name }}</DisclosureButton>
        </div>
      </DisclosurePanel>

    </Disclosure>
      </div>
 

    <main>
      <div class="mx-auto max-w-7xl py-6 sm:px-6 lg:px-8">
        <!-- Your content -->
      </div>
    </main>
</template>

<script setup>
import { Disclosure, DisclosureButton, DisclosurePanel, Menu, MenuButton, MenuItem, MenuItems } from '@headlessui/vue'
import { Bars3Icon, BellIcon, XMarkIcon } from '@heroicons/vue/24/outline'
import eventBus from '../eventBus.js'

const user = {
  name: 'Tom Cook',
  email: 'tom@example.com',
  imageUrl:
    'https://images.unsplash.com/photo-1472099645785-5658abf4ff4e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=facearea&facepad=2&w=256&h=256&q=80',
}
const navigation = [
  { name: 'Lịch chiếu theo rạp', href: '#', current: false },
  { name: 'Phim', href: '#', current: false },
  { name: 'Rạp', href: '#', current: false },
  { name: 'Giá vé', href: '#', current: false },
  { name: 'Tin mới và giá vé', href: '#', current: false },
  { name: 'Nhượng quyền', href: '#', current: false },
  { name: 'Thành viên', href: '#', current: false }
]
const userNavigation = [
  { name: 'Your Profile', href: '#' },
  { name: 'Settings', href: '#' },
  { name: 'Sign out', href: '#' },
]


const showLogin = () => {
  eventBus.emit("showLogin", true)
}

const showSignUp = () => {
  eventBus.emit("showSignUp", true)
}
</script>

<style scoped>
@media (min-width:992px) {
  .col-lg-8{
    justify-content: start !important;
  }
}
</style>