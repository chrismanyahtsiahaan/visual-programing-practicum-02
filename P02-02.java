//12S23003 - Chrismansyah T Siahaan

import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namaGudang, aC, lantai, ketersediaanTeknologi, kualitasGudang, gudangElite, gudangStandar, gudangPerluPeningkatan;
        int kapasitasGudang, jumlahBukuSaatIni, skor;

        namaGudang = input.nextLine();
        kapasitasGudang = input.nextInt();
        jumlahBukuSaatIni = input.nextInt();
        aC = input.nextLine();
        lantai = input.nextLine();
        ketersediaanTeknologi = input.nextLine();
        skor = (int) ((double) jumlahBukuSaatIni / kapasitasGudang * 100);
        if (skor >= 40) {
            kualitasGudang = "Gudang Elite";
        } else {
            if (skor >= 25) {
                kualitasGudang = "Gudang Standar";
            } else {
                if (skor < 25) {
                    kualitasGudang = "Gudang Perlu Peningkatan";
                }
            }
        }
        System.out.println(namaGudang + "|" + kapasitasGudang + "|" + jumlahBukuSaatIni + "|" + aC + "|" + lantai + "|" + ketersediaanTeknologi + "|" + kualitasGudang);
    }
}
