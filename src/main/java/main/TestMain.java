
package main;

import model.Pengguna;

public class TestMain {

    public static void main(String[] args) {

        double berat = 22;
        double tinggi = 100;

        Pengguna pengguna = new Pengguna(berat, tinggi);

        System.out.println("=== KALKULATOR BMI ===");
        System.out.println("Berat badan : " + berat + " kg");
        System.out.println("Tinggi badan: " + tinggi + " cm");
        System.out.println("Kategori BMI: " + pengguna.kategoriBMI());
    }
}
