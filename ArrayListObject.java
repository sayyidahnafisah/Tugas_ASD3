import java.util.ArrayList;

public class ArrayListObject {

	public static void main(String[] args){
	ArrayList<Mahasiswa> Data = new ArrayList<Mahasiswa>();
	Data.add(new Mahasiswa("ASWAD", "D0217011", "B", "tammangalle"));
	Data.add(new Mahasiswa("UDIN", "D0217512", "B", "Tammero'do"));
	Data.add(new Mahasiswa("ANTO", "D0217012", "B", "Copala"));
	Data.add(new Mahasiswa("FIRMAN", "D0217507", "B", "Saleppa"));
	Data.forEach(data ->{
	System.out.println("Nama : " + data.getNama() + ", NIM : " + data.getNim() + ", Kelas : " + data.getKelas() + ", Alamat : " + data.getAlamat());
	});

}
}