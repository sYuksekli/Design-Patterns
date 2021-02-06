/**
 * Observer interface to use in observer design pattern
 */
public interface Observer {

    /**
     * This method updates the information if there has been a change.
     * @param _text represents the text content present in the website
     * @param _photo represents the photograph content present in the website
     * @param _audio represents the text audio present in the website
     */
    void update(String _text, String _photo, String _audio);
}
