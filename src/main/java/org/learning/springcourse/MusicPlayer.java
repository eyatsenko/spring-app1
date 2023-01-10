package org.learning.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
//    private List<Music> playMusicList = new ArrayList<>();
    private Music music;
    private String name;
    private int volume;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    //    public List<Music> getPlayMusicList() {
//        return playMusicList;
//    }

//    public void setPlayMusicList(List<Music> playMusicList) {
//        this.playMusicList = playMusicList;
//    }

    public void playMusic() {
//        for (Music music : musicList) {
//            System.out.println("Playing: " + music.getSong());
//        }
        System.out.println("Playing: " + music.getSong());
    }
}
