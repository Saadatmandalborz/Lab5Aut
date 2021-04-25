package WithoutInheritance;

import java.util.Arrays;

public class Triangle {
    private int slides[];
    private String name;
    public Triangle(String name,int[] slides) {
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
}
