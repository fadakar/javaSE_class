package com.grf.animal;

import com.grf.animal.abstraction.MediaPlayerMp4;

public class MediaPlayerMp4Imp extends MediaPlayerMp4 {
    @Override
    protected void load() {
        System.out.println("mp4 file load");
    }

    @Override
    protected void uncompress() {
        System.out.println("mp4 file uncompress");
    }
}
