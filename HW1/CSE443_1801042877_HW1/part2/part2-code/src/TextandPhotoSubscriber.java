/**
 * This class represent a subscriber that is interested in text and photograph content present in website
 */
public class TextandPhotoSubscriber implements Observer, Display {

    /**
     * Represents the text content present in the website
     */
    private String text;

    /**
     * Represents the photograph content present in the website
     */
    private String photo;

    /**
     * Represents the website as a subject
     */
    private Subject website;

    /**
     * Constructor to initialize website
     * @param _website represents the subject
     */
    public TextandPhotoSubscriber(Subject _website)
    {
        this.website = _website;
        website.register(this);
        photo = " ";
        text = " ";
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
        boolean isChanged = false;
        if(!text.equalsIgnoreCase(_text)) {
            this.text = _text;
            isChanged = true;
        }

        if(!photo.equalsIgnoreCase(_photo)) {
            this.photo = _photo;
            isChanged = true;
        }

        if (isChanged == true)
            display();
    }

    /**
     * This method prints information on the screen
     */
    public void display()
    {
        System.out.println("An update has arrived");
        System.out.println("Text of the day : " + text + " ~ Photograph of the day : " + photo + '\n');
    }
}
