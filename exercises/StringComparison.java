import java.util.Scanner;

public class StringComparison{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter two words: ");
		String s1 = s.next();
		String s2 = s.next();
		
		System.out.print("Case-sensitive order: ");
		if(s1.compareTo(s2)>0){ //s1의 유니코드가 더 크다면(뒤의 문자라면) s1, s2 바꿔서 출력
			System.out.println(s2+" "+s1);
		}
		else System.out.println(s1+" "+s2); 
			
		System.out.print("Not case-sensitive order: ");
		if(s1.compareToIgnoreCase(s2)>0){ //알파벳 대 소문자를 가리지 않고 s1의 유니코드가 더 크다면(뒤의 문자라면) s1, s2 바꿔서 출력
			System.out.println(s2+" "+s1);
		}
		else System.out.println(s1+" "+s2);
		
		s.close();
	}
}
