package WithInheritance;

public abstract class Shape {
    String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract void draw();
    public abstract double getArea();
    public abstract double getPerimeter();
}
