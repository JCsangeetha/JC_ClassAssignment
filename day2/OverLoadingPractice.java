package week3.day2;

public class OverLoadingPractice {

	public void reportStep(String msg, String status) 
	{
		System.out.println("2 parameters:-message:"+msg+" "+ "and status :"+status);
	}
	
	public void reportStep(String msg, String status, boolean snap) 
	{
		System.out.println("3 parameters:-message:"+msg+" "+ "status :"+status+" "+"and snap:"+snap);
	}
	
	public static void main(String[] args) {
		
		OverLoadingPractice obj= new OverLoadingPractice();
		obj.reportStep("QATestReport", "success");
		obj.reportStep("UATTestReport", "failure", true);
	}
}
