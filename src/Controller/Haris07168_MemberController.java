package Controller;

import java.util.ArrayList;
import Entity.Haris07168_MemberEntity;

public class Haris07168_MemberController implements Haris07168_ControllerInterface {

    private static int indeks = 0;

    public void insertMember(String nama, String username, String password) {
        Haris07168_ObjectModelController.member.insertData(new Haris07168_MemberEntity(nama, username, password));
    }

    public void login(String Username, String Password) {
        indeks = Haris07168_ObjectModelController.member.cekData(Username, Password);
    }

    public Haris07168_MemberEntity memberEntity() {
        return Haris07168_ObjectModelController.member.showDataMember(indeks);
    }

}
