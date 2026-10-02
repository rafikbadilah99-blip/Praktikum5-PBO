package com.tugaspraktikum.modul5;

public class MainDiary {
    public static void main(String[] args) {
        // a. Instansiasi objek BukuHarian
        BukuHarian diary = new BukuHarian("Rafik");

        // b. Panggil method tulisCatatan minimal 2 kali
        diary.tulisCatatan("01-10-2026", "Hari ini belajar Java File I/O di lab komputer.");
        diary.tulisCatatan("01-10-2026", "Mencoba fitur append agar catatan lama tidak tertimpa.");
        diary.tulisCatatan("01-10-2026", "Hari ini praktikum sampe maghrib.");
        diary.tulisCatatan("02-10-2026", "Makan nasi goreng menikmati banget sampe lupa makan kerupuknya.");
        diary.tulisCatatan("02-10-2026", "Hari ini Jum'at kelas pagi sampe sore.");
        diary.tulisCatatan("02-10-2026", "DAA presentasi dadakan, bahas alur project.");

        // c. Panggil method bacaCatatan untuk menampilkan data
        diary.bacaCatatan();
    }
}