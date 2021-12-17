package com.example.moviesbrowser;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.shashank.sony.fancytoastlib.FancyToast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.rv);
        TextView tvtest = findViewById(R.id.tvtest);
        String apikey = "cac1c908bd9bb4671e3be4ef3f8b4439";
        Call<Value> call = ApiClient.getInstance().getMyApi().getMovies(apikey);
        call.enqueue(new Callback<Value>() {
            @Override
            public void onResponse(Call<Value> call, Response<Value> response) {
                Value value = response.body();
                Result result = new Result();
               String[] movienames = new String[value.getResults().size()];

                RecyclerViewAdapter courseAdapter = new RecyclerViewAdapter(MainActivity.this, value.getResults());
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
                rv.setLayoutManager(linearLayoutManager);
                rv.setAdapter(courseAdapter);
              //  superListView.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, movienames));
               // FancyToast.makeText(getApplicationContext(), movienames[1], Toast.LENGTH_LONG,FancyToast.SUCCESS,false).show();

            }

            @Override
            public void onFailure(Call<Value> call, Throwable t) {
                FancyToast.makeText(getApplicationContext(), t.getMessage().toString(), Toast.LENGTH_LONG,FancyToast.ERROR,false).show();

            }
        });

    }
}