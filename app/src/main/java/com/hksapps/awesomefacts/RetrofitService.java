package com.hksapps.awesomefacts;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by Pranav on 26-09-2017.
 */

public interface RetrofitService {

    @GET
    Call<ResponseBody> listRepos(@Url String url);

}


