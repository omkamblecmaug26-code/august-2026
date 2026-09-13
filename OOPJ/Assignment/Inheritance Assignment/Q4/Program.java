public class Program {
    public static void main(String[] args) {

        Square square = new Square();

        square.printShape();     // inherited from Shape
        square.printRectangle();  // inherited from Rectangle
        square.printSquare();      // Square's own method
    }
}
