package com.grf.animal;

public class MediaPlayerFacade {
    private Mp4Player mp4Player;
    private MkvPlayer mkvPlayer;

    public MediaPlayerFacade() {
        mp4Player = new Mp4Player();
        mkvPlayer = new MkvPlayer();
    }

    public IMediaPlayer mp4MediaPlayer() {
        return mp4Player;
    }

    public IMediaPlayer mkvMediaPlayer() {
        return mkvPlayer;
    }
}
