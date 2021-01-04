package Controller;

import java.util.ArrayList;
import Entity.Haris07168_AdminEntity;
import Entity.Haris07168_MemberEntity;
import Entity.Haris07168_KeranjangEntity;

public class Haris07168_AdminController implements Haris07168_ControllerInterface {

    private static int indeks;

    public void dataAdmin() {
        String Nama[] = {"Haris", "Thipah"};
        String Username[] = {"Harr", "Thip"};
        String Password[] = {"123", "123"};
        for (int i = 0; i < Nama.length; i++) {
            Haris07168_ObjectModelController.admin.insertData(new Haris07168_AdminEntity(Nama[i], Username[i], Password[i]));
        }
    }

    public void login(String Username, String Password) {
        indeks = Haris07168_ObjectModelController.admin.cekData(Username, Password);
    }
    
    public void listMember() {
        Haris07168_ObjectModelController.member.view();
    }

    public Haris07168_AdminEntity adminEntity() {
        return Haris07168_ObjectModelController.admin.showDataAdmin(indeks);
    }
    
    public ArrayList<Haris07168_MemberEntity> cekArrayListmember(){
        return Haris07168_ObjectModelController.member.getArrayListMember();
    }
    
}
