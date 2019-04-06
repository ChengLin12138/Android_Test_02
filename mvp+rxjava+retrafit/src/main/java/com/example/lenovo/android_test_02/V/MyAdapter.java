package com.example.lenovo.android_test_02.V;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.lenovo.android_test_02.M.FoodBean;

import java.util.List;

import jp.wasabeef.glide.transformations.CropCircleTransformation;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    List<FoodBean.DataBean> list;

    public void setList(List<FoodBean.DataBean> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
