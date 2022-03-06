package Lec44;



public class Graph_2_Clinet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph_2 g = new Graph_2(7);
		g.addedge(1, 4, 5);
		g.addedge(1, 2, 10);
		g.addedge(2, 3, 7);
		g.addedge(3, 4, 2);
		g.addedge(4, 5, 4);
		g.addedge(5, 6, 3);
		g.addedge(5, 7, 2);
		g.addedge(6, 7, 7);
		
		g.BFT();
		g.DFT();
		System.out.println(g.IsCycle());
		System.out.println(g.IsConnected());
		System.out.println(g.GetAllConnectedComponent());
	}

}
