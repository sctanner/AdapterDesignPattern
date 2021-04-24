/**
 * This is an interface class for Cassett and AnalogAdapter.
 * It declares the functions that the listener classes must implement.
 * @author Steven Tanner
 */
public interface AnalogAlbum {
    
    public String play();
    public String rewind();
    public String ffwd();
    public String pause();
    public String stopEject();

}
