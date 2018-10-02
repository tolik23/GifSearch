package com.a_liutarovich.gifsearcher.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.a_liutarovich.gifsearcher.Models.Gifs;
import com.a_liutarovich.gifsearcher.R;
import com.bumptech.glide.Glide;

import pl.droidsonroids.gif.GifImageView;

public class GifAdapter  extends RecyclerView.Adapter<GifAdapter.ViewHolder>  {

    private Context mContext;
    Gifs mGifsList;

    public GifAdapter(Context mContext,Gifs mGifsList){
        this.mContext = mContext;
        this.mGifsList = mGifsList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.gif_item, parent, false);
        return new ViewHolder((view));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int i) {
        Glide.with(mContext)
                .load(mGifsList.getData().get(i).getImages().getFixed_height_still().getUrl())
                .into(holder.mGifImage);
    }

    @Override
    public int getItemCount() {
        return mGifsList.getData().size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private GifImageView mGifImage;

        public ViewHolder(View view) {
            super(view);
            mGifImage = (GifImageView)view.findViewById(R.id.iv_gif);
        }

        @Override
        public void onClick(View v) {

        }
    }
}