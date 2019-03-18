package com.overcome.mode.adapter;

public class MediaPlayerAdapter implements MediaPlayer {

    /** 使用依赖型注入 */
    private AdvanceMediaPlayer advanceMediaPlayer;

    public MediaPlayerAdapter(String fileType) {
        if (fileType.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer = new Mp4Player();
        } else {
            System.out.println("默认播放mp3");
        }
    }


    @Override
    public void play(String fileType, String fileName) {
        advanceMediaPlayer.playmp4(fileName);
    }
}
