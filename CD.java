import java.util.ArrayList;
/**
 * Class that represents a CD album  and implements DigitalAlbum.
 * Functions are actions that a CD can preform, such as pause, skip, rewind, etc.
 * @author Steven Tanner
 */
public class CD implements DigitalAlbum{
    
    private ArrayList<String> songs = new ArrayList<String>();
    private int currentIndex;
    
    /**
     * Constructor for CD. It takes in 5 Strings that are song names.
     * These strings are then added to the ArrayList of songs. 
     * @param song1
     * @param song2
     * @param song3
     * @param song4
     * @param song5
     */
    public CD(String song1, String song2, String song3, String song4, String song5){
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
        
    }

    /**
     * Sets index to 0, and starts playing for first song
     * @return "Playing song 1: SONG_NAME"
     */
    public String playFromBeginning(){
        currentIndex=0;
        return ("Playing song 1: " + songs.get(currentIndex)) ;
    }

    /**
     * This method takes in an integer and plays the associated song.
     * If the number is not valid, returns "Not a valid song number"
     * @param num representing which song number to play
     * @return "Playing SONG_NAME"
     */
    public String playSong(int num){
        if(num>0 && num<6){
            currentIndex = num-1;
            return ("Playing " + songs.get(currentIndex));
        }
        return "Not a valid song number";
    }

    /**
     * Skips back one song, decrementing index
     * @return Skipping back and playing SONG_NAME
     */
    public String prevSong(){
        if(currentIndex>0){
            currentIndex--;
        }
        return ("Skipping back and playing: " + songs.get(currentIndex-1));
    }

    /**
     * Goes to next song, incrementing index.
     * If already at the end, calls playFromBeginning()
     * @return Playing index: SONG_NAME
     */
    public String nextSong(){
        if(currentIndex > 5){
            playFromBeginning();
        }
        currentIndex++;
        return ("Playing " + (currentIndex) + ": " + songs.get(currentIndex-1));
        
    }
    /**
     * @return "Pausing..."
     */
    public String pause(){
        return "Pausing...";
    }

    /**
     * Resets index to 0
     * @return "Stopping cassett and ejecting"
     */
    public String stop(){
        currentIndex = 0;
        return "Stopping cassett and ejecting";
    }






}
