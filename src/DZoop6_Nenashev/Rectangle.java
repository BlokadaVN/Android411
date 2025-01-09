package DZoop6_Nenashev;

public class Rectangle implements Size {

    private int w;
    private int h;

    public Rectangle(int w, int h) {
        this.w = w;
        this.h = h;
    }

    public int getW() {
        return w;
    }

    public int getH() {
        return h;
    }

    @Override
    public int resizeWidth(int width) {
        if (width <= 0)
            return w;
        else
            return width;
    }

    @Override
    public int resizeHeight(int height) {
        if (height <= 0)
            return h;
        else
            return height;
    }


}
