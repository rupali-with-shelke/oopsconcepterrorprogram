package OOPSProgram;

public class TM_Nexon extends Nexon{

	public static void main(String[] args) {
		
		TM_Nexon tm= new TM_Nexon ();
		tm.wheels();
		tm.engine();
		tm.color();
		tm.sunroof();
		tm.ADAS();

	}

	@Override
	public void sunroof() {
		System.out.println("TMNexon varient have sunroof");
	}

	public void ADAS() {
		
		System.out.println("Nexon car doesnt have ADAS features");
	}
   
	

}
