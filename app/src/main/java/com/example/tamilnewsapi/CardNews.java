package com.example.tamilnewsapi;

public class CardNews {

    private String mstackTitle, mstackDescription, mstackTime, mstackImageUrl;

    public CardNews(String mstackTitle, String mstackDescription, String mstackTime, String mstackImageUrl) {
        this.mstackTitle = mstackTitle;
        this.mstackDescription = mstackDescription;
        this.mstackTime = mstackTime;
        this.mstackImageUrl = mstackImageUrl;
    }

    public String getMstackTitle() {
        return mstackTitle;
    }

    public void setMstackTitle(String mstackTitle) {
        this.mstackTitle = mstackTitle;
    }

    public String getMstackDescription() {
        return mstackDescription;
    }

    public void setMstackDescription(String mstackDescription) {
        this.mstackDescription = mstackDescription;
    }

    public String getMstackTime() {
        return mstackTime;
    }

    public void setMstackTime(String mstackTime) {
        this.mstackTime = mstackTime;
    }

    public String getMstackImageUrl() {
        return mstackImageUrl;
    }

    public void setMstackImageUrl(String mstackImageUrl) {
        this.mstackImageUrl = mstackImageUrl;
    }
}
