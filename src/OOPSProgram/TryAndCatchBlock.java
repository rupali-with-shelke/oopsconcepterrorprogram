package OOPSProgram;

public class TryAndCatchBlock {

	public static void main(String[] args) {
		
		
		int number[] = {1,2,3,4,5};
		//System.out.println(number[5]);
		
		//System.out.println("we are learning excption handling");
		// Above program handle using try catch block becz here exception throw
		//so we have to handle using try catch block
		//System.out.println(number[5]);we handle in try block
		try {
			System.out.println("We are in try block");
			int a=1/0;
			System.out.println(a);
			//System.out.println(number[7]);
			System.out.println("Rest of the code of try block");
		}
		//Exception e = new ArrayIndexBoundException
	
		//catch(Exception e)
		catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("please put value till 4th index");
		}
		
		System.out.println("We are learning exception handling");
		
		
		
		
		
	}

}
