public class Main
{
	public static void main (String[] args)
	{
		//zadanie 2
		System.out.println("Zadanie 2");
		int wynik1, wynik2, wynik3, wynik4;
		int l1 = 23;
		int l2 = 65;
		wynik1 = l1 + l2;
		wynik2 = l1 - l2;
		wynik3 = l1* l2;
		wynik4 = l1/l2;
		int wynik5 = l1%l2;
		System.out.println("Wynik = " + wynik1);
		System.out.println("Wynik = " + wynik2);
		System.out.println("Wynik = " + wynik3);
		System.out.println("Wynik = " + wynik4);
		System.out.println("Wynik = " + wynik5);
		wynik5++;
		wynik5++;
		wynik5++;
		System.out.println("Wynik = " + wynik5);
		wynik5--;
		wynik5--;
		wynik5--;
		System.out.println("Wynik = " + wynik5);
		System.out.println("");
	}
}