public class Hamburger implements Cloneable {
    private String bread;
    private String meat;
    private String cheese;
    private String vegetables;
    private String sauce;
    private transient String secretSauce; // Bu alan klonlanmayacak

    public Hamburger(String bread) {
        this.bread = bread;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void setVegetables(String vegetables) {
        this.vegetables = vegetables;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setSecretSauce(String secretSauce) {
        this.secretSauce = secretSauce;
    }

    public String getSecretSauce() {
        return "Gizli bilgiye erişemezsiniz!"; // Direkt erişimi engelliyoruz
    }

    @Override
    public Hamburger clone() {
        try {
            Hamburger cloned = (Hamburger) super.clone();
            cloned.secretSauce = null; // Gizli bilgiyi klonlamıyoruz
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported!", e);
        }
    }

    @Override
    public String toString() {
        return "Hamburger {" +
                "Bread='" + bread + '\'' +
                ", Meat='" + (meat != null ? meat : "None") + '\'' +
                ", Cheese='" + (cheese != null ? cheese : "None") + '\'' +
                ", Vegetables='" + (vegetables != null ? vegetables : "None") + '\'' +
                ", Sauce='" + (sauce != null ? sauce : "None") + '\'' +
                ", SecretSauce='" + (secretSauce != null ? "****" : "None") + '\'' + // Gizlenmiş gösterim
                '}';
    }
}
