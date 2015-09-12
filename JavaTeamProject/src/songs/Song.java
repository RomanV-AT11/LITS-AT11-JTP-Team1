package songs;

public class Song  implements Comparable<Song>{

	
    String name;
    String author;
    Long duration;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", duration=" + duration +
                '}';
    }

    @Override
    public int compareTo(Song o) {
        if(!this.name.equals(o.name)){
            return name.compareTo(o.name);
        }
        if(!this.author.equals(o.author)){
            return this.author.compareTo(o.author);
        }
        if(!this.duration.equals(o.duration)){
            return this.duration.compareTo(o.duration);
        }
        return 0;
    }
}