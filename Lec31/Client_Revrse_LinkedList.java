package Lec31;

public class Client_Revrse_LinkedList {

	public static void main(String[] args) throws Exception {
		Reverse_LinkedList rc = new Reverse_LinkedList();
		rc.addLast(1);
		rc.addLast(2);
		rc.addLast(3);
		rc.addLast(4);
		rc.addLast(5);
//		rc.addLast(6);
//		rc.addLast(7);
//		rc.addLast(8);
		rc.Dispaly();
		//rc.ReverseData_I();
		//rc.reverseList_Pointer();
		//rc.reverseList_Pointer_Recr();
		rc.ReverseData_Recu();
		rc.Dispaly();

	}

}
