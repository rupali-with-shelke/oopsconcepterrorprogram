package OOPSProgram;

public class MethodOverloading_Compilepolymorphism {

	public static void main(String[] args) {
		
		MethodOverloading_Compilepolymorphism mo_cp=new MethodOverloading_Compilepolymorphism();
		
		mo_cp.login("Rushali","demo@123");//passing the value here
		mo_cp.login(123);
		mo_cp.login("demo@123gmail.com");
		mo_cp.login(456,"demo@456gmail.com");
		mo_cp.login("demo@789gmail.com",890);
	}
	
	public void login(String username,String password)
	{
		
		System.out.println("loging with username and password");
		
	}
	public void login(int opt)
	{
		System.out.println("loging with otp");
		
	}
	public void login(String googleAccount)
	{
		
		System.out.println("loging with google account");
	}
	public void login(int pin,String googleAccount)
	{
		System.out.println("loging with pin number and googleAccount");
		
	}
	
	public void login(String googleAccount,int pin)
	{
		
		System.out.println("logging with googleAccount and pin number");
		
		
	}
	
	
	
	
	
	
	

}
