import java.util.Scanner;

public class StringComparison{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter two words: ");
		String s1 = s.next();
		String s2 = s.next();
		
		System.out.print("Case-sensitive order: ");
		if(s1.compareTo(s2)>0){ //s1�� �����ڵ尡 �� ũ�ٸ�(���� ���ڶ��) s1, s2 �ٲ㼭 ���
			System.out.println(s2+" "+s1);
		}
		else System.out.println(s1+" "+s2); 
			
		System.out.print("Not case-sensitive order: ");
		if(s1.compareToIgnoreCase(s2)>0){ //���ĺ� �� �ҹ��ڸ� ������ �ʰ� s1�� �����ڵ尡 �� ũ�ٸ�(���� ���ڶ��) s1, s2 �ٲ㼭 ���
			System.out.println(s2+" "+s1);
		}
		else System.out.println(s1+" "+s2);
		
		s.close();
	}
}
