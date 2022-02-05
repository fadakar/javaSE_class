package com.grf.animal;

public abstract class MediaPlayer {
    protected abstract void load();

    protected abstract void uncompress();

    public final void play() {
        load();
        uncompress();
    }
}
