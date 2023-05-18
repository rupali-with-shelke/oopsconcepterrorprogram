package OOPSProgram;

public class ChildOverridingMethod extends ParentOverridingMethod {

	public static void main(String[] args) {
		
		ChildOverridingMethod com= new ChildOverridingMethod();
		com.explicitWait(150);

	}
    public void explicitWait(int duration)
    {
    	
    	System.out.println("explict wait is seconds   :"+"   "+duration);
    }
}
