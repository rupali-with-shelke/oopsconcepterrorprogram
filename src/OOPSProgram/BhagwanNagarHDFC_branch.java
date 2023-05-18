package OOPSProgram;

public class BhagwanNagarHDFC_branch extends HDFC {

	public static void main(String[] args) {
		BhagwanNagarHDFC_branch B_b= new BhagwanNagarHDFC_branch();
		 B_b.deposit();
		 B_b.nrofEmployee();
		 B_b.withdraw();
		

	}

	@Override
	public void deposit() {
		
		System.out.println("user can deposite money");
	}

}
