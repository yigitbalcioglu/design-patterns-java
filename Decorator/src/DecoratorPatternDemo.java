// Component
interface Coffee {
    String getDescription();
    double getCost();
}

// Concrete Component
class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Sade Kahve";
    }

    @Override
    public double getCost() {
        return 10.0; // Basit kahvenin maliyeti
    }
}

// Decorator
abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee; // Ana bileşeni tutar

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }
}

// Concrete Decorator: Süt ekler
class Milk extends CoffeeDecorator {
    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Süt";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 3.0; // Süt ekleme maliyeti
    }
}

// Concrete Decorator: Şeker ekler
class Sugar extends CoffeeDecorator {
    public Sugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Şeker";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 1.5; // Şeker ekleme maliyeti
    }
}

// Concrete Decorator: Çikolata ekler
class Chocolate extends CoffeeDecorator {
    public Chocolate(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Çikolata";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 4.0; // Çikolata ekleme maliyeti
    }
}


public class DecoratorPatternDemo {
    public static void main(String[] args) {
        // Sade kahve
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " -> Fiyat: " + coffee.getCost() + "₺");

        // Sütlü kahve
        coffee = new Milk(coffee);
        System.out.println(coffee.getDescription() + " -> Fiyat: " + coffee.getCost() + "₺");

        // Şeker ekleyelim
        coffee = new Sugar(coffee);
        System.out.println(coffee.getDescription() + " -> Fiyat: " + coffee.getCost() + "₺");

        // Çikolata ekleyelim
        coffee = new Chocolate(coffee);
        System.out.println(coffee.getDescription() + " -> Fiyat: " + coffee.getCost() + "₺");
    }
}
