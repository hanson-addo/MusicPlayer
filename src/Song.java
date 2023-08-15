
public class Song {
	private String title;
	private String artist;
    private double duration;

    public Song( String artist, String title, double duration) {
        this.title = title;
        this.duration = duration;
        this.artist = artist;
    }
    public Song(){ }

    public String getArtist() {
        return artist;
    }
    
    public void setArtist(String artist) {
    	this.artist = artist;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
    	this.title = title;
    }

    public double getDuration() {
        return duration;
    }
    public void setDuration(double duration) {
    	this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
