package com.grf.animal;

import com.grf.animal.abstraction.MediaPlayerMkv;

public class MediaPlayerMkvImp extends MediaPlayerMkv {

    @Override
    protected void load() {
        System.out.println("mkv file load");
    }

    @Override
    protected void uncompress() {
        System.out.println("mkv file uncompress");
    }
}
