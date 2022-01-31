package com.grf.animal;

public class Main {
    public static void main(String[] args) {
        MediaPlayerMkvImp mediaPlayerMkvImp = new MediaPlayerMkvImp();
        mediaPlayerMkvImp.setFilePath("c:/a.mkv");
        mediaPlayerMkvImp.play();

        System.out.println("========================");
        MediaPlayerMp3Imp mediaPlayerMp3Imp = new MediaPlayerMp3Imp();
        mediaPlayerMp3Imp.setFilePath("c:/a.mp3");
        mediaPlayerMp3Imp.play();

        System.out.println("========================");
        MediaPlayerMp4Imp mediaPlayerMp4 = new MediaPlayerMp4Imp();
        mediaPlayerMp4.setFilePath("c:/a.mp4");
        mediaPlayerMp4.play();
        // singleton , factory , facade , builder , prototyping

    }
}
