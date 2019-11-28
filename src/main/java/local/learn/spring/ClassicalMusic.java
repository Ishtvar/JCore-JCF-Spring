package local.learn.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music {
    private List<String> musicList;

    public ClassicalMusic(List<String> musicList) {
        musicList.add("Hungarian Rhapsody");
        musicList.add("Morning mood");
        musicList.add("The Blue Danube");
        this.musicList = musicList;
    }


    @Override
    public String getSong() {
        String song;
        song = this.musicList.get(new Random().nextInt(3));
        return song;
    }
}
