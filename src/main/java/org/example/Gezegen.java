package org.example;

public enum Gezegen {
    MERKUR(1, 57.9, 2439.7, 1407.6),
    VENUS(2, 108.2, 6051.8, -5832.5),
    DUNYA(3, 149.6, 6371, 24),
    MARS(4, 227.9, 3389.5, 24.7),
    JUPITER(5, 778.6, 69911, 9.9),
    SATURN(6, 1433.5, 58232, 10.7),
    URANUS(7, 2872.5, 25362, -17.2),
    NEPTUN(8, 4495.1, 24622, 16.1);

    private final int siralamaNumarasi;
    private final double uzaklik; // milyon kilometre cinsinden
    private final double yaricap; // kilometre cinsinden
    private final double donmeSuresi; // saat cinsinden

    Gezegen(int siralamaNumarasi, double uzaklik, double yaricap, double donmeSuresi) {
        this.siralamaNumarasi = siralamaNumarasi;
        this.uzaklik = uzaklik;
        this.yaricap = yaricap;
        this.donmeSuresi = donmeSuresi;
    }

    public int getSiralamaNumarasi() {
        return siralamaNumarasi;
    }

    public double getUzaklik() {
        return uzaklik;
    }

    public double getYaricap() {
        return yaricap;
    }

    public double getDonmeSuresi() {
        return donmeSuresi;
    }

    // Test
    public static void main(String[] args) {
        // Gezegen bilgilerini yazdırma
        for (Gezegen gezegen : Gezegen.values()) {
            System.out.println(gezegen.name() + ": Sıralama Numarası " + gezegen.getSiralamaNumarasi() +
                    ", Uzaklık " + gezegen.getUzaklik() + " milyon km, Yarıçap " + gezegen.getYaricap() +
                    " km, Dönme Süresi " + gezegen.getDonmeSuresi() + " saat.");
        }
    }
}

