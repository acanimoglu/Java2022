
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calling a function
		ekle();
		sil();
		guncelle();
		String messege="Today the weather is rainy";
		String newMessege=messege.substring(0,2);
		System.out.println(newMessege);
		int sumofthenumbers=sum(5,6);
		print(sumofthenumbers);
		print(sum2(2,45,5,3));
	}
	public static void ekle(){
		System.out.println("ekle fonksiyonu  calisti");
	}
	public static void sil() {
		System.out.println("sil fonksiyonu calisti");
	}
	public static void guncelle() {
		System.out.println("guncelle fonksiyonu calisti");
		return;//means finish the method
	}
	public static int sum(int num1,int num2) {
		return num1+num2;
	}
	public static String city() {
		return "Newyork";
	}
	public static void print(int n) {
		System.out.println("The number to be printed:"+n);
	}
	public static int sum2(int... numbers) {
		//variable arguments
		int toplam=0;
		for(int s:numbers) {
			toplam+=s;
		}
		return toplam;
	}

}
