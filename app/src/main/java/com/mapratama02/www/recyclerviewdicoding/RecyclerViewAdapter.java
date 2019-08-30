package com.mapratama02.www.recyclerviewdicoding;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private ArrayList<Integer> mId = new ArrayList<>();
    private ArrayList<String> mName = new ArrayList<>();
    private ArrayList<String> mDesc = new ArrayList<>();
    private ArrayList<String> mImg = new ArrayList<>();
    private Context mCtx;

    public RecyclerViewAdapter(ArrayList<Integer> mId, ArrayList<String> mName, ArrayList<String> mDesc, ArrayList<String> mImg, Context mCtx) {
        this.mId = mId;
        this.mName = mName;
        this.mDesc = mDesc;
        this.mImg = mImg;
        this.mCtx = mCtx;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerViewAdapter.ViewHolder holder, final int position) {
        Glide.with(mCtx)
                .asBitmap()
                .load(mImg.get(position))
                .into(holder.imgItem);
        holder.txtItem.setText(mName.get(position));
        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mCtx, "Chapter " + mId.get(position), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(mCtx, DetailActivity.class);
                intent.putExtra("id", mId.get(position));
                intent.putExtra("name", mName.get(position));
                intent.putExtra("desc", mDesc.get(position));
                intent.putExtra("img", mImg.get(position));

                mCtx.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mName.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgItem;
        RelativeLayout parentLayout;
        TextView txtItem;

        public ViewHolder(View itemView) {
            super(itemView);
            imgItem = itemView.findViewById(R.id.iv_item);
            txtItem = itemView.findViewById(R.id.tv_item_name);
            parentLayout = itemView.findViewById(R.id.relative_parent);
        }
    }
}
