package com.am.henry.adapters;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.am.henry.R;
import com.am.henry.model.RunItem;

import java.util.List;

public class RunAdapter extends RecyclerView.Adapter<RunAdapter.RunViewHolder>{

    Context mContext;
    List<RunItem> mData;

    public RunAdapter(Context mContext, List<RunItem> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public RunViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View layout;
        layout = LayoutInflater.from(mContext).inflate(R.layout.item_run,viewGroup, false);
        return new RunViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull RunViewHolder runViewHolder, int position) {
        // PASSAR DADOS POR AQUI

        runViewHolder.tv_title.setText(mData.get(position).getTitle());
        runViewHolder.tv_content.setText(mData.get(position).getContent());
        runViewHolder.tv_date.setText(mData.get(position).getDate());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class RunViewHolder extends RecyclerView.ViewHolder{

        TextView tv_title, tv_content, tv_date;

        public RunViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_title = itemView.findViewById(R.id.tv_title);
            tv_content = itemView.findViewById(R.id.tv_content);
            tv_date = itemView.findViewById(R.id.tv_date);

        }
    }

}
