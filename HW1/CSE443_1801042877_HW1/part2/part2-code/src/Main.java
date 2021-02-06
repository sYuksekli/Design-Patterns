/**
 * Driver class for testing
 */
public class Main {

    public static void main(String[] args) {

        // Subject
        Website site = new Website();

        // Observers
        TextSubscriber textObserver = new TextSubscriber(site);
        AudioSubscriber audioObserver = new AudioSubscriber(site);
        TextandPhotoSubscriber text_photoObserver = new TextandPhotoSubscriber(site);

        // text, photo and audio has updated
        String text = "Bir ulus, sımsıkı birbirine bağlı olmayı bildikçe yeryüzünde onu dağıtabilecek bir güç düşünülemez.";
        String photo = "Hubble Captures Cosmic Cinnamon Bun";
        String audio = "Queen - Radio Ga Ga";
        site.updateInformation(text, photo, audio);

        // text, photo and audio has updated
        text = "Sanatsız kalan bir milletin hayat damarlarından biri kopmuş demektir.";
        photo = "Hubble Views a Galactic Waterfall";
        audio = "Easy Life - Nightmares";
        site.updateInformation(text, photo, audio);

        // Only photo and audio has updated
        photo = "Hubble Catches a Cosmic Cascade";
        audio = "Ahmet Aslan - Minnet Eylemem";
        site.updateInformation(text, photo, audio);


    }
}
