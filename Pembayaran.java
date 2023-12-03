import java.util.Scanner;

public class Pembayaran extends Barang implements SaldoAwal {
    private double saldo;
    public Pembayaran(String namaBarang, String idBarang, int hargaBarang, double saldo) {
        super(namaBarang, idBarang, hargaBarang);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan saldo awal: ");
        double saldo = scanner.nextDouble();
    }

    public void pembayaranCheck() {
        System.out.println("nama barang: " + this.namaBarang);
        System.out.println("id barang : " + this.idBarang);
        System.out.println("harga : " + this.hargaBarang);
        System.out.println("Saldo : " + this.saldo);
    }

    @Override
    public double totalSaldo(double saldo) {
        throw new UnsupportedOperationException("Unimplemented method 'totalSaldo'");
    }
    
}
