package WithInheritance;

import java.util.ArrayList;

public class Paint {
    ArrayList<Shape> shapes;

    public Paint() {
        this.shapes = new ArrayList<>();
    }

    public void addShape(Shape shape)
    {
        shapes.add(shape);
    }

    public void drawAll(){
        for(Shape shape : shapes)
        {
            shape.draw();
        }
    }

    public void printAll(){
        for(Shape shape : shapes)
        {
            System.out.println(shape);
        }
    }
}
