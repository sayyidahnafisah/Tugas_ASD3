
public class MainStackDouble {

	public static void main(String[] args) {
		StackDouble Tinggi = new StackDouble();
		Tinggi.cetak();
		
		Tinggi.push(147.46);Tinggi.cetak();
		Tinggi.push(155.4);Tinggi.cetak();
		Tinggi.push(161.24);Tinggi.cetak();
		
		Double keluar1 = Tinggi.pop();Tinggi.cetak();
		System.out.println(keluar1);
		Double keluar2 = Tinggi.pop();Tinggi.cetak();
		System.out.println(keluar2);
		Double keluar3 = Tinggi.pop();Tinggi.cetak();
		System.out.println(keluar3);
	}

}
