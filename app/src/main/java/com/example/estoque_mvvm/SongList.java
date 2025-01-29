package com.example.estoque_mvvm;

public class SongList {
    int songImage;
    String songTitle;
    String songArtist;

    public SongList(int songImage, String songTitle, String songArtist) {
        this.songImage = songImage;
        this.songTitle = songTitle;
        this.songArtist = songArtist;
    }

    public int getSongImage() {
        return songImage;
    }

    public void setSongImage(int songImage) {
        this.songImage = songImage;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public String getSongArtist() {
        return songArtist;
    }

    public void setSongArtist(String songArtist) {
        this.songArtist = songArtist;
    }
}
