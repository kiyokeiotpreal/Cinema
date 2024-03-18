<template>
    <div>
        <div>
            <navbar/>
        </div>
        <div v-if="isShowLogin">
            <router-view/>
        </div>

        <div class="content">
            <v-carousel
                height="400"
                :show-arrows="hover"
                :cycle="true"
                :hide-delimiter-background="true"
            >
                <v-carousel-item v-for="(slide, i) in slides" :key="i">
                <v-sheet height="100%">
                    <div class="d-flex fill-height justify-center align-center">
                    <div class="text-h2">
                        <img :src="slide.src" alt="" style="">
                    </div>
                    </div>
                </v-sheet>
                </v-carousel-item>
            </v-carousel>

            <div>
                <v-card>
                    <v-tabs
                    v-model="tab"
                    align-tabs="center"
                    color="deep-purple-accent-4"
                    class="mt-10"
                    style=""
                    >
                    <v-tab style="font-size: 30px; font-family: 'IBM Plex Mono', monospace; letter-spacing: -1px;" :value="1">Phim sắp chiếu</v-tab>
                    <v-tab style="font-size: 30px; font-family: 'IBM Plex Mono', monospace; letter-spacing: -1px;" :value="2">Phim đang chiếu</v-tab>
                    </v-tabs>
                    <v-window v-model="tab">
                    <v-window-item
                        v-for="n in 3"
                        :key="n"
                        :value="n"
                    >
                        <v-container fluid>
                        <v-row>
                            <v-col
                            v-for="i in 6"
                            :key="i"
                            cols="12"
                            md="4"
                            >
                            <v-img
                                :lazy-src="`https://picsum.photos/10/6?image=${i * n * 5 + 10}`"
                                :src="`https://picsum.photos/500/300?image=${i * n * 5 + 10}`"
                                aspect-ratio="1"
                            ></v-img>
                            </v-col>
                        </v-row>
                        </v-container>
                    </v-window-item>
                    </v-window>
                </v-card>
            </div>
        </div>

        <div>
            <FooterNav/>
        </div>
    </div>
</template>

<script setup>
import {ref} from 'vue'
import eventBus from '../eventBus.js'
import FooterNav from '@/components/FooterNav.vue';
import navbar from '@/components/navbar.vue';
import Login from '@/components/Login.vue';

const isShowHome = ref(true);
const isShowLogin = ref(false);


eventBus.on("showLogin", (value) => {
    isShowLogin.value = value;
})

eventBus.on("showSignUp", (value) => {
    isShowLogin.value = value;
})

const slides = ref([
  { src: 'img1.png' },
  { src: '/img2.jpg' },
]);


const tab = ref(null);

</script>

<style>

</style>