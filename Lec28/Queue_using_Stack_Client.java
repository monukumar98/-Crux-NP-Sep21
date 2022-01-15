package Lec28;

public class Queue_using_Stack_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue_using_Stack qs = new Queue_using_Stack();
		qs.Enqueue(10);
		qs.Enqueue(120);
		qs.Enqueue(30);
		qs.Enqueue(40);
		qs.Enqueue(50);
		qs.Enqueue(60);
		qs.Enqueue(170);
		qs.Enqueue(110);
		qs.Enqueue(102);
		System.out.println(qs.dequeue());
		System.out.println(qs.getfornt());
		
		


	}

}
