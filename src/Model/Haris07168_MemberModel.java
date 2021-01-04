package Model;

import Entity.Haris07168_MemberEntity;
import java.util.ArrayList;

public class Haris07168_MemberModel implements Haris07168_ModelInterface {

    private ArrayList<Haris07168_MemberEntity> memberentity = new ArrayList();

    public void insertData(Haris07168_MemberEntity member) {
        memberentity.add(member);
    }

    public void view() {
        for (Haris07168_MemberEntity memberentity : memberentity) {
            System.out.println("==========================================");
            System.out.println("Nama = " + memberentity.getNama());
            System.out.println("Username = " + memberentity.getUser());
            System.out.println("Password = " + memberentity.getPass());
            System.out.println("==========================================");
        }
    }

    public int cekData(String Username, String Password) {
        int loop = 0;
        for (Haris07168_MemberEntity member : memberentity) {
            if (member.getUser().equals(Username) && member.getPass().equals(Password)) {
                break;
            } else {
                loop++;
            }
        }
        return loop;
    }

    public Haris07168_MemberEntity showDataMember(int indeks) {
        return memberentity.get(indeks);
    }

    public ArrayList<Haris07168_MemberEntity> getArrayListMember() {
        return memberentity;
    }
}
