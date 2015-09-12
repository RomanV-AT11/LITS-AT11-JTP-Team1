
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    public static void main(String[] args) throws JsonMappingException {
        ObjectMapper objectMapper = new ObjectMapper();

        List<Song> songs = null;
        try {
            songs = objectMapper.readValue(new File("songs.json"), objectMapper.getTypeFactory().constructCollectionType(List.class, Song.class));
        } catch (IOException e) {
            System.out.println("Cannot load data");
            return;
        }
        Collections.sort(songs);
        for (Song song : songs) {
            System.out.println(song);
        }


    }
}
