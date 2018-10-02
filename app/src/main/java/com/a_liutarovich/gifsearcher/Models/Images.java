package com.a_liutarovich.gifsearcher.Models;

public class Images {
    private FixedHeightStill fixed_height_downsampled;
    private String title;

    public FixedHeightStill getFixed_height_still() {
        return fixed_height_downsampled;
    }

    public void setFixed_height_still(FixedHeightStill fixed_height_still) {
        this.fixed_height_downsampled = fixed_height_still;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Images{" +
                "fixed_height_still=" + fixed_height_downsampled +
                ", title='" + title + '\'' +
                '}';
    }
}
