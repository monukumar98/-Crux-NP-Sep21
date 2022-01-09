package Lec27;

public class Client_Stack_Using_queue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack_Using_Queue sq = new Stack_Using_Queue();
		sq.push(10);
		sq.push(102);
		sq.push(101);
		
		sq.push(102);
		sq.push(13);
		sq.push(16);
		sq.push(18);
		sq.push(19);
		System.out.println(sq.pop());
		System.out.println(sq.Peek());
	}

}
