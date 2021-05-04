package com.example.carmanagementsystem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.ViewHolder> {

    ArrayList<Information> information;
    CarSelected myActivity;


    public interface CarSelected
    {
        void onCarClicked(int index);
    }

    public CarAdapter(Context context, ArrayList<Information> list) {
        information = list;
        myActivity = (CarSelected) context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_layout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvCarNameList.setText(information.get(position).getCarName());
        holder.tvOwnerNameList.setText(information.get(position).getName());
         holder.imgLogoList.setImageResource(information.get(position).getImageId());
         holder.itemView.setTag(information.get(position));


    }

    @Override
    public int getItemCount() {
        return information.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvCarNameList, tvOwnerNameList,tvOName,tvOMobileNo;
        ImageView imgLogoList;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvCarNameList = itemView.findViewById(R.id.tvCarNameList);
            tvOwnerNameList = itemView.findViewById(R.id.tvOwnerNameList);
            imgLogoList = itemView.findViewById(R.id.imgLogoList);




            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    myActivity.onCarClicked(information.indexOf((Information)itemView.getTag()));
                }
            });
        }
    }
}
