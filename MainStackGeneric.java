
public class MainStackGeneric {

	public static void main(String[] args) {
		StackGeneric tumpuk = new StackGeneric();
		
		tumpuk.push("Aswad");tumpuk.cetak();
		tumpuk.push("Arul");tumpuk.cetak();
		tumpuk.push("Udin");tumpuk.cetak();
		tumpuk.push("Sadly");tumpuk.cetak();
	
		tumpuk.pop();tumpuk.cetak();

	}

}
