package com.ken.pelay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ken.pelay.Models.TopChartModels;
import com.ken.pelay.Presenters.ClientAPI;
import com.ken.pelay.Presenters.RestAPI;
import com.ken.pelay.Presenters.TopChart.TopChartAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PalingActivity extends AppCompatActivity {
    public static String base_url="https://kostlab.id/project/";
    @BindView(R.id.rvTopChart)
    RecyclerView rvTopChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paling);
        ButterKnife.bind(this);
        loadData();
    }

    void loadData(){
        RestAPI service= ClientAPI.get(base_url).create(RestAPI.class);
        Call<TopChartModels> call=service.gettopchart();
        call.enqueue(new Callback<TopChartModels>() {
            @Override
            public void onResponse(Call<TopChartModels> call, Response<TopChartModels> response) {
                LinearLayoutManager mLinear=new LinearLayoutManager(getApplicationContext());
                rvTopChart.setLayoutManager(mLinear);
                rvTopChart.setHasFixedSize(true);

                TopChartAdapter adapter=new TopChartAdapter(getApplicationContext(),response.body().getResults().getSonglist());
                rvTopChart.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<TopChartModels> call, Throwable t) {

            }
        });
    }
}
