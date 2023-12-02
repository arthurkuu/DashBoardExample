package com.arthur.dashboardexample.domain;

public class TrendDomain {

    private String title;
    private String subTitle;
    private String picPath;

    public TrendDomain(String title, String subTitle, String picPath) {
        this.title = title;
        this.subTitle = subTitle;
        this.picPath = picPath;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public String getPicPath() {
        return picPath;
    }


}
