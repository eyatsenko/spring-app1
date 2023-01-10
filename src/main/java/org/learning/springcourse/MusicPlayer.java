package org.learning.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> playMusicList = new ArrayList<>();
    private String name;
    private int volume;

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

    public List<Music> getPlayMusicList() {
        return playMusicList;
    }

    public void setPlayMusicList(List<Music> playMusicList) {
        this.playMusicList = playMusicList;
    }

    public void playMusic(List<Music> musicList) {
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }
}
