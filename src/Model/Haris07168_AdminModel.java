package Model;

import Entity.Haris07168_AdminEntity;
import java.util.ArrayList;

public class Haris07168_AdminModel implements Haris07168_ModelInterface {

    private ArrayList<Haris07168_AdminEntity> adminentity = new ArrayList();

    public void insertData(Haris07168_AdminEntity admin) {
        adminentity.add(admin);
    }

    public int cekData(String Username, String Password) {
        int loop = 0;
        for (Haris07168_AdminEntity admin : adminentity) {
            if (admin.getUser().equals(Username) && admin.getPass().equals(Password)) {
                break;
            } else {
                loop++;
            }
        }
        return loop;
    }

    public Haris07168_AdminEntity showDataAdmin(int indeks) {
        return adminentity.get(indeks);
    }
}
