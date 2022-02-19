package Lec39;

import java.util.Arrays;
import java.util.Comparator;

public class StudentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_Class[] st = new Student_Class[5];
		st[0] = new Student_Class(87, "Ram");
		st[1] = new Student_Class(98, "Rohan");
		st[2] = new Student_Class(85, "Rohit");
		st[3] = new Student_Class(87, "Pooja");
		st[4] = new Student_Class(98, "Mohit");
		Arrays.sort(st, new Comparator<Student_Class>() {

			@Override
			public int compare(Student_Class o1, Student_Class o2) {
				// TODO Auto-generated method stub
				if(o1.marsks==o2.marsks) {
					return o1.name.compareTo(o2.name);
				}
				else {
				return	o1.marsks-o2.marsks;
				}
			}
		});
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);

		}

	}

}
