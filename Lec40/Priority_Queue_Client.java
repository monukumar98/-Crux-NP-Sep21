package Lec40;

public class Priority_Queue_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Priority_Queue pq = new Priority_Queue();
		pq.add(5);
		pq.add(7);
		pq.add(13);
		pq.add(2);
		pq.add(6);
		pq.add(4);
		pq.add(1);
		pq.add(10);
		System.out.println(pq.get());
		pq.display();
		System.out.println(pq.delete());
		pq.display();


	}

}
