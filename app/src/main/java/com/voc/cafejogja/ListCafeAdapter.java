package com.voc.cafejogja;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListCafeAdapter extends RecyclerView.Adapter<ListCafeAdapter.ListViewHolder> {
    private ArrayList<Cafe> listCafe;
    public ListCafeAdapter(ArrayList<Cafe> listCafe) {this.listCafe = listCafe;}

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cafe, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        Cafe cafe = listCafe.get(position);
        Glide.with(holder.itemView.getContext())
                .load(cafe.getFoto())
                .apply(new RequestOptions().override(75, 75))
                .into(holder.imgPreviewCafe);
        holder.tvNamaCafe.setText(cafe.getNama());
        holder.tvLokasiCafe.setText(cafe.getLokasi());
        holder.tvJamBukaCafe.setText(cafe.getJamBuka());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), GalleryActivity.class);
                intent.putExtra("idCafe", listCafe.get(position).getId());
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listCafe.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPreviewCafe;
        TextView tvNamaCafe, tvLokasiCafe, tvJamBukaCafe;
        RelativeLayout parentLayout;
        private int id;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPreviewCafe = itemView.findViewById(R.id.img_item_cafe);
            tvNamaCafe = itemView.findViewById(R.id.tv_cafeName);
            tvLokasiCafe = itemView.findViewById(R.id.tv_cafeLocation);
            tvJamBukaCafe = itemView.findViewById(R.id.tv_cafeTime);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}
