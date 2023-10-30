
import java.util.Scanner;

/**
 * Program adalah program yang digunakan untuk menghitung total pembayaran dan kembalian dari pembelian barang di toko buku.
 *
 * @author FerdiN.P.
 */

public class TokoBuku {

    /**
     * Metode main() adalah metode yang pertama kali dieksekusi ketika program dijalankan.
     *
     * @param args array of String arguments
     */
    public static void main(String[] args) {


        // Deklarasi variabel
        int[] harga = {20000, 15000, 45000};
        double bayar, kembalian, hitung;
        int jumlahbarang, pilihbarang;
        String alamat, nama;

        // Membuat objek Scanner untuk membaca input dari user
        Scanner baca = new Scanner(System.in);


        // Menampilkan pesan selamat datang
        System.out.println("SELAMAT DATANG DI GRAMEDIA");

        // Menampilkan daftar barang
        System.out.println(" ===== DAFTAR BARANG ===== ");
        System.out.println("1. Buku Resep Memasak       : Rp " + harga[0]);
        System.out.println("2. Majalah                  : Rp " + harga[1]);
        System.out.println("3. Buku Latihan Soal        : Rp " + harga[2]);
        System.out.println("NB : Maks Pembelian 5");
        System.out.println("\n");

        // Meminta user untuk memasukkan nama dan alamat
        System.out.println("DATA PEMBELI");
        System.out.print("Masukkan Nama   : ");
        nama = baca.nextLine();
        System.out.print("Masukkan Alamat : ");
        alamat = baca.nextLine();
        // Meminta user untuk memilih barang
        System.out.print("Pilih Barang: ");
        pilihbarang = baca.nextInt();

        // Menggunakan switch statement untuk menghitung total pembayaran dan kembalian
        switch (pilihbarang) {
            case 1:
                System.out.print("Input Jumlah Barang :");
                jumlahbarang = baca.nextInt();
                if (jumlahbarang <= 5) {
                    hitung = jumlahbarang * harga[0];
                    System.out.println("Total Pembayaran : Rp" + hitung);
                    System.out.print("Masukkan Jumlah Uang Anda : ");
                    bayar = baca.nextInt();
                    kembalian = bayar - hitung;
                    System.out.println("Kembalian : " + kembalian);
                } else {
                    System.out.println("Jumlah Yang Anda Input Melebihi Batas !!");
                }
                break;

            case 2:
                System.out.print("Input Jumlah Barang :");
                jumlahbarang = baca.nextInt();
                if (jumlahbarang <= 5) {
                    hitung = jumlahbarang * harga[1];
                    System.out.println("Total Pembayaran : Rp" + hitung);
                    System.out.print("Masukkan Jumlah Uang Anda : ");
                    bayar = baca.nextInt();
                    kembalian = bayar - hitung;
                    System.out.println("Kembalian : " + kembalian);
                } else {
                    System.out.println("Jumlah Yang Anda Input Melebihi Batas !!");
                }
                break;

            case 3:
                System.out.print("Input Jumlah Barang :");
                jumlahbarang = baca.nextInt();
                if (jumlahbarang <= 5) {
                    hitung = jumlahbarang * harga[2];
                    System.out.println("Total Pembayaran : Rp" + hitung);
                    System.out.print("Masukkan Jumlah Uang Anda : ");
                    bayar = baca.nextInt();
                    kembalian = bayar - hitung;
                    System.out.println("Kembalian : " + kembalian);
                } else {
                    System.out.println("Jumlah Yang Anda Input Melebihi Batas !!");
                }
                break;

            default:
                System.out.println("Pilihan Barang Tidak Tersedia !!");
                break;
        }
    }
}
