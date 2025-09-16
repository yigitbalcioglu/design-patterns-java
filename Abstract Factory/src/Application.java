public class Application {
    private GUIFactory factory;
    private Button button;
    private TextBox textBox;

    public Application(GUIFactory factory) {
        this.factory = factory;
    }

    public void createUI() {
        button = factory.createButton();
        textBox = factory.createTextBox();
    }

    public void renderUI() {
        button.render();
        textBox.render();
    }

    public static void main(String[] args) {
        // Koyu Tema kullan
        Application app = new Application(new DarkThemeFactory());
        app.createUI();
        app.renderUI();

        // Açık Tema kullan
        Application app2 = new Application(new LightThemeFactory());
        app2.createUI();
        app2.renderUI();
    }
}