package com.company;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Easykalkulator {

    public static void main(String[] args) {
        //        Membuat Pilihan
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan Pilihan = Tambah, Kurang, Bagi, Kali, Modulus, Phytagoras, Akar = ");
        String pilihansaya = inputan.nextLine().toLowerCase().trim();

//        Percabangan
        switch (pilihansaya) {
//            Penambahan
            case "tambah":
                //         Validasi
                try {
                    //        Angka ke 1
                    System.out.print("Masukkan Angka Ke 1 = ");
                    String angkatambah1 = inputan.nextLine();

                    //        Angka ke 2
                    System.out.print("Masukkan Angka Ke 2 = ");
                    String angkatambah2 = inputan.nextLine();

                    //        Conversi
                    int getangkatambah1 = parseInt(angkatambah1);
                    int getangkatambah2 = parseInt(angkatambah2);
                    int hasiltambah = getangkatambah1 + getangkatambah2;
                    System.out.println("Hasil Tambah Dari " + getangkatambah1 + " + " + getangkatambah2 + " = " + Integer.toString(hasiltambah));
                    break;

                } catch (Exception e) {
                    System.err.print("Masukkan angka anda"  + "\n");
                }
                //        Angka ke 1
                System.out.print("\n" + "Masukkan Angka Ke 1 = ");
                String angkatambah1 = inputan.nextLine();

                //        Angka ke 2
                System.out.print("Masukkan Angka Ke 2 = ");
                String angkatambah2 = inputan.nextLine();

                //        Conversi
                int getangkatambah1 = parseInt(angkatambah1);
                int getangkatambah2 = parseInt(angkatambah2);
                int hasiltambah = getangkatambah1 + getangkatambah2;
                System.out.println("Hasil Tambah Dari " + getangkatambah1 + " + " + getangkatambah2 + " = " + Integer.toString(hasiltambah));

                break;

//                Pengurangan
            case "kurang":
                //         Validasi
                try {
                    //        Angka ke 1
                    System.out.print("Masukkan Angka Ke 1 = ");
                    String angkakurang1 = inputan.nextLine();

                    //        Angka ke 2
                    System.out.print("Masukkan Angka Ke 2 = ");
                    String angkakurang2 = inputan.nextLine();

                    //        Conversi
                    int getangkakurang1 = parseInt(angkakurang1);
                    int getangkakurang2 = parseInt(angkakurang2);
                    int hasilkurang = getangkakurang1 - getangkakurang2;
                    System.out.println("Hasil Kurang Dari " + getangkakurang1 + " - " + getangkakurang2 + " = " + Integer.toString(hasilkurang));
                    break;

                } catch (Exception e) {
                    System.err.println("Masukkan angka" + "\n");
                }
                //        Angka ke 1
                System.out.print("\n" + "Masukkan Angka Ke 1 = ");
                String angkakurang1 = inputan.nextLine();

                //        Angka ke 2
                System.out.print("Masukkan Angka Ke 2 = ");
                String angkakurang2 = inputan.nextLine();

                //        Conversi
                int getangkakurang1 = parseInt(angkakurang1);
                int getangkakurang2 = parseInt(angkakurang2);
                int hasilkurang = getangkakurang1 - getangkakurang2;
                System.out.println("Hasil Kurang Dari " + getangkakurang1 + " - " + getangkakurang2 + " = " + Integer.toString(hasilkurang));
                break;

//                Kali
            case "kali":
                //         Validasi
                try {
                    //        Angka ke 1
                    System.out.print("Masukkan Angka Ke 1 = ");
                    String angkakali1 = inputan.nextLine();

                    //        Angka ke 2
                    System.out.print("Masukkan Angka Ke 2 = " + "\n");
                    String angkakali2 = inputan.nextLine();

                    //        Conversi
                    int getangkakali1 = parseInt(angkakali1);
                    int getangkakali2 = parseInt(angkakali2);
                    int hasilkali = getangkakali1 * getangkakali2;
                    System.out.println("Hasil Kali Dari" + getangkakali1 + " x " + getangkakali2 + " = " + Integer.toString(hasilkali));
                    break;

                } catch (Exception e) {
                    System.err.println("Masukkan angka" + "\n");
                }
                //        Angka ke 1
                System.out.print("\n" + "Masukkan Angka Ke 1 = ");
                String angkakali1 = inputan.nextLine();

                //        Angka ke 2
                System.out.print("Masukkan Angka Ke 2 = ");
                String angkakali2 = inputan.nextLine();

                //        Conversi
                int getangkakali1 = parseInt(angkakali1);
                int getangkakali2 = parseInt(angkakali2);
                int hasilkali = getangkakali1 * getangkakali2;
                System.out.println("Hasil Kali Dari " + getangkakali1 + " x " + getangkakali2 + " = " + Integer.toString(hasilkali));
                break;

//                Modulus
            case "modulus":
                //         Validasi
                try {
                    //        Angka ke 1
                    System.out.print("Masukkan Angka Ke 1 = ");
                    String angkamodulus1 = inputan.nextLine();

                    //        Angka ke 2
                    System.out.print("Masukkan Angka Ke 2 = " + "\n");
                    String angkamodulus2 = inputan.nextLine();

                    //        Conversi
                    int getangkamodulus1 = parseInt(angkamodulus1);
                    int getangkamodulus2 = parseInt(angkamodulus2);
                    int hasilmodulus = getangkamodulus1 % getangkamodulus2;
                    System.out.println("Hasil Modulus Dari " + getangkamodulus1 + " % " + getangkamodulus2 + " = " + Integer.toString(hasilmodulus));
                    break;

                } catch (Exception e) {
                    System.err.println("Masukkan angka" + "\n");
                }
                //        Angka ke 1
                System.out.print("\n" + "Masukkan Angka Ke 1 = ");
                String angkamodulus1 = inputan.nextLine();

                //        Angka ke 2
                System.out.print("Masukkan Angka Ke 2 = ");
                String angkamodulus2 = inputan.nextLine();

                //        Conversi
                int getangkamodulus1 = parseInt(angkamodulus1);
                int getangkamodulus2 = parseInt(angkamodulus2);
                int hasilmodulus = getangkamodulus1 % getangkamodulus2;
                System.out.println("Hasil Modulus Dari " + getangkamodulus1 + " % " + getangkamodulus2 + " = " + Integer.toString(hasilmodulus));
                break;

//                Akar
            case "akar":
                //         Validasi
                try {
                    //        Angka ke 1
                    System.out.print("Masukkan Angka Ke 1 = ");
                    String angkaakar = inputan.nextLine();

                    //        Conversi
                    double getangkaakar1 = parseInt(angkaakar);
                    double hasilakar = Math.sqrt(getangkaakar1);
                    System.out.println("Hasil Akar Dari " + getangkaakar1 + " = " + Double.toString(hasilakar));
                    break;

                } catch (Exception e) {
                    System.err.println("Masukkan angka" + "\n");
                }
                //        Angka ke 1
                System.out.print("\n" + "Masukkan Angka Ke 1 = ");
                String angkaakar = inputan.nextLine();

                //        Conversi
                double getangkaakar1 = parseInt(angkaakar);
                double hasilakar = Math.sqrt(getangkaakar1);
                System.out.println("Hasil Akar Dari " + getangkaakar1 + " = " + Double.toString(hasilakar));
                break;

//                Pytagoras
            case "phytagoras":
                System.out.print("Pilih Method = Samping / Miring = ");
                String pilihanphytagoras = inputan.nextLine();

                if (pilihanphytagoras.equals("samping")) {
                    //        Validasi
                    try {
                        //        Angka ke 1
                        System.out.print("Masukkan Angka Ke 1 = ");
                        String angkaphytagoras1 = inputan.nextLine();

                        //        Angka ke 2
                        System.out.print("Masukkan Angka Ke 2 = ");
                        String angkaphytagoras2 = inputan.nextLine();

                        //        Conversi
                        double getangkaphytagoras1 = parseInt(angkaphytagoras1);
                        double getangkaphytagoras2 = parseInt(angkaphytagoras2);
                        double hasilsamping = Math.sqrt(Math.pow(getangkaphytagoras1, 2) - Math.pow(getangkaphytagoras2, 2));
                        System.out.println("Hasil Dari Phytagoras samping " + getangkaphytagoras1 + " dan " + getangkaphytagoras2 + " = " + hasilsamping);
                        break;

                    } catch (Exception e) {
                        System.err.println("Masukkan angka" + "\n");
                    }

                    //        Angka ke 1
                    System.out.print("\n" + "Masukkan Angka Ke 1 = ");
                    String angkaphytagoras1 = inputan.nextLine();

                    //        Angka ke 2
                    System.out.print("Masukkan Angka Ke 2 = ");
                    String angkaphytagoras2 = inputan.nextLine();

                    //        Conversi
                    double getangkaphytagoras1 = parseInt(angkaphytagoras1);
                    double getangkaphytagoras2 = parseInt(angkaphytagoras2);
                    double hasilsamping = Math.sqrt(Math.pow(getangkaphytagoras1, 2) - Math.pow(getangkaphytagoras2, 2));
                    System.out.println("Hasil Dari Phytagoras samping " + getangkaphytagoras1 + " dan " + getangkaphytagoras2 + " = " + hasilsamping);
                    break;

                } else if (pilihanphytagoras.equals("miring")) {
                    //        Validasi
                    try {
                        //        Angka ke 1
                        System.out.print("Masukkan Angka Ke 1 = ");
                        String angkaphytagoras1 = inputan.nextLine();

                        //        Angka ke 2
                        System.out.print("Masukkan Angka Ke 2 = ");
                        String angkaphytagoras2 = inputan.nextLine();

                        //        Conversi
                        double getangkaphytagoras1 = parseInt(angkaphytagoras1);
                        double getangkaphytagoras2 = parseInt(angkaphytagoras2);
                        double hasilmiring = Math.sqrt(Math.pow(getangkaphytagoras1, 2) + Math.pow(getangkaphytagoras2, 2));
                        System.out.println("Hasil Dari Phytagoras miring " + getangkaphytagoras1 + " dan " + getangkaphytagoras2 + " = " + hasilmiring);
                        break;

                    } catch (Exception e) {
                        System.err.println("Masukkan angka" + "\n");
                    }

                    //        Angka ke 1
                    System.out.print("\n" + "Masukkan Angka Ke 1 = ");
                    String angkaphytagoras1 = inputan.nextLine();

                    //        Angka ke 2
                    System.out.print("Masukkan Angka Ke 2 = ");
                    String angkaphytagoras2 = inputan.nextLine();

                    //        Conversi
                    double getangkaphytagoras1 = parseInt(angkaphytagoras1);
                    double getangkaphytagoras2 = parseInt(angkaphytagoras2);
                    double hasilmiring = Math.sqrt(Math.pow(getangkaphytagoras1, 2) + Math.pow(getangkaphytagoras2, 2));
                    System.out.println("Hasil Dari Phytagoras miring " + getangkaphytagoras1 + " dan " + getangkaphytagoras2 + " = " + hasilmiring);
                    break;

                } else {
                    System.out.println("Anda belum memilih");
                }

                break;

            default:
                System.err.println("Masukkan Pilihan Anda");
        }
    }
}
