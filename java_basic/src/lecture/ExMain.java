package lecture;

import java.util.ArrayList;

public class ExMain {

	public static void main(String[] args) {
		//一人目
		Student stu1 = new Student();
		stu1.setNo(1);
		stu1.setName("仙波");
		stu1.setAddress("松山市郊外");

		//int num = stu1.getNo();
		//String name = stu1.getAddress();
		//String address = stu1.getAddress();

		//2人目
		Student stu2 = new Student();

		stu2.setNo(2);
		stu2.setName("中村さん");
		stu2.setAddress("松山市市内");

		ArrayList<Student> stus = new ArrayList<>();
		stus.add(stu1);
		stus.add(stu2);

		Meibo meibo = new Meibo();
		meibo.no = 1;
		meibo.stus = stus;

		for (Student s : meibo.stus) {
			System.out.println(s.getName());
		}
		
		System.out.println(meibo.stus.get(0));

	}

}
