package com.ken.pelay.Presenters.TopChart;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.ken.pelay.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TopChartViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.namalagu)
    TextView namalagu;
    @BindView(R.id.artis)
    TextView artis;
    public TopChartViewHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

}
