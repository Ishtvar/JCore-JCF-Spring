package local.learn.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;
    private MusicGenre musicGenre;
@Autowired
    public Computer(MusicPlayer musicPlayer) {
    int r = new Random().nextInt(2);
    if (r == 0) this.musicGenre = MusicGenre.CLASSICAL;
    else this.musicGenre = MusicGenre.ROCK;
    this.id = 1;
        this.musicPlayer = musicPlayer;

    }

    @Override
    public String toString() {
        return "id = " + id + " " +
                musicPlayer.playMusic(musicGenre);
    }
}
