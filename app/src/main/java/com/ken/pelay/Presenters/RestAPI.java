package com.ken.pelay.Presenters;



import com.ken.pelay.Models.TopChartModels;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestAPI {
//        @GET("praytimes/get?lat=-6.914744&lng=107.609810&timezone=7")
//        Call <MPraytimes> getprayer();
//        @GET("get_near_things?radius=4&id_user=U4d764405f14220a7951fc5fab795495a")
//        Call <MBarang> getbarang(@Query("lat") String lat, @Query("lng") String lng,
//                                 @Query("status") String status);
//
//        @GET("laporan/byid")
//        Call <MBarang> getdetailbarang(@Query("id") String id);
//
//        @GET("barang/terbaru")
//        Call <MBarang> getterbaru();
//
//        @GET("official_location?radius=4")
//        Call <MOfficialLocation> getlocation(@Query("lat") String lat, @Query("lng") String lng);



//        @FormUrlEncoded
//        @POST("register/proses")
//        Call<MRegister> register(@Field("id") String id_user, @Field("password") String password,
//                                 @Field("name") String name, @Field("city") String city,
//                                 @Field("gender") String gender, @Field("phone") String phone);
//

//
//        @Multipart
//        @POST("laporan/create")
//        Call<MResponse> uploadLaporan(@Part MultipartBody.Part file, @Part("id_user") RequestBody id_user
//                , @Part("name") RequestBody name, @Part("desc") RequestBody desc
//                , @Part("datetime") RequestBody datetime, @Part("lat") RequestBody lat,
//                                         @Part("lng") RequestBody lng, @Part("status") RequestBody status);
            @GET("ken/topchart.php")
            Call <TopChartModels> gettopchart();


}
