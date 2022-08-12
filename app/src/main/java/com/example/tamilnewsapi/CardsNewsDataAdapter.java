package com.example.tamilnewsapi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CardsNewsDataAdapter extends BaseAdapter {

    private ArrayList<CardNews> newsData;
    private Context context;

    public CardsNewsDataAdapter(ArrayList<CardNews> newsData, Context context) {
        this.newsData = newsData;
        this.context = context;
    }

    @Override
    public int getCount() {
        return newsData.size();
    }

    @Override
    public Object getItem(int position) {
        return newsData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // in get view method we are inflating our layout on below line.
        View v = convertView;
        if (v == null) {
            // on below line we are inflating our layout.
            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_card, parent, false);
        }
        // on below line we are initializing our variables and setting data to our variables.
        ((TextView) v.findViewById(R.id.stack_text_view_title)).setText(newsData.get(position).getMstackTitle());
        ((TextView) v.findViewById(R.id.stack_text_view_desc)).setText(newsData.get(position).getMstackDescription());
        ((TextView) v.findViewById(R.id.stack_text_view_published_date)).setText(newsData.get(position).getMstackTime());
        ImageView imageUrl;
        imageUrl = v.findViewById(R.id.stack_news_image);
        Glide.with(context).load(newsData.get(position).getMstackImageUrl()).placeholder(R.drawable.news_logo).into(imageUrl);
        return v;
    }
}
