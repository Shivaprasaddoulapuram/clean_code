//Simple and compound interest
package lab;
import java.util.Scanner;

 class Inter{
	
	public void interest(float p, float t, float r)
	{
		float s_interest= (p*t*r)/100;
		System.out.append("Interest is "+s_interest);
	}
}
 
 class Comp{
	 public void ci(float p, float n, float r)
	 {
		 double c_interest=p*Math.pow((1+r/100),n);
		System.out.append("Compound interest is "+c_interest);
	 }
	 
}
 
 class Home{
	 
	 public void calc(int std,int area) {
		int cs[]= {1200,1500,1800,2500}; 
		int cost=cs[std]*area;
	    System.out.append("Estimated cost is"+cost);
	 }
	 }

public class Si{
	//public static final Logger LOGGER = LogManager.getLogger(AppClass.class);
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//LOGGER.error("Enter details: ");
		System.out.append("Enter details for simple interest: ");
		float p=s.nextFloat();
		float t=s.nextFloat();
		float r=s.nextFloat();
		Inter uut=new Inter();
		uut.interest(p,t,r);	
		Comp uut2=new Comp();
		System.out.append("Enter details for compound interest: ");
		p=s.nextFloat();
	    float n=s.nextFloat();
	    r=s.nextFloat();
		uut2.ci(p,n,r);	
		System.out.append("Enter details of house construction cost: ");
		Home h=new Home();
		System.out.append("Enter standard: 0:1200-std, 1:1500-above std, 2:1800-high std, 3:2500-high std & fully automated");
		int std=s.nextInt();
		System.out.append("Enter area: ");
		int area=s.nextInt();
		h.calc(std,area);
	   }

}
