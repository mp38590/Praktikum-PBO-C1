/**
 * File      : MOperasiTitik.java		01/03/23
 * Penulis   : Mutiara Permata Putri
 * Deskripsi : Kelas yang berisi main dari OperasiTitik
 * 
 */

public class MOperasiTitik{
	public static void main(String[] args){
		Titik t = new Titik(4 , 4);
		OperasiTitik o = new OperasiTitik();
		System.out.println("Titik : ("+t.getAbsis()+","+t.getOrdinat()+")");
		o.refleksiX(t); //hasil
		System.out.println("Titik : ("+t.getAbsis()+","+t.getOrdinat()+")");
		o.refleksiY(t); //hasil
		System.out.println("Titik : ("+t.getAbsis()+","+t.getOrdinat()+")");
	}
}