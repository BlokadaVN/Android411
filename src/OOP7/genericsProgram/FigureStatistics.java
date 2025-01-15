package OOP7.genericsProgram;

public class FigureStatistics<T extends Figure> {
    T[] arr1;

    public FigureStatistics(T[] arr1) {
        this.arr1 = arr1;
    }

    public double getSumArea() {
        double result = 0;
        for (int i = 0; i < arr1.length; i++) {
            result += arr1[i].getArea();
        }
        return result;
    }

    public double getMaxArea() {
        double maxArea = Double.MIN_VALUE;

        for (int i = 0; i < arr1.length; i++) {
            if (maxArea < arr1[i].getArea()) {
                maxArea = arr1[i].getArea();
            }
        }
        return maxArea;
    }

    public double getMinArea() {
        double minArea = Double.MAX_VALUE;

        for (int i = 0; i < arr1.length; i++) {
            if (minArea > arr1[i].getArea()) {
                minArea = arr1[i].getArea();
            }
        }
        return minArea;
    }
}
