package Entity;

public class Haris07168_KeranjangEntity{

    private String Kue;
    private int Jum;
    private float Harga, Total;

    public Haris07168_KeranjangEntity(String kue, int jum, float harga) {
        this.Kue = kue;
        this.Jum = jum;
        this.Harga = harga;
        this.Total = jum * harga;
    }

    public String getKue(){
        return Kue;
    }
    public int getJum(){
        return Jum;
    }
    public float getHarga(){
        return Harga;
    }
    public float getTotal(){
        return Total;
    }
}
