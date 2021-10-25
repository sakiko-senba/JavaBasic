
public class UseClassCode {

	public static void main(String[] args) {

		Student[] students = {
				new Student("鈴木一郎", '男', 45),
				new Student("山田花子", '女', 90),
				new Student("田中次郎", '男', 60)
		};

		for (Student student : students) {
			student.disp();
		}
		
		
		//students[0].input("鈴木一郎", '男', 45);
		//students[1].input("山田花子", '女', 90);
		//students[2].input("田中次郎", '男', 60);

		/*
		 * 
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		 
		student1.disp();
		student2.disp();
		student3.disp();
		
		student1.name = "鈴木一郎";
		student1.gender = '男';
		student1.score = 45;
		
		student2.name = "山田花子";
		student2.gender = '女';
		student2.score = 90;
		
		student3.name = "田中次郎";
		student3.gender = '男';
		student3.score = 70;
		*/

		/*
		System.out.println("名前：" + student1.name);
		System.out.println("性別：" + student1.gender);
		System.out.println("点数：" + student1.score);
		System.out.println();
		
		System.out.println("名前：" + student2.name);
		System.out.println("性別：" + student2.gender);
		System.out.println("点数：" + student2.score);
		System.out.println();
		
		System.out.println("名前：" + student3.name);
		System.out.println("性別：" + student3.gender);
		System.out.println("点数：" + student3.score);
		System.out.println();
		*/

	}

}
