/**
 * This is an interface class for CD.
 * It declares the functions that the listener classes must implement.
 * @author Steven Tanner
 */
public interface DigitalAlbum {
    
    public String playFromBeginning();
    public String playSong(int num);
    public String prevSong();
    public String nextSong();
    public String stop();
    public String pause();


}
