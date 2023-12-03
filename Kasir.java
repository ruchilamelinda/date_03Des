import java.util.*;
import java.text.*;

public class Kasir {
    
    public static void main(String[] args) {
        System.out.println("Ruchil Market");
        Date hariSekarang = new Date();
        SimpleDateFormat ft =
        new SimpleDateFormat("E, dd/MM/yyyy 'pada' hh:mm:ss a zzz");
        System.out.println("Tanggal dan waktu: "+ ft.format(hariSekarang));
        System.out.println("=====================================================");
        System.out.println("DATA PELANGGAN");
        Minimarket a = new Minimarket("Nama : Puji", "No Hp : 09876543212", "Alamat : Pasar Baru");
        a.pembayaranCheck();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("DATA BARANG");
        Pembayaran b = new Pembayaran("Detol body nutrition", "det123", 8000, 10000);
        b.pembayaranCheck();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("nama kasir : weni");
    }
}
