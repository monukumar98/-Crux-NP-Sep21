package Lec26;

public class Persion {

	private int age;
	private String name;

	public int getAge() {
		return age;
	}

//	public void setAge(int age) throws Exception {
//		if (age < 0) {
//			throw new Exception("Age -ve nhi hoga");
//		}
//		this.age = age;
//	}

	public void setAge(int age)  {
		try {
			if (age < 0) {
				throw new Exception("Age -ve nhi hoga");
			}
			this.age = age;
			System.out.println("InSet Age");
			return;
		}
		
		
		catch (Exception e) {
			// TODO: handle exception
			//System.out.println(e);
			e.printStackTrace();
			
			
		}
		
		finally {
			
			System.out.println("gvsja");
		}
		System.out.println("out side");
		
	}

	public String getName() throws Exception {
		setAge(-90);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
