package com.example.tamilnewsapi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {

    private Context mContext;
    private ArrayList<NewsItem> mNewsList;

    public NewsAdapter(Context context, ArrayList<NewsItem> newsList) {
        mContext = context;
        mNewsList = newsList;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.card_news_items, parent, false);
        return new NewsViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {

        NewsItem currentItem = mNewsList.get(position);

        String imageUrl = currentItem.getImageUrl();
        String title = currentItem.getTitle();
        String description = currentItem.getDescription();
        String time = currentItem.getTime();

        holder.newsTitle.setText(title);
        holder.newsDescription.setText(description);
        holder.newsTime.setText("published_date:" + time);
        Glide.with(mContext).load(imageUrl).placeholder(R.drawable.news_logo).into(holder.newsImage);

    }

    @Override
    public int getItemCount() {
        return mNewsList.size();
    }

    public class NewsViewHolder  extends RecyclerView.ViewHolder{

        public ImageView newsImage;
        public TextView newsTitle,newsDescription,newsTime;

        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);

            newsImage = itemView.findViewById(R.id.news_image);
            newsTitle = itemView.findViewById(R.id.text_view_title);
            newsDescription = itemView.findViewById(R.id.text_view_desc);
            newsTime = itemView.findViewById(R.id.text_view_published_date);

        }
    }
}
