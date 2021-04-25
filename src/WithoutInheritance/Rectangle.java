package WithoutInheritance;

import java.util.Arrays;

public class Rectangle {
    private String name;
    private int slides[];

    public Rectangle(String name, int[] slides) {
        this.name = name;
        this.slides = slides;
    }

    public void draw() {
        System.out.print(name+": ");
        for (int slide : slides) {
            System.out.print(slide + " ");
        }
        System.out.println();
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
