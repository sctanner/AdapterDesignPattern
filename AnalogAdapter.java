/**
 * This class represents an adapter that allows a DigitalAlbum to 
 * act as an AnalogAlbum.
 * This class implements AnalogAlbum. The functions implemented call the 
 * functions from DigitalAlbum, effectively converting a 
 * DigitalAlbum into an AnalogAlbum.
 * @author Steven Tanner
 */
public class AnalogAdapter implements AnalogAlbum{
    
    //A DigitalAlbum to call the DigitalAlbum functions
    private DigitalAlbum album;

    /**
     * Constructor class for AnalogAdapter.
     * Sets the private album to the one that is passed in through param.
     * @param album
     */
    public AnalogAdapter(DigitalAlbum album){
        this.album = album;
    }

    /**
     * @return album.nextSong()
     */
    public String play(){
        return album.nextSong();
    }

    /**
     * @return album.prevSong()
     */
    public String rewind(){
        return album.prevSong();
    }

    /**
     * @return album.nextSong()
     */
    public String ffwd(){
        return album.nextSong();
    }

    /**
     * @return album.pause()
     */
    public String pause(){
        return album.pause();
    }

    /**
     * @return album.stop()
     */
    public String stopEject(){
        return album.stop();
    }

}
