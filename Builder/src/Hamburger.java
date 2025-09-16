public class Hamburger {
    private final String bread; // Required
    private final String meat;
    private final String cheese;
    private final String vegetables;
    private final String sauce;

    private Hamburger(HamburgerBuilder builder) {
        this.bread = builder.bread;
        this.meat = builder.meat;
        this.cheese = builder.cheese;
        this.vegetables = builder.vegetables;
        this.sauce = builder.sauce;
    }

    @Override
    public String toString() {
        return "Hamburger {" +
                "Bread='" + bread + '\'' +
                ", Meat='" + (meat != null ? meat : "None") + '\'' +
                ", Cheese='" + (cheese != null ? cheese : "None") + '\'' +
                ", Vegetables='" + (vegetables != null ? vegetables : "None") + '\'' +
                ", Sauce='" + (sauce != null ? sauce : "None") + '\'' +
                '}';
    }

    public static class HamburgerBuilder {
        private final String bread; // Required field
        private String meat;
        private String cheese;
        private String vegetables;
        private String sauce;

        public HamburgerBuilder(String bread) { // Constructor forces bread to be set
            this.bread = bread;
        }

        public HamburgerBuilder setMeat(String meat) {
            this.meat = meat;
            return this;
        }

        public HamburgerBuilder setCheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public HamburgerBuilder setVegetables(String vegetables) {
            this.vegetables = vegetables;
            return this;
        }

        public HamburgerBuilder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Hamburger build() {
            return new Hamburger(this);
        }
    }
}
