//13020210250, Faizah Nurilmi Syukur, Selasa/21-Maret-2023/9:26
import java.util.Scanner;
public class If3 {

	public static void main(String[] args) {
	int a;
	Scanner masukan=new Scanner(System.in);
	
	System.out.print ("Contoh IF tiga kasus \n");
	System.out.print ("Ketikkan suatu nilai integer :");
	a=masukan.nextInt();
	if (a > 0){
		System.out.println ("Nilai a positif "+ a);
	}else if (a == 0){
		System.out.println ("Nilai Nol "+ a);
	}else /* a > 0 */ {
		System.out.println ("Nilai a negatif "+ a);
		}
	}
}