package OOPSProgram;

public class ParentEncapsulation {//variable+method==>combination

	public static void main(String[] args) {
		
	
	}
	private String username ="speedway2016";
	private String password="Speedway@2016";
	
	public void getCredentialsInfo()
	{
		
		System.out.println(username);
		System.out.println(password);
	}
	public void setCredentialsInfo(String uname,String pwd)
	{
		
		username=uname;
		password=pwd;
		
	}
	

}
