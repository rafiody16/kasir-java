/**
 * kasir
 */
import java.util.Scanner;
public class kasir {

    public static void main(String [] args)
    {

        Scanner scan = new Scanner(System.in);

        String nama_barang;
        int jumlah_barang, harga, harga_total;
        double diskon = 0.075;
        double harga_bayar;
        

            System.out.println("-----Program Kasir Sederhana-----");
            System.out.println("*********************************");
            System.out.println("Nama Barang: ");
            nama_barang = scan.nextLine();
            System.out.println("Jumlah Barang: ");
            jumlah_barang = scan.nextInt();

            if (jumlah_barang <= 0)
            {
                System.out.println("Mohon masukan jumlah yang benar");
                System.exit(0);
            }

            System.out.println("Harga Barang: ");
            harga = scan.nextInt();
            if (harga < 100)
            {
                System.out.println("Mohon masukan ulang harga yang valid");
                System.exit(0);
            }

            System.out.println("Anda mendapat diskon 7,5%");
            harga_total = jumlah_barang * harga;
            System.out.println("Total Harga"+harga_total);
            diskon = harga_total * diskon;
            harga_bayar = harga_total - diskon;
            System.out.println("Anda harus membayar: "+harga_bayar); 
    }
}