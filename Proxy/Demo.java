package Proxy;

// Client code demonstrating the use of lazy loading and protection proxies.
public class Demo {
    public static void main(String[] args) {
        // Create a lazy loading proxy for a property image.
        Image img = new ImageProxy("estate.jpg");
        img.showThumb();  // Immediately display the thumbnail

        // When the user zooms in, the full-res image is loaded and displayed.
        img.zoom();

        // Attempt to upload a new image via the protection proxy without authorization.
        Image noAuth = new AuthProxy(img, false);
        noAuth.up("new_estate.jpg");

        // With authorization, the upload is permitted.
        Image auth = new AuthProxy(img, true);
        auth.up("new_estate.jpg");
    }
}