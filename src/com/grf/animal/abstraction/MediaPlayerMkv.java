package com.grf.animal.abstraction;


public abstract class MediaPlayerMkv  {

    protected String filePath;

    public void checkFile(){
        System.out.println("check mkv file");
    }

    public final void play(){
        load();
        checkFile();
        uncompress();
        System.out.println("mkv play");
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
