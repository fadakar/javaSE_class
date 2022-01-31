package com.grf.animal.abstraction;


public abstract class MediaPlayerMp3 {

    protected String filePath;

    public final void play(){
        load();
        uncompress();
        System.out.println("mp3 play");
    }

    protected abstract void load();
    protected abstract void uncompress();

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
