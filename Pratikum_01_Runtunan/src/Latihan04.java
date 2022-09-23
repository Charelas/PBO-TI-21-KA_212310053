import java.util.Scanner;
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class Latihan04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int jumlah;
		int harga = 6300;
		String barang = "ROTI ENAK";

		LocalDateTime myDateObj = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)");
		String formattedDate = myDateObj.format(myFormatObj);

		System.out.println();
		System.out.println();
		System.out.println("======================================================");
		System.out.println("		TOKO SERBAGUNA IBIK				");
		System.out.println("======================================================");
		System.out.print("Masukan jumlah produk yang dibeli :");
		jumlah = input.nextInt();
		System.out.println();
		System.out.println(formattedDate);
		System.out.println("ITEM           QTY             HARGA            TOTAL");
		System.out.println("======================================================");
		System.out.print(barang);
		System.out.print("\t" + jumlah);
		System.out.print("\t\tRp." + harga);
		int total = harga * jumlah;
		System.out.print("\t\tRp." + total);
		System.out.println();
		System.out.println("-------------------------------------------------------");
		System.out.println("Diskon :");
		int diskon = 5;
		int potongan = total - (total / 100 * (diskon * (jumlah / 3)));
		if(jumlah %3 == 0) {
			System.out.print("Diskon : ");
			System.out.println(diskon*(jumlah/3)+ "%");
			System.out.print("Sub Total :" + potongan);
		}
		else if(jumlah %3 !=0) {
			System.out.print("Diskon : ");
			System.out.println(diskon*(jumlah/3) + "%");
			System.out.print("Sub Total : Rp."+potongan);
		}
		
		input.close();
	}

}
