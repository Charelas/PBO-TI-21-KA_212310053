import java.util.Scanner;
public class Latihan06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan Usia :");
		String str1 = input.nextLine();
		System.out.print("Masukan Namadepan :");
		String str2 = input.nextLine();
		System.out.print("Masukan Namabelakang :");
		String str3 = input.nextLine();
		System.out.print("Masukan NPM Anda :");
		String str4 = input.nextLine();
		
		System.out.println(str1 + str2 + str3 + str4);
		
		
		input.close();
	}

}
