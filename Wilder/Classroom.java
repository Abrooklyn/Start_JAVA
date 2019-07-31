public class Classroom {

	public static void main(String[] args) {
		Wilder student1 = new Wilder("Jean-Claude",true);
		Wilder student2 = new Wilder("Robert",false);

		System.out.println(student1.whoAmI());
		System.out.println(student2.whoAmI());
	}

}