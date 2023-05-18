package OOPSProgram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionConcept {

	public static void main(String[] args) {
	System.out.println("1");
	System.out.println("2");
	System.out.println("3");
	System.out.println("4");
	System.out.println("5");
	//handle exception:Arithmetic Exception
	try {
		//risky code:
		FileInputStream file = new FileInputStream("\"C:\\Users\\Hp\\Documents\\EXCEL.xlsx\"");
		//int a=1/0;
		int a [] = {1,2,3};
		System.out.println(a[4]);
	}
	catch(FileNotFoundException e){
		//excption handling
		//.out.println("file is avilable,please add file");
	}
	int a [] = {1,2,3};
	//int a=1/0;
	System.out.println("6");
	System.out.println("7");
	System.out.println("8");
	System.out.println("9");
	System.out.println("10");

	}

}
