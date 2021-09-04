package com.sumit.dynamicfragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {
    List<ResponseModel> responseModelArrayList;

    public Adapter(List<ResponseModel> responseModelArrayList) {
        this.responseModelArrayList = responseModelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ResponseModel responseModel = responseModelArrayList.get(position);
        holder.setData(responseModel);
    }

    @Override
    public int getItemCount() {

            return responseModelArrayList.size();
        }
}
