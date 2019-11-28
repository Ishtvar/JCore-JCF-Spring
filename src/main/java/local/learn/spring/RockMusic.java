package local.learn.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music{
    private List<String> musicList= new ArrayList<>();

    public RockMusic (List<String> musicList) {
        musicList.add("Wind cries Mary");
        musicList.add("In the end");
        musicList.add("Show must go on");
        this.musicList = musicList;

    }
    @Override
    public String getSong() {
        String song = this.musicList.get(new Random().nextInt(3));
        return song;
    }
}
