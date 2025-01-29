package com.example.estoque_mvvm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SongAdapter extends RecyclerView.Adapter<SongViewHolder> {
    Context context;
    List<SongList> items;

    public SongAdapter(Context context, List<SongList> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public SongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SongViewHolder(LayoutInflater.from(context).inflate(R.layout.items, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SongViewHolder holder, int position) {
        holder.imageView.setImageResource(items.get(position).getSongImage());
        holder.songTitle.setText(items.get(position).getSongTitle());
        holder.songArtist.setText(items.get(position).getSongArtist());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
