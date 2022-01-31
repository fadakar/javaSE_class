package com.grf.animal;

import com.grf.animal.abstraction.MediaPlayerMp3;

public class MediaPlayerMp3Imp extends MediaPlayerMp3 {
    @Override
    protected void load() {
        System.out.println("mp3 file load");
    }

    @Override
    protected void uncompress() {
        System.out.println("mp3 file uncompress");
    }
}
