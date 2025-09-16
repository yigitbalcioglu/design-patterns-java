public class AdapterOrnek {
    public static void main(String[] args) {
        // 220V'luk standart ev prizi
        StandartEvPrizi evPrizi = new StandartEvPrizi();

        // 220V'u 5V'a dönüştüren adaptör
        ElektrikAdapteri adapter = new ElektrikAdapteri(evPrizi);

        // Telefon şarj cihazı adaptör üzerinden elektrik alır
        TelefonSarjCihazi telefon = new TelefonSarjCihazi();
        telefon.sarjEt(adapter.saglaElektrik()); // 5V ile çalışacak
    }
}

// Adaptör, 220V'u 5V'a çevirerek telefon şarj cihazına uygun hale getirir
class ElektrikAdapteri implements ElektrikPrizi {
    private StandartEvPrizi evPrizi;

    public ElektrikAdapteri(StandartEvPrizi evPrizi) {
        this.evPrizi = evPrizi;
    }

    @Override
    public int saglaElektrik() {
        int evVoltaji = evPrizi.saglaElektrik();
        return donustur(evVoltaji);
    }

    private int donustur(int voltaj) {
        System.out.println("Adaptör " + voltaj + "V'u 5V'a çeviriyor...");
        return 5; // 220V'u 5V'a düşürüyoruz
    }
}

// Telefon şarj cihazı 5V ile çalışır
class TelefonSarjCihazi {
    public void sarjEt(int volt) {
        if (volt == 5) {
            System.out.println("Telefon şarj oluyor...");
        } else {
            System.out.println("UYARI: Yanlış voltaj! Telefon zarar görebilir.");
        }
    }
}

// Ev prizi 220V sağlar
class StandartEvPrizi implements ElektrikPrizi {
    @Override
    public int saglaElektrik() {
        return 220;
    }
}

// Elektrik prizi 220V sağlar
interface ElektrikPrizi {
    int saglaElektrik(); // Voltaj değeri döndürür
}
