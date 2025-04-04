package Proxy;

// Define the IImage interface
public interface Image {
    void showThumb();    // Display low-res thumbnail
    void zoom();         // Display full-res image on demand
    void up(String file);    // Upload a new image
    void change(String file); // Replace the current image
}