package WithInheritance;

import java.util.Arrays;

public class Triangle extends Polygon{
    public Triangle(String name, int[] slides) {
        super(name, slides);
    }

    public boolean isEquilateral(){
        return slides[0] * slides[0] == slides[1] * slides[1] + slides[2] * slides[2]
                || slides[1] * slides[1] == slides[0] * slides[0] + slides[2] * slides[2] ||
                slides[2] * slides[2] == slides[0] * slides[0] + slides[1] * slides[1];
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "slides=" + Arrays.toString(slides) +
                " | Equilateral: " + isEquilateral() + "}";
    }

    @Override
    public double getArea() {
        return (double)(slides[0] + slides[1] + slides[2])/2;
    }
}
