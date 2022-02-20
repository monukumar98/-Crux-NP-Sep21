package Lec40;



public class Genric_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars [] car = new Cars[5];
		car[0] = new Cars(200, 10, "White");
		car[1] = new Cars(1000, 20, "Black");
		car[2] = new Cars(345, 3, "Yellow");
		car[3] = new Cars(340, 89, "Grey");
		car[4] = new Cars(8907, 6, "Red");
		Generic_Heap<Cars> gp = new Generic_Heap<>();
		for (int i = 0; i < car.length; i++) {
			gp.add(car[i]);
		}
		System.out.println(gp.get());

	}

}
