package com.a_liutarovich.gifsearcher.Models;

public class Data {

    private String type;
    private String id;
    private String slug;
    private String url;
    private Images images;
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "Data{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", slug='" + slug + '\'' +
                ", url='" + url + '\'' +
                ", images=" + images +
                '}';
    }
}