public class TestCircleWithRadiusException {
	public static void main(String[] args) {
		try {
			CircleWithRadiusException c1 = new CircleWithRadiusException(-5);
			CircleWithRadiusException c2 = new CircleWithRadiusException(0);
			CircleWithRadiusException c3 = new CircleWithRadiusException(200);
		}catch(NegativeRadiusException nre){ 
			System.err.println(nre.getMessage()); 
			nre.printStackTrace();
		}
		catch(LargeRadiusException lre){ 
			System.err.println(lre.getMessage()); 
			lre.printStackTrace();
		}
		System.out.println("Number of objects created: " + CircleWithRadiusException.getNumberOfObjects());
	}
}

class CircleWithRadiusException{
	static int totalNumberOfCircle;
	double radius;
	CircleWithRadiusException(double r)throws NegativeRadiusException, LargeRadiusException{
		if(r<=0) throw new NegativeRadiusException();
		else if(r>=100) throw new LargeRadiusException();
		else{
			radius = r;
			totalNumberOfCircle++;
		}
	}
	static int getNumberOfObjects(){
		return totalNumberOfCircle;
	}
}

class NegativeRadiusException extends Exception{
	NegativeRadiusException(){
		super("음수 반지름 예외");
	}
}

class LargeRadiusException extends Exception{
	LargeRadiusException(){
		super("100이상의 반지름 예외");
	}
}