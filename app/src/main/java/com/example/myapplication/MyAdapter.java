package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.databinding.RecyclerItemBinding;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private Context context;
    private List<Product> dataList;

    public void setSearchList(List<Product> dataSearchList){
        this.dataList = dataSearchList;
        notifyDataSetChanged();
    }

    public MyAdapter(Context context, List<Product>dataList){
        this.context = context;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerItemBinding recyclerItemBinding = RecyclerItemBinding.inflate(
                LayoutInflater.from(parent.getContext()),
                parent,
                false
        );
        return new MyViewHolder(recyclerItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.setData(dataList.get(position));
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}


class MyViewHolder extends RecyclerView.ViewHolder{

    RecyclerItemBinding binding;

    public MyViewHolder(RecyclerItemBinding itemView){
        super(itemView.getRoot());
        binding = itemView;

    }
    void setData(Product dataClass) {
        binding.recTitle.setText(dataClass.name);
        binding.recLang.setText(dataClass.price);
        if (dataClass.image != null) {
            Picasso.get().load(dataClass.image).into(binding.recImage);
        }
    }
}
