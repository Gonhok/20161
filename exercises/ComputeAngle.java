import java.util.Scanner;

public class ComputeAngle {		
	public static void main(String[] args){
		double a = Math.sqrt(Math.pow(4,2)+Math.pow(3,2));
		double alpha, beta;
		alpha = Math.asin(3/a);
		beta = Math.asin(4/a);
		System.out.printf("alpha = %.2f radians, %.1f degrees\n", alpha, Math.toDegrees(alpha));
		System.out.printf("beta = %.2f radians, %.1f degrees\n", beta, Math.toDegrees(beta));
	}
}
