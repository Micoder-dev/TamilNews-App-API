package com.example.tamilnewsapi;

public class NewsItem {

    private String mImageUrl, mTitle, mDescription, mTime, mUrl;

    public NewsItem(String imageUrl, String title, String description, String time, String url) {
        mImageUrl = imageUrl;
        mTitle = title;
        mDescription = description;
        mTime = time;
        mUrl = url;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getTime() {
        return mTime;
    }

    public String getUrl() {
        return mUrl;
    }
}
