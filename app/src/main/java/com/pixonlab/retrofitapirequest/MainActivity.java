package com.pixonlab.retrofitapirequest;

import android.os.Bundle;
import android.widget.Toast;

import com.pixonlab.retrofitapirequest.model.PersonalInformation;
import com.pixonlab.retrofitapirequest.server.ServerApi;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ServerApi.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()) //Here we are using the GsonConverterFactory to directly convert json data to object
                .build();

        ServerApi api = retrofit.create(ServerApi.class);

        Call<PersonalInformation> call = api.getPersonalInformation();

        call.enqueue(new Callback<PersonalInformation>() {
            @Override
            public void onResponse(Call<PersonalInformation> call, Response<PersonalInformation> response) {

                if (response.body() != null){
                    if (response.isSuccessful()){
                        Toast.makeText(MainActivity.this, "OK", Toast.LENGTH_SHORT).show();
                    }
                }



            }

            @Override
            public void onFailure(Call<PersonalInformation> call, Throwable t) {
                Toast.makeText(MainActivity.this, "No", Toast.LENGTH_SHORT).show();
            }   
        });

    }
}
