package Proxy;

public class AuthProxy implements Image {
    private Image img;
    private boolean auth; // true if agent is logged in

    public AuthProxy(Image img, boolean auth) {
        this.img = img;
        this.auth = auth;
    }

    @Override
    public void showThumb() {
        img.showThumb();
    }

    @Override
    public void zoom() {
        img.zoom();
    }

    @Override
    public void up(String file) {
        if (!auth) {
            System.out.println("Access denied: Not logged in.");
        } else {
            img.up(file);
        }
    }

    @Override
    public void change(String file) {
        if (!auth) {
            System.out.println("Access denied: Not logged in.");
        } else {
            img.change(file);
        }
    }
}
