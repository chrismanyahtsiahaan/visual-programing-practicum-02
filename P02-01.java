//12S23003 - Chrismansyah T Siahaan

import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namatugas, matakuliah, pengampu, deadline, format, status, rekomendasitugas, kodematkul;
        int tingkatkesulitan, harihinggadeadline;
        double prioritas;

        namatugas = input.nextLine();
        kodematkul = input.nextLine();
        matakuliah = input.nextLine();
        pengampu = input.nextLine();
        deadline = input.nextLine();
        format = input.nextLine();
        tingkatkesulitan = input.nextInt();
        harihinggadeadline = input.nextInt();
        status = input.nextLine();
        prioritas = tingkatkesulitan * (1.0 / harihinggadeadline);
        if (prioritas > 3) {
            rekomendasitugas = "penting! Anda harus mengerjakan tugas ini segera.";
        } else {
            if (prioritas < 3 && prioritas > 1.5) {
                rekomendasitugas = "Tugas ini memiliki prioritas menengah.";
            } else {
                if (prioritas < 1.5) {
                    rekomendasitugas = "Tugas ini relsatif ringan, namun jangan tunda terlalu lama.";
                }
            }
        }
        System.out.println("Prioritas : " + toFixed(prioritas,4));
        System.out.println(namatugas + "|" + kodematkul + "|" + matakuliah + "|" + pengampu + "|" + deadline + "|" + format + "|" + tingkatkesulitan + "|" + harihinggadeadline + "|" + status);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
