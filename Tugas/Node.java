package com.jobsheet9;
public class Node {
    int noTransaksi;
    String tanggalPembelian;
    int jumlahBarang;
    int totalHargaBayar;
    Node next;
    public Node(int noTransaksi, String tanggalPembelian, int jumlahBarang, int totalHargaBayar) {
        this.noTransaksi = noTransaksi;
        this.tanggalPembelian = tanggalPembelian;
        this.jumlahBarang = jumlahBarang;
        this.totalHargaBayar = totalHargaBayar;
        this.next = null;
    }
}