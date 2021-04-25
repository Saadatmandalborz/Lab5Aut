package WithInheritance;

public class Circle extends Shape{
    private float radius;

    public Circle(String name,float radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(name +": " + radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
