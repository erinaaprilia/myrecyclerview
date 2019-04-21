package com.example.asus.myrecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListSkincareAdapter extends RecyclerView.Adapter<ListSkincareAdapter.CategoryViewHolder> {

    private Context context;
    private ArrayList<Skincare> listSkincare;

    public void setContext(Context context) {
        this.context = context;
    }
    public ArrayList<Skincare> getListSkincare() {
        return listSkincare;
    }
    public void setListSkincare(ArrayList<Skincare> listSkincare) {
        this.listSkincare = listSkincare;
    }

    ListSkincareAdapter(Context context){
        this.context = context;
    }

    @NonNull
    @Override
    public ListSkincareAdapter.CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_skincare, viewGroup, false);
        return new ListSkincareAdapter.CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull ListSkincareAdapter.CategoryViewHolder categoryViewHolder, int position) {
        categoryViewHolder.tvName.setText(getListSkincare().get(position).getName());
        categoryViewHolder.tvRemarks.setText(getListSkincare().get(position).getRemarks());

        Glide.with(context)
                .load(getListSkincare().get(position).getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(categoryViewHolder.imgPhoto);

    }

    @Override
    public int getItemCount() {
        return getListSkincare().size();
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvRemarks;
        ImageView imgPhoto;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
