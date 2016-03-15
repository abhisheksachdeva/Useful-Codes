public class physics{
public static void main(String []args){
		// Number of readings
		int n=5;
		// values on x-axis
		double x[]={7.4,6.67,6.25,5.71,5.40};
		// values on y-axis
		double y[]={0,0.693,1.609,2.197,2.708};

		double s1=0.0,s2=0.0,s3=0.0,s4=0.0,m=0.0,c=0.0;
		for(int i=0;i<n;i++){
			s1=s1+x[i];
			s2=s2+y[i];
			s3=s3+x[i]*y[i];
			s4=s4+x[i]*x[i];
		// slope		}
		m= (n*s3-s1*s2)/(n*s4-s1*s1);
		// contant
		c= (s2*s4-s1*s3)/(n*s4-s1*s1);
		System.out.println("Summation x:"+s1);
		System.out.println("Summation y:"+s2);
		System.out.println("Summation x*y:"+s3);
		System.out.println("Summation x*x:"+s4);
		System.out.println("slope:"+m);
		System.out.println("constant:"+c);
	}
}

