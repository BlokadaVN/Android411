package Dzoop3_Nenashev;

public class Box {
    private float width;
    private float height;


    public Box(float width, float height) {
        setHeight(height);
        setWidth(width);
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        if (width > 0)
            this.width = width;
    }

    public float getHeight() {

        return height;
    }

    public void setHeight(float height) {
        if (height > 0)
            this.height = height;
    }
}
