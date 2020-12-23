class EmpSalary {
	//constant
	public static final int isFullTime = 0;
	public static final int isPartTime = 1;
	public static final int empRatePrHr = 20;
	public static final int mothWorkingDay = 20;
	public void empSalary() {
		//variables
		int empHr = 0;
		int perDaySalary = 0;
		int monthlySalary = 0;
		int monthyHrs = 0;
		//computation
		for (int i = 1;i <= mothWorkingDay && monthyHrs < 100;i++) {
			int empCheck=(int)Math.floor(Math.random() * 10) % 2;
			switch ((int)empCheck)
			{
				case isFullTime :
					empHr = 8;
					break;
				case isPartTime :
					empHr = 4;
					break;

			}//switch
			monthyHrs = monthyHrs + empHr;
			System.out.println("working days : "+i);
			System.out.println("monthyHrs wis : "+monthyHrs);
			perDaySalary = empRatePrHr * empHr;
			System.out.println(perDaySalary);
			monthlySalary = perDaySalary + monthlySalary;


		}//forloop
		System.out.println("monthly salary"+monthlySalary);

	}//empSalary()
}
public class EmpWage {

	public static void main(String[] args) {
		EmpSalary empWage = new EmpSalary();
		empWage.empSalary();
	}//main()
}//class
