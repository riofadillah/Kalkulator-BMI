package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Pengguna;

public class KalkulatorController {

    @FXML
    private TextField txtBerat;

    @FXML
    private TextField txtTinggi;

    @FXML
    private Label lblKategori;

    @FXML
    private void hitungBMI() {
        try {
            double berat = Double.parseDouble(
                    txtBerat.getText().replace(",", ".")
            );

            double tinggi = Double.parseDouble(
                    txtTinggi.getText().replace(",", ".")
            );

            Pengguna pengguna = new Pengguna(berat, tinggi);
            double bmi = pengguna.hitungBMI();

            lblKategori.setText(pengguna.kategoriBMI());

            if (bmi < 18.5) {
                lblKategori.setStyle(
                        "-fx-text-fill: #eab308; -fx-font-size: 24px;"
                );
            } else if (bmi < 25.0) {
                lblKategori.setStyle(
                        "-fx-text-fill: #2563eb; -fx-font-size: 24px;"
                );
            } else if (bmi < 30.0) {
                lblKategori.setStyle(
                        "-fx-text-fill: #f97316; -fx-font-size: 24px;"
                );
            } else {
                lblKategori.setStyle(
                        "-fx-text-fill: #dc2626; -fx-font-size: 24px;"
                );
            }

        } catch (NumberFormatException e) {
            tampilkanError("Masukkan angka yang valid!");
        } catch (IllegalArgumentException e) {
            tampilkanError(e.getMessage());
        }
    }

    private void tampilkanError(String pesan) {
        lblKategori.setText(pesan);
        lblKategori.setStyle(
                "-fx-text-fill: #dc2626; -fx-font-size: 18px;"
        );
    }

    @FXML
    private void resetForm() {
        txtBerat.clear();
        txtTinggi.clear();

        lblKategori.setText("Kategori BMI akan tampil di sini.");
        lblKategori.setStyle(
                "-fx-text-fill: black; -fx-font-size: 18px;"
        );
    }
}
