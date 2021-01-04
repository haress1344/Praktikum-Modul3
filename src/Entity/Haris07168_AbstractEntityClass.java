package Entity;

public abstract class Haris07168_AbstractEntityClass {

    protected String Nama, Username, Password;

    public Haris07168_AbstractEntityClass(String nama, String username, String password) {
        this.Nama=nama;
        this.Username=username;
        this.Password=password;
    }
    
    public abstract String getNama();
    public abstract String getPass();
    public abstract String getUser();

}
