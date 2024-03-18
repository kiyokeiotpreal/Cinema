<template>
  <div class="" style="">
  
  <div class="sm:mx-auto sm:w-full sm:max-w-sm">
    <h2 class=" text-center text-2xl font-bold leading-9 tracking-tight text-gray-900">Sign in to your account</h2>
  </div>

  <div class="mt-3" style="width: 50%; margin: auto;">
    <v-card >
    <v-tabs
      v-model="tab"
      align-tabs="center"
      color="deep-purple-accent-4"
    >
      <v-tab :value="1">Login</v-tab>
      <v-tab :value="2">Sign Up</v-tab>
    </v-tabs>
    <v-window v-model="tab">
      <v-window-item
        :value="1"
      >
        <v-container fluid>
            <form @submit.prevent="submit" class="space-y-6" action="#" method="POST">
              <div>
                <label for="email" class="block text-sm font-medium leading-6 text-gray-900">Email address</label>
                <div class="mt-2">
                  <input 
                  v-model="userLogin.email" 
                  :rules="emailRules"
                  id="email" 
                  name="email" 
                  type="email" 
                  autocomplete="email" 
                  required="" 
                  class="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6" />
                </div>
              </div>

              <div>
                <div class="flex items-center justify-between">
                  <label for="password" class="block text-sm font-medium leading-6 text-gray-900">Password</label>
                  <div class="text-sm">
                    <a href="#" class="font-semibold text-indigo-600 hover:text-indigo-500">Forgot password?</a>
                  </div>
                </div>
                <div class="mt-2">
                  <input 
                  v-model="userLogin.password" 
                  :rules="passwordRules"
                  id="password" 
                  name="password" 
                  type="password" 
                  autocomplete="current-password" 
                  required="" 
                  class="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6" />
                </div>
              </div>

              <div>
                <button @click="handleSignIn" class="flex w-full justify-center rounded-md bg-indigo-600 px-3 py-1.5 text-sm font-semibold leading-6 text-white shadow-sm hover:bg-indigo-500 focus-visible:outline focus-visible:outline-2 focus-visible:outline-offset-2 focus-visible:outline-indigo-600">Sign in</button>
              </div>
            </form>
        </v-container>
      </v-window-item>
      <v-window-item
      :value="2">
          <v-container>

            <form @submit.prevent="submit" class="space-y-6">
          <div class="row" style="max-height: 10vh;">
            <div class="col-6">
            <label for="name" class="block text-sm font-medium leading-6 text-gray-900">Name</label>
              <v-text-field class="col-xl-12 col-sm-6 input" dense 
                    clearable
                    required
                    density="compact"
                    variant="solo"
                    v-model="userRegister.name"
                    :rules="nameRules"
                  ></v-text-field>
          </div>

          <div class="col-6">
            <label for="userName" class="block text-sm font-medium leading-6 text-gray-900">UserName</label>
              <v-text-field class="col-xl-12 col-sm-6 input" dense 
                    clearable
                    required
                    density="compact"
                    variant="solo"
                    v-model="userRegister.userName"
                    :rules="userNameRules"
                  ></v-text-field>
          </div>
          </div>

          <div style="max-height: 10vh;">
            <label for="email" class="block text-sm font-medium leading-6 text-gray-900">Email address</label>
              <v-text-field class="col-xl-12 col-sm-6 input" dense 
                    
                    clearable
                    required
                    density="compact"
                    variant="solo"
                    v-model="userRegister.email"
                  :rules="emailRules"
                  ></v-text-field>
          </div>

          <div>
            <div class="flex items-center justify-between">
              <label for="phoneNumber" class="block text-sm font-medium leading-6 text-gray-900">Phone number</label>
            </div>
              <v-text-field class="col-xl-12 col-sm-6 input" dense 
                    clearable
                    required
                    density="compact"
                    variant="solo"
                    v-model="userRegister.phoneNumber"
                    :rules="phoneNumberRules"
                  ></v-text-field>
          </div>

          <div class="row">
            <div class="col-6">
              <label for="password" class="block text-sm font-medium leading-6 text-gray-900">Password</label>
              <v-text-field class="col-xl-12 col-sm-6 input" dense 
                    type = "password"
                    clearable
                    required
                    density="compact"
                    variant="solo"
                    v-model="userRegister.password"
                    :rules="passwordRules"
                  ></v-text-field>
          </div>
          <div class="col-6">
              <label for="password" class="block text-sm font-medium leading-6 text-gray-900">ConfirmPassword</label>
              <v-text-field class="col-xl-12 col-sm-6 input" dense 
                    type = "password"
                    clearable
                    required
                    density="compact"
                    variant="solo"
                    v-model="userRegister.retypePassword"
                    :rules="confirmPasswordRules"

                  ></v-text-field>
            </div>
          </div>


            <div v-if="showConfirmRegister">
                <label for="confirmCode" class="block text-sm font-medium leading-6 text-gray-900">Entering code</label>
                <div class=" row ">
                    <v-text-field class="col-6 input" dense 
                        clearable
                        required
                        density="compact"
                        variant="solo"
                        v-model="confirmCode"
                        ></v-text-field>

                    <button type="gradient" class="col-5" style="margin-bottom: 5%;">Gửi lại</button>
                    
                </div>
                <button type="gradient" @click="confirmRegister" class="col-12" style="margin-bottom: 5%;">Xác nhận</button>
            </div>

          <div>
            <button :disabled="hasErrors" @click="handleSignUp" class="flex w-full justify-center rounded-md bg-indigo-600 px-3 py-1.5 text-sm font-semibold leading-6 text-white shadow-sm hover:bg-indigo-500 focus-visible:outline focus-visible:outline-2 focus-visible:outline-offset-2 focus-visible:outline-indigo-600">Sign up</button>
          </div>
          </form>

          </v-container>
      </v-window-item>
    </v-window>
  </v-card>


    <p class="mt-10 text-center text-sm text-gray-500">
      Not a member?
      {{ ' ' }}
      <a href="#" class="font-semibold leading-6 text-indigo-600 hover:text-indigo-500">Start a 14 day free trial</a>
    </p>
  </div>
