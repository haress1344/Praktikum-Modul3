package Controller;

import java.util.ArrayList;
import Entity.Haris07168_KeranjangEntity;

public class Haris07168_KeranjangController {

    public void insertKeranjang(String kue, int jum, float harga) {
        Haris07168_ObjectModelController.keranjang.insertData(new Haris07168_KeranjangEntity(kue, jum, harga));
    }

    public void UpdateKeranjang(int indeks, String kue, int jum, float harga) {
        Haris07168_ObjectModelController.keranjang.updateisi(indeks, kue, jum, harga);
    }
    
    public void HapusIsiKeranjang(int indeks){
        Haris07168_ObjectModelController.keranjang.hapusisi(indeks);
    }

    public void IsiKeranjang() {
        Haris07168_ObjectModelController.keranjang.viewMember();
    }
    
    public void ResetKeranjang(){
        Haris07168_ObjectModelController.keranjang.reset();
    }

    public ArrayList<Haris07168_KeranjangEntity> cekArrayListKeranjang() {
        return Haris07168_ObjectModelController.keranjang.getArrayListKeranjang();
    }
}
