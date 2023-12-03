

public class Minimarket {
    public String namaPelanggan;
    public String noHp;
    public String alamat;

    public Minimarket (String namaPelanggan, String noHp, String alamat) {
        this.namaPelanggan=namaPelanggan;
        this.noHp=noHp;
        this.alamat=alamat;
    }

    public void pembayaranCheck() {
        System.out.println("Pembayaran " + this.namaPelanggan);
        System.out.println( "no HP: " + this.noHp);
        System.out.println( "Alamat: " + this.alamat);
    }

    public String toString() {
        return namaPelanggan + "" + alamat;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

     public String getNoHp() {
        return noHp;
    }
}
