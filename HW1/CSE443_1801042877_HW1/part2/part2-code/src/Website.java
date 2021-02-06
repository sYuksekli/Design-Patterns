import java.util.ArrayList;

/**
 *  This class represents a website that shares
 *  the information, music or photograph of the day.
 *  Subscribed users can be informed of the photographs, music
 *  or articles shared every day when new updates are made.
 */
public class Website implements Subject{

    /**
     * Represents list of subscribers
     */
    private ArrayList<Observer> observers;

    /**
     * Represents the text contents present in the website
     */
    private String contentText;

    /**
     * Represents the photograph content present in the website
     */
    private  String contentPhoto;

    /**
     * Represents the audio content present in the website
     */
    private String contentAudio;

    /**
     * No parameter constructor
     * It initialize observers list with ten capacity and zero subscriber
     */
    public Website() {
        observers = new ArrayList<>();
    }

    /**
     * This method adds an observer to the list of subscribers
     * @param o represents a subscriber
     */
    public void register(Observer o)
    {
        boolean isExist = observers.contains(o);
        if (!isExist) {
            observers.add(o);
        }
    }

    /**
     * This method removes an observer from list of subscribers
     * @param o represents a subscriber
     */
    public void unregister(Observer o)
    {
        observers.remove(o);
    }

    /**
     * This method notifies all the observers when an update occurs.
     */
    public void notifyObservers()
    {
        for (Observer currentObserver : observers)
            currentObserver.update(contentText, contentPhoto, contentAudio);
    }

    /**
     * This method calls the notifyObservers method to inform observers.
     */
    public void websiteUpdated() {
        notifyObservers();
    }

    /**
     * Setter method to test program
     * It acts as if the content on the website has changed.
     * @param _text represents the text content present in the website
     * @param _photo represents the photograph content present in the website
     * @param _audio represents the audio content present in the website
     */
    public void updateInformation(String _text, String _photo, String _audio) {
        this.contentText = _text;
        this.contentPhoto = _photo;
        this.contentAudio = _audio;

        websiteUpdated();
    }

}
