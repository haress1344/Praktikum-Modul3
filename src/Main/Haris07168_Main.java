package Main;

import Controller.*;
import java.util.Scanner;

public class Haris07168_Main {

    private static Haris07168_AdminController admin = new Haris07168_AdminController();
    private static Haris07168_MemberController member = new Haris07168_MemberController();
    private static Haris07168_KeranjangController keranjang = new Haris07168_KeranjangController();
    private static Scanner input = new Scanner(System.in);
    private static int batas = 0;

    public static void main(String[] args) {
        admin.dataAdmin();
        do {
            System.out.println("Cookie Store Here !!!\n");
            System.out.println("1. Login");
            System.out.println("2. Daftar Member");
            System.out.println("3. Exit");
            System.out.print("Pilihan = ");
            int menu1 = input.nextInt();
            switch (menu1) {
                case 1:
                    System.out.println("1. Login Member");
                    System.out.println("2. Login Admin");
                    System.out.print("Pilih = ");
                    int menu2 = input.nextInt();
                    switch (menu2) {
                        case 1:
                            MemberLog();
                            break;
                        case 2:
                            LoginAdmin();
                            break;
                    }
                    break;
                case 2:
                    MemberReg();
                    break;
                case 3:
                    batas = 1;
                    break;
            }
        } while (batas == 0);
    }

    public static void LoginAdmin() {
        System.out.println("Login Admin \n");
        System.out.print("Username = ");
        String Username = input.next();
        System.out.print("Password = ");
        String Pass = input.next();
        try {
            admin.login(Username, Pass);
            System.out.println("Hello Admin " + admin.adminEntity().getNama());
            if (admin.cekArrayListmember().size() == 0) {
                System.out.println("Tidak Ada Data Member Tersedia\n");
            } else {
                System.out.println("Data Member Yang Ada");
                admin.listMember();
            }
        } catch (Exception e) {
            System.out.println("Username atau Password Anda Salah \n");
        }
    }

    public static void MemberReg() {
        System.out.println("Daftar Member Cookie Store \n");
        System.out.println("Nama Anda = ");
        String Nama = input.next();
        System.out.println("Username Baru = ");
        String Username = input.next();
        System.out.println("Password Baru = ");
        String Password = input.next();
        member.insertMember(Nama, Username, Password);
        System.out.println("Pendaftaran Member Sukses");
    }

