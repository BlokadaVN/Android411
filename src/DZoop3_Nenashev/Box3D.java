package DZoop3_Nenashev;

public class Box3D extends Box {

    private float depth;

    public Box3D(float width, float height, float depth) {
        super(width, height);
        setDepth(depth);
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        if (depth > 0)
            this.depth = depth;
    }

    public float area() {
        return getWidth() * getHeight() * depth;
    }

    @Override
    public String toString() {
        return super.toString() + " Box3D{" +
                "depth=" + depth +
                '}';
    }
}
