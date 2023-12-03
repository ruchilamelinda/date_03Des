public class Barang {
    public String namaBarang;
    public String idBarang;
    public int hargaBarang;

    public Barang( String namaBarang, String idBarang, int hargaBarang) {
        this.namaBarang=namaBarang;
        this.idBarang=idBarang;
        this.hargaBarang=hargaBarang;
    }

    public void pembayaracheck() {//polimorfisme
        System.out.println("Pembayaran " +this.namaBarang + "dengan id barang " + this.idBarang);
    }
    
    public String toString() {
        return namaBarang+ " " + idBarang; 
    }

    public String getNamabarang() {
        return namaBarang;
    }

    public String getIdBarang() {
        return idBarang;
    }

    public int getHargabarang() {
        return hargaBarang;
    }
}
