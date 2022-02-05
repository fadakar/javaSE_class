package com.grf.animal;

public class MkvPlayer  extends MediaPlayer {
    @Override
    protected void load() {
        System.out.println("load mkv file");
    }

    @Override
    protected void uncompress() {
        System.out.println("uncompress mkv file");
    }
}
