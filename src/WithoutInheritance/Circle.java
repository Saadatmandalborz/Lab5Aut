package WithoutInheritance;

public class Circle {
    private String name;
    private float radius;

    public Circle(String name, float radius) {
        this.name = name;
        this.radius = radius;
    }


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
