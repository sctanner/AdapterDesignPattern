import java.util.ArrayList;
/**
 * Cassett is a class that implements AnalogAlbum.
 * Cassett implements methods representing actions that can be carried out by
 * a cassett tape. 
 * @author Steven Tanner
 */
public class Cassett implements AnalogAlbum{

    //ArrayList containing the name of the songs that the cassett contains
    private ArrayList<String> songs = new ArrayList<String>();
    //Integer representing the current song that is playing (for ArrayList indexing)
    private int currentIndex;

    /**
     * Constructor for Cassett. It takes in 5 Strings that are song names.
     * These strings are then added to the ArrayList of songs. 
     * @param song1
     * @param song2
     * @param song3
     * @param song4
     * @param song5
     */
    public Cassett(String song1, String song2, String song3, String song4, String song5){
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
    }

    /**
     * Plays a song and increments index. If at the end, 
     * returns a message saying you need to rewind
     * @return String with song number and song name
     */
    public String play(){
        if(currentIndex > 4) return ("At the end of the cassett you need to rewind");
        currentIndex++;
        return ("Playing song " + (currentIndex)+ ": " + songs.get(currentIndex-1));
    }

    /**
     * Rewinds to the previous song, decrementing index
     * @return which song was rewinded to
     */
    public String rewind(){
        if(currentIndex < 1){
            return "Fully Re-Wound";
        }
        currentIndex--;
        return ("Rewinding to song " + (currentIndex+1));
    }

    /**
     * Forwards to the next song, incrementing index.
     * If already at the last song, returns saying it must rewind.
     * If forward reaches the last song, returns saying end of cassett
     * @return song that was forwarded to
     */
    public String ffwd(){
        if(currentIndex >= 4) return "At the end of the cassett you need to rewind";
        currentIndex++;
        if(currentIndex == 4) return "Forwarded to the end of the cassett";
        
        return ("Forwarded to song "+ (currentIndex+1));
    }

    /**
     * Pauses song.
     * @return "Pausing..."
     */
    public String pause(){
        return "Pausing...";
    }

    /**
     * Stops music and ejects cassett
     * @return "Stopping cassett and ejecting"
     */
    public String stopEject(){
        return "Stopping cassett and ejecting";
    }



}
