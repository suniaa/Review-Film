package com.example.suniapunya;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    List<Model>my_list;
    Context context;

    public CustomAdapter(List<Model> my_list, Context context) {
        this.my_list = my_list;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_list_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final Model model=my_list.get(position);
        holder.name.setText(model.getPlayer_name());
        holder.desc.setText(model.getPlayer_desc());
        holder.image.setImageDrawable(context.getResources().getDrawable(model.getImage()));
        holder.relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, DetailsActivity.class);
                intent.putExtra("image", model.getImage());
                intent.putExtra("name", model.getPlayer_name());
                intent.putExtra("desc",model.getPlayer_desc());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return my_list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name, desc;
        RelativeLayout relative;
        public MyViewHolder(View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.image);
            name= itemView.findViewById(R.id.name);
            desc=itemView.findViewById(R.id.desc);
            relative=itemView.findViewById(R.id.relative);
        }
    }
}