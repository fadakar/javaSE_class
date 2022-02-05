package com.grf.animal;

public class Mp4Player extends MediaPlayer {
    @Override
    protected void load() {
        System.out.println("load mp4 file");
    }

    @Override
    protected void uncompress() {
        System.out.println("uncompress mp4 file");
    }
}