</div>
</template>

<script setup>

const tab = ref(null);

import { ref, computed } from 'vue';
import axios from 'axios'


const userRegister = ref({
    userName : '',
    name : '',
    email : '',
    password : '',
    retypePassword: '',
    phoneNumber: '',
})

const userLogin = ref({
  email : '',
  password : '',
})

const confirmCode = ref('')



const showConfirmRegister = ref(true);

const nameRules = [
    value => {
        if(value.length < 3){
            return "Tên phải có ít nhất 3 ký tự";
        }
        return true;
    }
]
const emailRules = [
    value => {
        if(/^[a-z.-.0-9]+@[a-z.-]+\.[a-z]+$/i.test(value)){
            return true;
        }
        return "email không hợp lệ"
    }
]

const passwordRules = [
    value => {
        if(value.length < 3){
            return "Tên phải có ít nhất 3 ký tự";
        }
        return true;
    }
]

const confirmPasswordRules = [
    value => {
        if(userRegister.value.password != userRegister.value.retypePassword){
            return "Xác nhận mật khẩu không trùng khớp";
        }
        return true;
    }
];

const phoneNumberRules = [
    value => {
        if (!value) {
            return 'Số điện thoại không được để trống';
        } else if (/^[0-9]+$/.test(value)) {
            return true;
        }
        return 'Số điện thoại không hợp lệ.';
        }
]

const userNameRules = [
    value => {
        if(value.length < 3){
            return "Tên phải có ít nhất 3 ký tự";
        }
        return true;
    }
]


const hasErrors = computed(() => {
  const nameError = nameRules.some(rule => typeof rule(userRegister.value.name) === 'string');
  const emailError = emailRules.some(rule => typeof rule(userRegister.value.email) === 'string');
  const confirmPasswordError = confirmPasswordRules.some(rule => typeof rule(userRegister.value.retypePassword) === 'string');

  return nameError || emailError || confirmPasswordError;
});



const confirmRegister = async()=> {
    try {
        const response = await axios.get("http://localhost:8088/api/v1/users/confirm-register?confirmCode=" + confirmCode.value)
        alert("OK")
        
    } catch (error) {
        if(error.response.status == "404"){
            alert("Không tồn tại")
        }
        if(error.response.status == "400"){
            alert("Mã hết hạn")
        }
        
    }
}

const handleSignUp = async () => {
    try {
        showConfirmRegister.value = true;
        const user = {
            userName: userRegister.value.userName,
            name:userRegister.value.name,
            email:userRegister.value.email,
            password:userRegister.value.password,
            retypePassword:userRegister.value.retypePassword,
            phoneNumber:userRegister.value.phoneNumber
        }
        const response = await axios.post("http://localhost:8088/api/v1/users/register", user)
        
    } catch (error) {
        alert("error")
    }

}

const handleSignIn = async() => {
  try {
    const user = {
      email : userLogin.value.email,
      password : userLogin.value.password
    }

    const response = await axios.post("http://localhost:8088/api/v1/users/login", user)
    
    
  } catch (error) {
    alert("error")
  }
}


</script>

<style>

</style>