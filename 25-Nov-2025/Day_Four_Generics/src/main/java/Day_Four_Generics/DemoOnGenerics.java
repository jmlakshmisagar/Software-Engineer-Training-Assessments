package Day_Four_Generics;

public class DemoOnGenerics {
	public static void main(String[] args) {
		Container<String> container = new Container<String>();
		container.setItem("Dell");
		System.out.println(container.getItem());

		Container<Student> students = new Container<Student>();
		Student student = new Student(101,"Mphasis","MCA");
		students.setItem(student);
		System.out.println(students.getItem());

		PairClass<String, Double> pairClass = new PairClass<String, Double>("Distance in km", 7.5);
		PairClass<String, Double> pairClass2 = new PairClass<String, Double>("Weight in Kg", 6.0);
		
		PairClass<Integer, Student> studentPair = new PairClass<Integer, Student>(1,student);
		System.out.println(studentPair);

	}
}


//orderclass accaepts the generic type , single i