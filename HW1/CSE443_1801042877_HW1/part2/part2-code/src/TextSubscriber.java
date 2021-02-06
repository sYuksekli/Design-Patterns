/**
 * This class represent a subscriber that is interested in text content present in website
 */
public class TextSubscriber implements Observer, Display  {

    /**
     * Represents the text content present in the website
     */
    private String text;

    /**
     * Represents the website as a subject
     */
    private Subject website;

    /**
     * Constructor to initialize website
     * @param _website represents the subject
     */
    public TextSubscriber(Subject _website)
    {
        this.website = _website;
        website.register(this);
        text = " ";
    }

    /**
     * This method updates the text information if there has been a change
     * Otherwise, it does not do anything
     * @param _text represents the text content present in the website
     * @param _photo represents the photograph content present in the website
     * @param _audio represents the text audio present in the website
     */
    public void update(String _text, String _photo, String _audio)
    {
        if(!text.equalsIgnoreCase(_text)) {
            this.text = _text;
            display();
        }
    }

    /**
     * This method prints information on the screen
     */
    public void display()
    {
        System.out.println("An update has arrived");
        System.out.println("Text of the day : " + text + '\n');
    }

}
