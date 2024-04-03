package com.jobsheet9;
public class StackStrukBelanja {
    Node top;
    public void push(int noTransaksi, String tanggalPembelian, int jumlahBarang, int totalHargaBayar) {
        Node newNode = new Node(noTransaksi, tanggalPembelian, jumlahBarang, totalHargaBayar);
        newNode.next = top;
        top = newNode;
    }
    public Node pop() {
        if (isEmpty()) {
            return null;
        }
        Node temp = top;
        top = top.next;
        return temp;
    }
    public boolean isEmpty() {
        return top == null;
    }
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack struk belanja kosong!");
            return;
        }
        Node curr = top;
        while (curr != null) {
            System.out.println("--------------------------------");
            System.out.println("No. Transaksi\t  : " + curr.noTransaksi);
            System.out.println("Tanggal Pembelian : " + curr.tanggalPembelian);
            System.out.println("Jumlah Barang\t  : " + curr.jumlahBarang);
            System.out.println("Total Harga Bayar : Rp" + curr.totalHargaBayar);
            System.out.println("--------------------------------");
            curr = curr.next;
        }
    }
}