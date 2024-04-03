package com.jobsheet9;
public class Stack1 {
    int size;
    int top;
    Pakaian data[];
    public Stack1(int size) {
        this.size = size;
        data = new Pakaian[size];
        top = -1;
    }
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }else {
            return false;
        }
    }
    public boolean isFull() {
        if (top == size - 1) {
            return true;
        }else {
            return false;
        }
    }
    public void push(Pakaian pkn) {
        if (!isFull()) {
            top++;
            data[top] = pkn;
        }else {
            System.out.println("Stack Penuh");
        }
    }
    public void pop() {
        if (!isEmpty()) {
            Pakaian x = data[top];
            top--;
            System.out.println("Data Yang Dikeluarkan Dari Stack : " + (x.jenis) + " " + (x.warna) 
            + " " + (x.merk) + " " + (x.ukuran) + " " + (x.harga));
        }else {
            System.out.println("Stack Masih Kosong");
        }
    }
    public void peek() {
        System.out.println("Elemen Teratas Stack : " + (data[top].jenis + " " + (data[top].warna) + " " 
        + (data[top].merk) + " " + (data[top].ukuran) + " " + (data[top].harga)));
    }
    public void print() {
        System.out.println("Isi Stack : ");
        for (int i = top; i >= 0; i--) {
            System.out.println("Elemen Teratas Stack : " + (data[i].jenis + " " + (data[i].warna) + " " 
            + (data[i].merk) + " " + (data[i].ukuran) + " " + (data[i].harga)));
        }
        System.out.println("");
    }
    public void clear() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack Sudah Dikosongkan");
        }else {
            System.out.println("Stack Masih Kosong");
        }
    }
    public void getMax() {
        if (!isEmpty()) {
            int maxIndex = 0;
            double maxPrice = data[0].harga;
            for (int i = 1; i <= top; i++) {
                if (data[i].harga > maxPrice) {
                    maxPrice = data[i].harga;
                    maxIndex = i;
                }
            }
            System.out.println("Data Pakaian dengan Harga Tertinggi:");
            System.out.println("Jenis: " + data[maxIndex].jenis);
            System.out.println("Warna: " + data[maxIndex].warna);
            System.out.println("Merk: " + data[maxIndex].merk);
            System.out.println("Ukuran: " + data[maxIndex].ukuran);
            System.out.println("Harga: " + data[maxIndex].harga);
        } else {
            System.out.println("Stack Masih Kosong");
        }
    }
}