package org.learning.springcourse;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class MusicPlayer {

    private Music music1;

    private Music music2;

    public MusicPlayer(Music rockMusic, Music classicalMusic) {
        this.music1 = rockMusic;
        this.music2 = classicalMusic;
    }

    public String playMusic() {
        return "Playing: " + music1.getSong() + ", " + music2.getSong();
    }
}
