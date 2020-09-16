package com.example.phonaapp;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
  Context mcontext;
  List<Contact> mdata;
  Dialog dialog;

    public RecyclerViewAdapter(Context mcontext, List<Contact> mdata) {
        this.mcontext = mcontext;
        this.mdata = mdata;
    }

    @SuppressLint("ResourceAsColor")
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v= LayoutInflater.from(mcontext).inflate(R.layout.item_contact,parent,false);
        final MyViewHolder vHolder=new MyViewHolder(v);
        dialog=new Dialog(mcontext);
        dialog.setContentView(R.layout.dialog_contact);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.R.color.transparent));




        vHolder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView name_dialog=dialog.findViewById(R.id.dialog_name_id);
                TextView phone_dialog=dialog.findViewById(R.id.dialog_phone_id);
                ImageView img_dialog=dialog.findViewById(R.id.img_dialog);
                name_dialog.setText(mdata.get(vHolder.getAdapterPosition()).getName());
                phone_dialog.setText(mdata.get(vHolder.getAdapterPosition()).getNumber());
                img_dialog.setImageResource(mdata.get(vHolder.getAdapterPosition()).getPhoto());

                Toast.makeText(mcontext,"test click"+String.valueOf(vHolder.getAdapterPosition()),Toast.LENGTH_LONG).show();
                dialog.show();
            }
        });
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_name.setText(mdata.get(position).getName());
        holder.tv_phone.setText(mdata.get(position).getNumber());
        holder.img.setImageResource(mdata.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private LinearLayout item;
private TextView tv_name;
private TextView tv_phone;
private ImageView img;



        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name=itemView.findViewById(R.id.name_contact);
            tv_phone=itemView.findViewById(R.id.phone_contact);
            img=itemView.findViewById(R.id.img_contact);
            item=itemView.findViewById(R.id.contact_item);
        }
    }
}
