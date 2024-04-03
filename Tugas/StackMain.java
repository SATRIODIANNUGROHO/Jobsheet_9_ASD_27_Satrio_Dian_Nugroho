package com.jobsheet9;
import java.util.Scanner;
public class StackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack1 stk = new Stack1(5);
        char pilih;
        do {
            System.out.print("Jenis : ");
            String jenis = sc.nextLine();
            System.out.print("Warna : ");
            String warna = sc.nextLine();
            System.out.print("Merk : ");
            String merk = sc.nextLine();
            System.out.print("Ukuran : ");
            String ukuran = sc.nextLine();
            System.out.print("Harga : ");
            double harga = sc.nextDouble();
            Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
            System.out.print("Apakah Anda Akan Menambahkan Data Baru Ke Stack (y/n)? ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
            stk.push(p);
        }while (pilih == 'y');
        while (true) {
            System.out.println("1. Tarik Data Terkahir dari Stack \n2. Lihat Data Terkahir dari Stack \n3. Tampilkan Semua Data pada Stack \n4. Tampilkan Harga Tertinggi \n5. Keluar");
            System.out.print("Masukkan Opsi Pilihan Anda : ");
            int opsi = sc.nextInt();
            if (opsi == 1) {
                stk.pop();
            }else if (opsi == 2) {
                stk.peek();
            }else if (opsi == 3) {
                stk.print();
            }else if (opsi == 4) {
                stk.getMax();
            }else if (opsi == 5) {
                break;
            }else {
                System.out.println("Pilihan Yang Anda Masukkan Tidak Tersedia");
            }   
        }
    }
}