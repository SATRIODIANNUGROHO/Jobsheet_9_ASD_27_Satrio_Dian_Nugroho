package com.jobsheet9;
import java.util.Scanner;
public class StrukBelanjaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackStrukBelanja strukBelanja = new StackStrukBelanja();
        for (int i = 1; i <= 8; i++) {
            System.out.println("Masukkan data struk belanja ke-" + i);
            System.out.print("No. Transaksi\t\t\t: ");
            int noTransaksi = scanner.nextInt();
            System.out.print("Tanggal Pembelian (dd/mm/yyyy)  : ");
            String tanggalPembelian = scanner.next();
            System.out.print("Jumlah Barang\t\t\t: ");
            int jumlahBarang = scanner.nextInt();
            System.out.print("Total Harga Bayar\t\t: Rp");
            int totalHargaBayar = scanner.nextInt();
            strukBelanja.push(noTransaksi, tanggalPembelian, jumlahBarang, totalHargaBayar);
        }
        System.out.println("\nData struk belanja sebelum ditukar voucher:");
        strukBelanja.printStack();
        System.out.println("\nPengambilan struk untuk ditukar voucher (5 struk):");
        for (int i = 1; i <= 5; i++) {
            Node struk = strukBelanja.pop();
            if (struk != null) {
                System.out.println("Struk ke-" + i + " diambil: " + struk.noTransaksi);
            }
        }
        System.out.println("\nData struk belanja setelah ditukar voucher:");
        strukBelanja.printStack();
    }
}