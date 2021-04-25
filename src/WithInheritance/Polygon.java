package WithInheritance;

public abstract class Polygon extends Shape{
    int [] slides;

    public Polygon(String name,int[]slides) {
        super(name);
        this.slides = slides;
    }

    public void draw() {
        System.out.print(name+": ");
        for (int slide : slides) {
            System.out.print(slide + " ");
        }
        System.out.println();
    }
}
