package Lec6;

public class Swap_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.println(arr[0] + " " + arr[1]);// 10 ,20
		Swap(arr[0], arr[1]);// 10,20
		System.out.println(arr[0] + " " + arr[1]);// 10 20

	}

	public static void Swap(int a, int b) {
		// TODO Auto-generated method stub
		int t = a;
		a = b;
		b = t;

	}
	

}
