package com.arthur.dashboardexample.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.arthur.dashboardexample.R;
import com.arthur.dashboardexample.domain.TrendDomain;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners;

import java.util.ArrayList;

public class TrendAdapter extends RecyclerView.Adapter<TrendAdapter.ViewHolder> {

    ArrayList<TrendDomain> items;
    Context context;

    public TrendAdapter(ArrayList<TrendDomain> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public TrendAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_trend_list, parent, false);
        context = parent.getContext();
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TrendAdapter.ViewHolder holder, int position) {
        holder.textTitle.setText(items.get(position).getTitle());
        holder.textSubTitle.setText(items.get(position).getSubTitle());
        int imageId = holder.itemView.getResources().getIdentifier(
                items.get(position).getPicPath(),
                "drawable",
                holder.itemView.getContext().getPackageName()
        );
        Glide.with(context)
                .load(imageId)
                .transform(new GranularRoundedCorners(30, 30, 0, 0))
                .into(holder.pic);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textTitle, textSubTitle;
        ImageView pic;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textTitle = itemView.findViewById(R.id.textTitle);
            textSubTitle = itemView.findViewById(R.id.textSubtitle);
            pic = itemView.findViewById(R.id.pic);
        }

    }
}
