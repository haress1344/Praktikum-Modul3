package Model;

import Entity.Haris07168_KeranjangEntity;
import java.util.ArrayList;

public class Haris07168_KeranjangModel {

    private ArrayList<Haris07168_KeranjangEntity> keranjangentity = new ArrayList();

    public void insertData(Haris07168_KeranjangEntity keranjang) {
        keranjangentity.add(keranjang);
    }

    public void viewMember() {
        for (Haris07168_KeranjangEntity keranjang : keranjangentity) {
            System.out.println("===============================");
            System.out.println("Nama Kue = " + keranjang.getKue());
            System.out.println("Jumlah = " + keranjang.getJum());
            System.out.println("Harga Satuan = " + keranjang.getHarga());
            System.out.println("Harga Keseluruhan = " + keranjang.getTotal());
            System.out.println("===============================");
        }
    }

    public void updateisi(int indeks, String kue, int jum, float harga) {
        keranjangentity.set(indeks, new Haris07168_KeranjangEntity(kue, jum, harga));
    }

    public void hapusisi(int indeks) {
        keranjangentity.remove(indeks);
    }

    public void reset() {
        keranjangentity.removeAll(keranjangentity);

    }

    public ArrayList<Haris07168_KeranjangEntity> getArrayListKeranjang() {
        return keranjangentity;
    }
}
