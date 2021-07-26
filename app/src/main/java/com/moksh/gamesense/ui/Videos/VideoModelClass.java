package com.moksh.gamesense.ui.Videos;

public class VideoModelClass {
    private String url;
    private String title;

    public VideoModelClass() {
    }

    public VideoModelClass(String url, String title) {
        this.url = url;
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
