package com.grf.animal;

public class Main {
    public static void main(String[] args) {
        MediaPlayerFacade mediaPlayerFacade = new MediaPlayerFacade();
        mediaPlayerFacade.mp4MediaPlayer().play();
        mediaPlayerFacade.mkvMediaPlayer().play();

    }
}
