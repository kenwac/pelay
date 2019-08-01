package com.ken.pelay.Presenters.TopChart;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ken.pelay.Models.Songlist;
import com.ken.pelay.R;

import java.util.List;

public class TopChartAdapter extends RecyclerView.Adapter<TopChartViewHolder> {
    private Context context;
    private List<Songlist> resultsTopChartList;

    public TopChartAdapter(Context context, List<Songlist> resultsTopChartList){
        this.context=context;
        this.resultsTopChartList=resultsTopChartList;
    }
    @NonNull
    @Override
    public TopChartViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_paling,viewGroup,false);
        return new TopChartViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopChartViewHolder topChartViewHolder, int i) {
        Songlist resultsTopChart=resultsTopChartList.get(i);
        topChartViewHolder.namalagu.setText(resultsTopChart.getSongname());
        topChartViewHolder.artis.setText(resultsTopChart.getArtistname());
    }

    @Override
    public int getItemCount() {
        return resultsTopChartList.size();
    }
}
