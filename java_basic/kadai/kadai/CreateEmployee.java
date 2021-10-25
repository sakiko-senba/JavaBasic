package kadai;

public class CreateEmployee {

	public static void main(String[] args) {
		
		if(args.length != 4) {
			System.out.println("please input again.");
			System.exit(1);
					}
		
		int empNo = Integer.parseInt(args[2]);
		String empName = args[3];
		
		Employee1 emp = new Employee1(empNo, empName);
		
		System.out.println("EmpNo    :" + emp.getEmpno());
		System.out.println("EmpName  :" + emp.getEmoName());

	}

}
