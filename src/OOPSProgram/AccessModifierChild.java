package OOPSProgram;

public class AccessModifierChild extends AccessModifierParent{

	public static void main(String[] args) {
		
		AccessModifierChild ac=new AccessModifierChild();
		ac.printAmount();
		ac.demoMethod();
		
	}
    protected void demoMethod()
    {
    	System.out.println("child class demo method");
    }
    
    
    
    }
