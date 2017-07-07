package com.example.jinva02.top10downloader20;

/**
 * Created by jinva02 on 7/3/2017.
 */

public class Application {

    private String name;
    private String artist;
    private String releaseDate;
    private String imageUrl;

    public Application() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Artist: " + artist + "\n" +
                "ReleaseDate: " + releaseDate + "\n";
    }
}
