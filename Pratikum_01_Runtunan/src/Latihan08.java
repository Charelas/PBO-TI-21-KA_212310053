import java.util.Scanner;
public class Latihan08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String npm,fullname,ipk,classname,semester;
		
		System.out.println("##	Program Java Data Mahasiswa	##");
		System.out.println("==========================================");
		System.out.print("Masukan NPM : " );
		npm = input.nextLine();
		
		System.out.print("Masukan Nama Lengkap : ");
		fullname = input.nextLine();
		
		System.out.print("Masukan Nama Kelas : ");
		classname = input.nextLine();
		
		System.out.print("Masukan Semester : ");
		semester = input.nextLine();
		
		System.out.print("Masukan IPK : ");
		ipk = input.nextLine();
		
		System.out.println();
		System.out.println("##	Data Record	##");
		System.out.println("=======================");
		System.out.println("NPM : " + npm);
		System.out.println("Nama Lengkap : " + fullname);
		System.out.println("Nama Kelas : " + classname);
		System.out.println("Semester : " + semester);
		System.out.println("IPK : " + ipk);

		input.close();
	}

}
