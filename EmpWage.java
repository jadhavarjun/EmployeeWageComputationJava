public class EmpWage {
	public static final int isFullTime = 1;
        public static final int isPartTime = 2;
	public static void main(String[] args) {
	System.out.println("Welcome to Employee Wage ComputationProgram on Master Branch");
		int empRatePrHr = 20;
		int empHr = 0;
		int perDaySalary = 0;
		int mothWorkingDay = 20;
		int monthlySalary = 0;
		for (int i = 1;i <= mothWorkingDay;i++)
		{
			double empCheck = Math.floor(Math.random() * 10) % 3;
			switch ((int)empCheck)
			{
				case isFullTime :
					empHr = 8;
					break;

				case isPartTime :
					empHr = 4;
					break;
				default :
					empHr = 0;
					break;

			}//switch
			perDaySalary = empRatePrHr * empHr;

			monthlySalary = perDaySalary + monthlySalary;

		}//forloop
		System.out.println("Monthly salary: "+monthlySalary);

	}//main()
}//class
