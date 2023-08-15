import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

	private String name;
    private String artist;
    private ArrayList<Song> songs;
    
    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }
    
    public Album(){}
    
    public Song findSong(String title, String artist){
        for(Song checkedSong : songs){
            if(checkedSong.getTitle().equalsIgnoreCase(title) && checkedSong.getArtist().equalsIgnoreCase(artist)) 
            	return checkedSong;
        }
        return null;
    }
    
    public boolean addSong( String artist, String title, double duration){
        if(findSong(title,artist) == null){
            songs.add(new Song(artist,title,duration));
            return true; //successfully added to the list
        }
        else {
            return false; // already exist in the list
        }
    }
    
    public boolean addToPlayList(int trackNumber, LinkedList<Song> PlayList){
        int index = trackNumber - 1;
        if(index > 0 && index <= this.songs.size()){
            PlayList.add(this.songs.get(index));
            return true;
        }
        return false; //this album does not have song with trackNumber
    }
    
    public boolean addToPlayList(String artist, String title, LinkedList<Song> PlayList){
        for(Song checkedSong : this.songs){
            if(checkedSong.getTitle().equalsIgnoreCase(title) && checkedSong.getArtist().equalsIgnoreCase(artist)) {
                PlayList.add(checkedSong);
                return true;
            }
        }
        return false; //there is no such song in album
    }
}
