package WithInheritance;

public class Main {
    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.addShape(new Circle("Dayere 1",10));
        paint.addShape(new Rectangle("Moraba" , new int[]{3, 3, 3, 3}));
        paint.addShape(new Triangle("Ghaemolzavie",new int[]{3,4,5}));
        System.out.println("Draw all: ");
        paint.printAll();
        System.out.println("\n\nPrint all:");
        paint.drawAll();
    }
}
