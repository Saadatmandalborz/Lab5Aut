package WithInheritance;

import java.util.Arrays;

public class Rectangle extends Polygon{

    public Rectangle(String name, int[] slides) {
        super(name, slides);
    }

    public boolean isSquare(){
        return slides[0] == slides[1] && slides[2] == slides[3] && slides[0] == slides[3];
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "slides=" + Arrays.toString(slides) +
                " | Square: " + isSquare() + "}";
    }
}
