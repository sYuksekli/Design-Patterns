/**
 * This class represent a subscriber that is interested in audio content present in website
 */
public class AudioSubscriber implements Observer,Display {

    /**
     * Represents the text content present in the website
     */
    private String audio;

    /**
     * Represents the website as a subject
     */
    private Subject website;

    /**
     * Constructor to initialize website
     * @param _website represents the subject
     */
    public AudioSubscriber(Subject _website)
    {
        this.website = _website;
        website.register(this);
        audio = " ";
    }

    /**
     * This method updates the text and photograph information if there has been a change
     * Otherwise, it does not do anything
     * @param _text represents the text content present in the website
     * @param _photo represents the photograph content present in the website
     * @param _audio represents the text audio present in the website
     */
    public void update(String _text, String _photo, String _audio)
    {
        if(!audio.equalsIgnoreCase(_audio)) {
            this.audio = _audio;
            display();
        }
    }

    /**
     * This method prints information on the screen
     */
    public void display()
    {
        System.out.println("An update has arrived");
        System.out.println("Music of the day : " + audio + '\n');
    }
}
