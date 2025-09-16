public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedColor());
        Shape blueSquare = new Square(new BlueColor());

        redCircle.draw();
        blueSquare.draw();
    }
}

// Refined Abstraction 1
class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    public void draw() {
        System.out.print("Daire çiziliyor. ");
        color.applyColor();
    }
}

// Refined Abstraction 2
class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    public void draw() {
        System.out.print("Kare çiziliyor. ");
        color.applyColor();
    }
}

// Abstraction
abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract void draw();
}

// Concrete Implementor 1
class RedColor implements Color {
    public void applyColor() {
        System.out.println("Kırmızı renk uygulanıyor.");
    }
}

// Concrete Implementor 2
class BlueColor implements Color {
    public void applyColor() {
        System.out.println("Mavi renk uygulanıyor.");
    }
}

// Implementor
interface Color {
    void applyColor();
}
