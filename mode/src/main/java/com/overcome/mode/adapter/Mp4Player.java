package com.overcome.mode.adapter;

public class Mp4Player implements AdvanceMediaPlayer {

    @Override
    public void playmp4(String fileName) {
        System.out.println("播放mp4文件: " + fileName);
    }
}
