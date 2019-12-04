package dependencyobj;
public class Travel implements Journey
{
	private Vehicle v;
	   public void setV(Vehicle v)
	   {
	       this.v = v;
	   }

	public void startJournty() {
		// TODO Auto-generated method stub
		  System.out.println("Journey been started....");
	      v.move();
	}
}
	