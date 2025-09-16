public class Main {
    public static void main(String[] args) {
        // Creating a hamburger with only bread (minimum required)
        Hamburger simpleBurger = new Hamburger.HamburgerBuilder("Sesame Bun").build();
        System.out.println(simpleBurger);

        // Creating a hamburger with extra ingredients
        Hamburger deluxeBurger = new Hamburger.HamburgerBuilder("Brioche Bun")
                .setMeat("Beef Patty")
                .setCheese("Cheddar")
                .setVegetables("Lettuce, Tomato, Pickles")
                .setSauce("Mayonnaise")
                .build();
        System.out.println(deluxeBurger);
    }
}
