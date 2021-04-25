package WithoutInheritance;


public class Main {
    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.addCircle(new Circle("Dayere 1",10));
        paint.addRectangle(new Rectangle("Moraba" , new int[]{3, 3, 3, 3}));
        paint.addTriangle(new Triangle("Ghaemolzavie",new int[]{3,4,5}));
        System.out.println("Draw all: ");
        paint.printAll();
        System.out.println("\n\nPrint all:");
        paint.drawAll();
    }
}
