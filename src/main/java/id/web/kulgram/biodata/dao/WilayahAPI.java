package id.web.kulgram.biodata.dao;

import id.web.kulgram.biodata.model.WilayahRetrofit;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

import java.util.List;

public interface WilayahAPI {

    @GET("setting/wilayah")
    Call<List<WilayahRetrofit>> getWilayah(@Header("x-token") String token);
}
