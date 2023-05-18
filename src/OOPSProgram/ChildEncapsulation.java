package OOPSProgram;

public class ChildEncapsulation extends ParentEncapsulation{

	public static void main(String[] args) {
		
		ChildEncapsulation ce= new ChildEncapsulation();
		ce.getCredentialsInfo();
		System.out.println("************************************************");
		ce.setCredentialsInfo("Admin","admin@123");
		ce.getCredentialsInfo();

	}

}
