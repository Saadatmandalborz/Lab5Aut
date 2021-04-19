package WithoutInheritance;

import java.util.ArrayList;

public class Paint {
    private ArrayList<Triangle> triangles;
    private ArrayList<Circle> circles;
    private ArrayList<Rectangle> rectangles;

    public void addTriangle(Triangle triangle){
        triangles.add(triangle);
    }

    public void addCircle(Circle circle){
        circles.add(circle);
    }

    public void addRectangle(Rectangle rectangle){
        rectangles.add(rectangle);
    }

    public void drawAll()
    {
        for(Triangle triangle : triangles)
        {
            triangle.draw();
        }
        for(Circle circle : circles)
        {
            circle.draw();
        }
        for(Rectangle rectangle : rectangles)
        {
            rectangle.draw();
        }
    }

    public void printAll()
    {
        for(Triangle triangle : triangles)
        {
            System.out.println(triangle);
        }
        for(Circle circle : circles)
        {
            System.out.println(circle);
        }
        for(Rectangle rectangle : rectangles)
        {
            System.out.println(rectangle);
        }
    }
}
