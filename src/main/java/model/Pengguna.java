
package model;

public class Pengguna {
    private double beratBadan;
    private double tinggiBadan;

    
    public Pengguna(double beratBadan, double tinggiBadan) {
        if (!Double.isFinite(beratBadan) || beratBadan <= 0) {
            throw new IllegalArgumentException(
                "Berat badan harus lebih dari 0!"
            );
        }

        if (!Double.isFinite(tinggiBadan) || tinggiBadan <= 0) {
            throw new IllegalArgumentException(
                "Tinggi badan harus lebih dari 0!"
            );
        }

        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
    }

    
    public double hitungBMI() {
        double tinggiMeter = tinggiBadan / 100;
        return beratBadan / (tinggiMeter * tinggiMeter);
    }

    
    public String kategoriBMI() {
        double bmi = hitungBMI();

        
    if (bmi < 18.5) return "Berat Badan Kurang";
    else if (bmi < 25) return "Normal";
    else if (bmi < 30) return "Kelebihan Berat Badan";
    else if (bmi < 35) return "Obesitas Kelas I";
    else if (bmi < 40) return "Obesitas Kelas II";
    else return "Obesitas Kelas III";
    }

    
    public double getBeratBadan() {
        return beratBadan;
    }

    public double getTinggiBadan() {
        return tinggiBadan;
    }
}
