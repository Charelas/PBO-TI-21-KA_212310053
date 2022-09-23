import java.util.Scanner;

public class konversi {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Masukkan Suhu = ");
	int celcius = input.nextInt();
	
	konversi suhu = new konversi(); //Object > Class nama_objek = new class();
	
	suhu.celciusToFahrenheit(celcius);
	
	int reamur = celciusToReamur(celcius);
	
	System.out.println("Konversi ke reamur ");
	System.out.println("Hasil konversi = " +reamur);
	
	int kelvin = celciusToKelvin(celcius);
	
	System.out.println("Konversi ke kelvin ");
	System.out.println("Hasil konversi = " +kelvin);
	
	input.close(); //closing of input method, must be declared

	}
	
	void celciusToFahrenheit(int suhu) {
		int fahrenheit = ((9/5)*suhu)+32;
		
		System.out.println("Konversi dari celcius ke fahrenheit");
		System.out.println("Hasil Konversi = " + fahrenheit);
	}
	
	static int celciusToReamur(int suhu) {
	int reamur = suhu *4/5;
	return reamur;
	}
	
	static int celciusToKelvin(int suhu) {
		int kelvin = suhu + 273;
		return kelvin;
	}

}
