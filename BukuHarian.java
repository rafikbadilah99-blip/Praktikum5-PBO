package com.tugaspraktikum.modul5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BukuHarian {
    private String namaPemilik;
    private String namaFile;

    // Constructor
    public BukuHarian(String namaPemilik) {
        this.namaPemilik = namaPemilik;
        // Mengubah spasi menjadi underscore dan membuat nama file konsisten
        this.namaFile = "diary_" + namaPemilik.toLowerCase().replace(" ", "_") + ".txt";
    }

    // Method untuk menulis catatan ke file (append mode = true)
    public void tulisCatatan(String tanggal, String isi) {
        try (FileWriter fw = new FileWriter(this.namaFile, true)) {
            String formatCatatan = "[" + tanggal + "] - " + isi + "\n";
            fw.write(formatCatatan);
            System.out.println("Catatan berhasil ditambahkan!");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis catatan: " + e.getMessage());
        }
    }

    // Method untuk membaca seluruh isi file catatan
    public void bacaCatatan() {
        try (BufferedReader br = new BufferedReader(new FileReader(this.namaFile))) {
            String baris;
            boolean adaIsi = false;

            System.out.println("\n=== Catatan Harian Milik: " + namaPemilik + " ===");
            while ((baris = br.readLine()) != null) {
                System.out.println(baris);
                adaIsi = true;
            }

            if (!adaIsi) {
                System.out.println("Belum ada catatan harian.");
            }
        } catch (IOException e) {
            // Ditangkap jika file belum pernah dibuat / tidak ditemukan
            System.out.println("Belum ada catatan harian.");
        }
    }

    // Getter opsional untuk mengecek nama file
    public String getNamaFile() {
        return namaFile;
    }
}