    public static void MemberLog() {
        String Haris07168_namakue;
        float Haris07168_harga;
        int indeks, Haris07168_jum, logout = 0;

        System.out.println("Login Member \n");
        System.out.print("Username = ");
        String Username = input.next();
        System.out.print("Password = ");
        String Pass = input.next();
        try {
            member.login(Username, Pass);
            do {
                System.out.println("Selamat Datang Di Cookie Store, " + member.memberEntity().getNama() + "\n");
                System.out.println("1. Masukkan Dalam Keranjang");
                System.out.println("2. Rubah Isi Dalam Keranjang");
                System.out.println("3. Hapus Isi Keranjang");
                System.out.println("4. Isi Dalam Keranjang");
                System.out.println("5. Logout");
                System.out.print("Pilih = \n");
                int menu3 = input.nextInt();
                switch (menu3) {
                    case 1:
                        System.out.println("Menu Cookie Store \n");
                        System.out.println("1. Tahu Kornet 2,5k\n2. Bitterbalen 3k\n3. Bolu 2k\n4. Cookie 4k");
                        System.out.print("Pilih = ");
                        int menu4 = input.nextInt();
                        switch (menu4) {
                            case 1:
                                Haris07168_namakue = "Tahu Kornet";
                                Haris07168_harga = 2500;
                                System.out.print("Jumlah Tahu Kornet = ");
                                Haris07168_jum = input.nextInt();
                                keranjang.insertKeranjang(Haris07168_namakue, Haris07168_jum, Haris07168_harga);
                                break;
                            case 2:
                                Haris07168_namakue = "Bitterbalen";
                                Haris07168_harga = 3000;
                                System.out.print("Jumlah Bitterbalen = ");
                                Haris07168_jum = input.nextInt();
                                keranjang.insertKeranjang(Haris07168_namakue, Haris07168_jum, Haris07168_harga);
                                break;
                            case 3:
                                Haris07168_namakue = "Bolu";
                                Haris07168_harga = 2000;
                                System.out.print("Jumlah Bolu = ");
                                Haris07168_jum = input.nextInt();
                                keranjang.insertKeranjang(Haris07168_namakue, Haris07168_jum, Haris07168_harga);
                                break;
                            case 4:
                                Haris07168_namakue = "Cookie";
                                Haris07168_harga = 4000;
                                System.out.print("Jumlah Cookie = ");
                                Haris07168_jum = input.nextInt();
                                keranjang.insertKeranjang(Haris07168_namakue, Haris07168_jum, Haris07168_harga);
                                break;
                        }
                        break;
                    case 2:
                        int menu5;

                        if (keranjang.cekArrayListKeranjang().isEmpty()) {
                            System.out.println("Tidak Ada Kue Dalam Keranjang");
                        } else {
                            System.out.print("Masukkan Urutan Kue yang Akan Dirubah = ");
                            indeks = input.nextInt();
                            indeks = indeks - 1;
                            if (indeks > keranjang.cekArrayListKeranjang().size() || indeks < 0) {
                                System.out.println("Urutan Kue Tidak Tersedia Di Keranjang");
                            } else {
                                System.out.println("1. Tahu Kornet 2,5k\n2. Bitterbalen 3k\n3. Bolu 2k\n4. Cookie 4k");
                                System.out.print("Pilih Kue Baru = ");
                                menu5 = input.nextInt();
                                switch (menu5) {
                                    case 1:
                                        Haris07168_namakue = "Tahu Kornet";
                                        Haris07168_harga = 2500;
                                        System.out.print("Jumlah Tahu Kornet = ");
                                        Haris07168_jum = input.nextInt();
                                        keranjang.UpdateKeranjang(indeks, Haris07168_namakue, Haris07168_jum, Haris07168_harga);
                                        break;
                                    case 2:
                                        Haris07168_namakue = "Bitterbalen";
                                        Haris07168_harga = 3000;
                                        System.out.print("Jumlah Bitterbalen = ");
                                        Haris07168_jum = input.nextInt();
                                        keranjang.UpdateKeranjang(indeks, Haris07168_namakue, Haris07168_jum, Haris07168_harga);
                                        break;
                                    case 3:
                                        Haris07168_namakue = "Bolu";
                                        Haris07168_harga = 2000;
                                        System.out.print("Jumlah Bolu = ");
                                        Haris07168_jum = input.nextInt();
                                        keranjang.UpdateKeranjang(indeks, Haris07168_namakue, Haris07168_jum, Haris07168_harga);
                                        break;
                                    case 4:
                                        Haris07168_namakue = "Cookie";
                                        Haris07168_harga = 4000;
                                        System.out.print("Jumlah Cookie = ");
                                        Haris07168_jum = input.nextInt();
                                        keranjang.UpdateKeranjang(indeks, Haris07168_namakue, Haris07168_jum, Haris07168_harga);
                                        break;
                                }
                            }

                        }
                        break;
                    case 3:

                        if (keranjang.cekArrayListKeranjang().isEmpty()) {
                            System.out.println("Tidak Ada Kue Dalam Keranjang");
                        } else {
                            System.out.print("Masukkan Urutan Kue = ");
                            indeks = input.nextInt();
                            indeks = indeks - 1;
                            if (indeks > keranjang.cekArrayListKeranjang().size() || indeks < 0) {
                                System.out.println("Urutan Kue Tidak Tersedia Di Keranjang");
                            } else {
                                keranjang.HapusIsiKeranjang(indeks);
                            }
                        }
                        break;
                    case 4:
                        if (keranjang.cekArrayListKeranjang().isEmpty()) {
                            System.out.println("Keranjang Kosong");
                        } else {
                            keranjang.IsiKeranjang();
                        }
                        break;
                    case 5:
                        logout = 1;
                        keranjang.ResetKeranjang();
                        break;
                }

            } while (logout == 0);

        } catch (Exception e) {
            System.out.println("Username atau Password Anda Salah \n");
        }
    }
}