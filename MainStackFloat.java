
public class MainStackFloat {

	public static void main(String[] args) {
	StackFloat Berat = new StackFloat();
	Berat.cetak();
	
	Berat.push((float)46.68);Berat.cetak();
	Berat.push((float)43.54);Berat.cetak();
	Berat.push((float)48.00);Berat.cetak();
	Berat.push((float)57.24);Berat.cetak();
	Berat.push((float)44.45);Berat.cetak();
	
	Float keluar1 = Berat.pop();Berat.cetak();
	System.out.println(keluar1);
	Float keluar2 = Berat.pop();Berat.cetak();
	System.out.println(keluar2);
	Float keluar3 = Berat.pop();Berat.cetak();
	System.out.println(keluar3);
	Float keluar4 = Berat.pop();Berat.cetak();
	System.out.println(keluar4);
	Float keluar5 = Berat.pop();Berat.cetak();
	System.out.println(keluar5);
	}

}
