package com.moksh.gamesense.ui.News;

public class ModelClass {
    private String headline;
    private String image;
    private String url;

    public ModelClass(){}

    public ModelClass(String headline, String image, String url) {
        this.headline = headline;
        this.image = image;
        this.url = url;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
