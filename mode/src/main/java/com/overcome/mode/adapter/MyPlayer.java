package com.overcome.mode.adapter;

/**
 * 我的播放器
 * V1：只能播放mp3类型的歌曲
 * V2：还能播放mp4类型的电影
 */
public class MyPlayer implements MediaPlayer {

    MediaPlayerAdapter adapter;

    public static void main(String[] args) {
        MyPlayer p = new MyPlayer();
        p.play("mp4", "我的天空");
        p.play("mp3", "我的天空");
    }

    @Override
    public void play(String fileType, String fileName) {
        if (fileType.equals("mp4")) {
            adapter =  new MediaPlayerAdapter(fileType);
            adapter.play(fileType, fileName);
        } else {
            System.out.println("不支持格式: " + fileName);
        }
    }
}
