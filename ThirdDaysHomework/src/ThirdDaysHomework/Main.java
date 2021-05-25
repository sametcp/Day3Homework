package ThirdDaysHomework;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Samet Berk");
		student1.setLastName(" Þimþek");
		student1.setEmail("asd@gmail.com");
		student1.setSifre("12345");
		student1.setUniversityName("GOP");
		student1.setDepartment("EEE");
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(10);
		instructor1.setName("Engin");
		instructor1.setLastName(" Demiroð");
		instructor1.setEmail("qwe@gmail.com");
		instructor1.setSifre("12345");
		instructor1.setCertificate("Junior java developer");
		
		StudentManager student = new StudentManager();
		student.add(student1);
		
		System.out.println("-----------------------------------");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		
		System.out.println("-----------------------------------");
		
		UserManager userManager = new UserManager();
		userManager.add(student1);
		userManager.add(instructor1);
		
		// User sýnýfýndan bir deðiþkeni, yolladýðým sýnýfa göre iþlemlerim deðiþiyor.
		
	}

}
