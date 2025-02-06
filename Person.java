package Tasks2;

public class Person {
	
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	

	public void getData() {
		System.out.println("Name is " + name + " and age is "+ age);
	}

	public static void main(String[] args) {
	
		Person obj=new Person("John",18);
		obj.getData();

	}

	
}


//Output:
//	Name is John and age is 18
