package Proxy;

// ImgProxy implements IImage and provides lazy loading functionality.
public class ImageProxy implements Image {
    private String name;
    private RealImage real;

    public ImageProxy(String name) {
        this.name = name;
    }

    @Override
    public void showThumb() {
        System.out.println("Showing thumbnail for " + name);
    }

    @Override
    public void zoom() {
        if (real == null) {
            real = new RealImage(name);
        }
        real.zoom();
    }

    @Override
    public void up(String file) {
        if (real == null) {
            real = new RealImage(name);
        }
        real.up(file);
    }

    @Override
    public void change(String file) {
        if (real == null) {
            real = new RealImage(name);
        }
        real.change(file);
    }
}