package com.overcome.mode.adapter;

/**
 * 我的播放器
 * V1：只能播放mp3类型的歌曲
 * V2：还能播放mp4类型的电影
 */
public class MyPlayer implements MediaPlayer {

    MediaPlayerAdapter adapter;

    @Override
    public void play(String fileName) {
        adapter.play(fileName);
    }

    public static void main(String[] args) {

    }
}
