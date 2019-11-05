package com.example.psp1920retrofit.model;

import android.util.Log;

import com.example.psp1920retrofit.model.data.Type;
import com.example.psp1920retrofit.model.rest.TypeClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;



public class Repository {

    private static final String TAG="xyz";

    private TypeClient apiClient;

    private final String url="54.161.231.239";

    private List<Type> typeList = new ArrayList<>();


    public Repository() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://" + url + "/web/psp/public/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiClient = retrofit.create(TypeClient.class);

        fetchTypeList();
    }

    public void fetchTypeList() {
        Call<ArrayList<Type>> call = apiClient.getTypes();
        call.enqueue(new Callback<ArrayList<Type>>() {
            @Override
            public void onResponse(Call<ArrayList<Type>> call, Response<ArrayList<Type>> response) {
                Log.v(TAG, response.body().toString());
                typeList = response.body();
            }
            @Override
            public void onFailure(Call<ArrayList<Type>> call, Throwable t) {
                Log.v(TAG, t.getLocalizedMessage());
                typeList = new ArrayList<>();
            }
        });
    }

    public List<Type> getTypeList() {
        return typeList;
    }
}
