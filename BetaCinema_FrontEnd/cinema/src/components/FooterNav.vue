<template>
  <!-- Footer -->
  <MDBFooter :text="['center', 'lg-start', 'muted']">
    <!-- Section: Social media -->
    
    <!-- Section: Social media -->
    <!-- Section: Links  -->
    <section class="col-10 mt-0" style="margin-left: auto ; margin-right: auto ">
      <MDBContainer class="text-center text-md-start" >
        <!-- Grid row -->
        <MDBRow class="" >
          <!-- Grid column -->
          <MDBCol sm="12" md="3" lg="4" xl="3" class="mx-auto mt-4">
            <!-- Content -->
            <div class="flex justify-start sm:justify-center ">
              <img class="h-8 w-8 ml-5" src="logo.png" alt="Your Company" style="height:auto; width: auto;"/>
            </div>
            <ul class="mt-3" style="font-size: 13px;">
              <li v-for="(item, index) in Items1" :key="index" >
                > <a :href="item.url" style="color: black; text-decoration: none;"> {{ item.label }}</a>
              </li>
            </ul>
          </MDBCol>
          <!-- Grid column -->
          <!-- Grid column -->
          <MDBCol sm="12" md="9" lg="8" xl="9" class="mx-auto mt-4">
            <!-- Links -->
            <MDBRow  class="">
              <MDBCol xs="12" sm="6" md="6" lg="6" xl="6" class="">
                <div class="">
                  <div style="width: 100%; display: flex; justify-content: center;">
                    <h2 style="font-size: 16px;

                      text-transform: uppercase;
                      font-weight: bold;
                      border-bottom: 4px solid transparent;
                      border-image: linear-gradient(to right, #39adf0 0%, #075fa3 100%);
                      border-image-slice: 1;
                      float: left;"
                      >CỤM RẠP BETA</h2>
                  </div>
                  <ul class="mt-3" style="font-size: 13px; padding: 0;">
                  <li v-for="(item, index) in Items2" :key="index" class="flex justify-start">
                    > <a :href="item.url" style="color: black; text-decoration: none;"> {{ item.label }}</a>
                  </li>
                </ul>
                </div>

              </MDBCol>

              <MDBCol xs="12" sm="3" md="3" lg="3" xl="3" class="mx-auto ">
                <div class="flex justify-center">
                  <h2 style="font-size: 16px;
                          text-transform: uppercase;
                          font-weight: bold;
                          border-bottom: 4px solid transparent;
                          border-image: linear-gradient(to right, #39adf0 0%, #075fa3 100%);
                          border-image-slice: 1;
                          float: left;"
                  >Kết nối với chúng tôi</h2>
                </div>

                <ul class="social-icons " style="display: flex; justify-content: space-evenly; align-items: center; padding: 0;" >
                  <li v-for="(item, index) in items3" :key="index">
                    <a :class="item.class" :href="item.url">
                      <font-awesome-icon :icon="['fab', item.title]" />
                    </a>
                  </li>
                </ul>
              </MDBCol>

              <MDBCol xs="12" sm="3" md="3" lg="3" xl="3" class="mx-auto mb-md-0">
                <div class="flex justify-start">
                  <h2 style="font-size: 16px;
                          text-transform: uppercase;
                          font-weight: bold;
                          border-bottom: 4px solid transparent;
                          border-image: linear-gradient(to right, #39adf0 0%, #075fa3 100%);
                          border-image-slice: 1;
                          float: left;"
                  >Liên hệ</h2>
                </div>
                <div class="contact" style="float: left;">
                  <h6 class="no-margin">CÔNG TY CỔ PHẦN BETA MEDIA</h6>
                  <h6>
                    Giấy chứng nhận ĐKKD số: 0106633482 - Đăng ký lần đầu ngày 08/09/2014 tại Sở Kế hoạch và Đầu tư Thành phố Hà Nội
                  </h6>
                  <h6>Địa chỉ trụ sở: Tầng 3, số 595, đường Giải Phóng, phường Giáp Bát, quận Hoàng Mai, thành phố Hà Nội</h6>
                  <h6>Hotline: 1900 636807</h6>
                  <h6>Email: cskh@betacorp.vn</h6>
                  <h6>Liên hệ hợp tác kinh doanh:</h6>
                    <h6>Email: bachtx@betagroup.vn</h6>
                    <p></p>
                  </div>
              </MDBCol>

            </MDBRow>

          </MDBCol>

        </MDBRow>
        <!-- Grid row -->
      </MDBContainer>
    </section>
    <!-- Section: Links  -->
  </MDBFooter>
  <!-- Footer -->
</template>

<script setup>

import {
    MDBFooter,
    MDBContainer,
    MDBRow,
    MDBCol,
    MDBIcon
  } from 'mdb-vue-ui-kit';

  const Items1 = [
    {label : "Tuyển dụng", url: "https://betacinemas.vn/thong-tin-chung.htm#tab-3"},
    {label : "Giới thiệu", url: "https://betacinemas.vn/thong-tin-chung.htm#tab-1"},
    {label : "Liên hệ", url: "https://betacinemas.vn/thong-tin-chung.htm#tab-2"},
    {label : "F.A.Q", url: "https://betacinemas.vn/thong-tin-chung.htm#tab-4"},
    {label : "Hoạt động xã hội", url: "https://betacinemas.vn/gioi-thieu/trach-nhiem-xa-hoi-va-cong-dong.htm"},
    {label : "Điều khoản sử dụng", url: "https://betacinemas.vn/thong-tin-chung.htm#tab-7"},
    {label : "Chính sách thanh toán, đổi trả - hoàn vé", url: "https://betacinemas.vn/dieu-khoan/dieu-khoan-thanh-toan.htm"},
    {label : "Liên hệ quảng cáo", url: "https://betacinemas.vn/thong-tin-chung.htm#tab-8"},
    {label : "Điều khoản bảo mật", url: "https://betacinemas.vn/thong-tin-chung.htm#tab-9"},
    {label : "Hướng dẫn đặt vé online", url: "https://betacinemas.vn/dieu-khoan/huong-dan-dat-ve-online.htm"},
  ]

  const Items2 = [
  { 
    label: "Beta Cinemas Lào Cai - Hotline 0358 968 970",
    url: "/thong-tin-rap/beta-lao-cai.htm"
  },
  { 
    label: "Beta Cinemas Trần Quang Khải, TP Hồ Chí Minh - Hotline 1900 638 362",
    url: "/beta-imc-tran-quang-khai.htm"
  },
  { 
    label: "Beta Cinemas TRMall Phú Quốc, Kiên Giang - Hotline 0983 474 440",
    url: "/thong-tin-rap/beta-trmall-phu-quoc.htm"
  },
  { 
    label: "Beta Cinemas Empire Bình Dương - Hotline 0934 573 748",
    url: "/thong-tin-rap/beta-empire.htm"
  },
  { 
    label: "Beta Cinemas Quang Trung, TP Hồ Chí Minh - Hotline 0706 075 509",
    url: "/thong-tin-rap/beta-cinemas-quang-trung-khai-truong-dau-nam-2021.htm"
  },
  { 
    label: "Beta Cinemas Giải Phóng, Hà Nội - Hotline 0585 680 360",
    url: "/thong-tin-rap/beta-cinemas-giai-phong.htm"
  },
  { 
    label: "Beta Cinemas Thanh Xuân, Hà Nội - Hotline 082 4812878",
    url: "/thong-tin-rap/beta-thanh-xuan.htm"
  },
  { 
    label: "Beta Cinemas Mỹ Đình, Hà Nội - Hotline 0866 154 610",
    url: "/thong-tin-rap/rap-my-dinh.htm"
  },
  { 
    label: "Beta Cinemas Đan Phượng, Hà Nội - Hotline 0983 901 714",
    url: "/thong-tin-rap/rap-dan-phuong.htm"
  },
  { 
    label: "Beta Cinemas Thái Nguyên - Hotline 0867 460 053",
    url: "/thong-tin-rap/beta-thai-nguyen.htm"
  },
  { 
    label: "Beta Cinemas Thanh Hóa - Hotline 0325 360 249",
    url: "/thong-tin-rap/beta-thanh-hoa.htm"
  },
  { 
    label: "Beta Cinemas Bắc Giang - Hotline 0866 493 413",
    url: "/thong-tin-rap/beta-bac-giang.htm"
  },
  { 
    label: "Beta Cinemas Nha Trang, Khánh Hòa - Hotline 0399 475 165",
    url: "/thong-tin-rap/beta-nha-trang.htm"
  },
  { 
    label: "Beta Cinemas Biên Hòa, Đồng Nai - Hotline 0979 460 002",
    url: "/thong-tin-rap/beta-bien-hoa.htm"
  },
  { 
    label: "Beta Cinemas Long Khánh, Đồng Nai - Hotline 0925 165 684",
    url: "/thong-tin-rap/beta-cinemas-long-khanh.htm"
  },
  { 
    label: "Beta Cinemas Phú Mỹ, Bà Riạ Vũng Tàu - Hotline 0886 006 310",
    url: "/thong-tin-rap/beta-cinex-phu-my.htm"
  },
  { 
    label: "Beta Cinemas Hồ Tràm, Bà Rịa Vũng Tàu - Hotline 0254 3788601",
    url: "/thong-tin-rap/beta-ho-tram.htm"
  },
  { 
    label: "Beta Cinemas Tân Uyên, Bình Dương - Hotline 0937 905 925",
    url: "/thong-tin-rap/beta-tan-uyen.htm"
  },
  { 
    label: "Tải Ứng Dụng Beta Cinemas",
    url: "http://onelink.to/zmb6dp"
  }
];

const items3 = [
  { 
    class: "facebook",
    title: "facebook",
    url: "https://www.facebook.com/betacinemas/"
  },
  { 
    class: "youtube",
    title: "youtube",
    url: "https://www.youtube.com/channel/UCGj6uah35-eNiH_2mdubYRw/"
  },
  { 
    class: "tiktok",
    title: "tiktok",
    url: "https://www.tiktok.com/@beta_cinemas/"
  },
  { 
    class: "instagram",
    title: "instagram",
    url: "https://www.instagram.com/betacinemas/"
  }
];



</script>

<style scoped>

.contact h4 h6 p {
  font-size: 12px !important;
  
}

</style>