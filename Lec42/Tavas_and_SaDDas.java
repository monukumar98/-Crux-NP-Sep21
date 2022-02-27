package Lec42;

public class Tavas_and_SaDDas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "7474";
		System.out.println(TavasandSaDDas(str));

	}

	public static int TavasandSaDDas(String str) {
		int d = str.length();
		int number = (1 << d) - 2;
		int pos = 0;

		for (int i = str.length()-1; i >= 0; i--) {
			if(str.charAt(i)=='7') {
				number = number + (1<<pos);
			}
			pos++;

		}
		return number+1;

	}

}
