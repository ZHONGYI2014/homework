package com.overcome.mode.adapter;

public class MediaPlayerAdapter implements MediaPlayer {

    /** 使用依赖型注入 */
    private AdvanceMediaPlayer advanceMediaPlayer;

    public MediaPlayerAdapter(String audioType) {
        if (audioType.equals("mp4")) {
            advanceMediaPlayer = new Mp4Player();
        }
    }


    @Override
    public void play(String fileName) {
        advanceMediaPlayer.playmp4(fileName);
    }
}
