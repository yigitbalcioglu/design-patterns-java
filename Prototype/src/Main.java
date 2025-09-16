public class Main {
    public static void main(String[] args) {
        // Orijinal hamburger oluşturma
        Hamburger originalBurger = new Hamburger("Sesame Bun");
        originalBurger.setMeat("Beef Patty");
        originalBurger.setCheese("Cheddar");
        originalBurger.setVegetables("Lettuce, Tomato");
        originalBurger.setSauce("BBQ Sauce");
        originalBurger.setSecretSauce("Special Spicy Mix");

        System.out.println("Original: " + originalBurger);

        // Klonlama işlemi
        Hamburger clonedBurger = originalBurger.clone();

        System.out.println("Cloned: " + clonedBurger);
        System.out.println("Cloned Secret Sauce Access: " + clonedBurger.getSecretSauce());
    }
}
