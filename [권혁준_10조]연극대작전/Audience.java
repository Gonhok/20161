/**
 * ���� Ŭ����
 * @author Kwon
 *
 */
public class Audience {

	private static int numberOfAudience;//������ �� ����
	private int interest;//������ ���ؿ� ���� ���
	private int happiness;//������

	Audience(){}
	
	void setNumberOfAudience(int a){//a=����� �ܸ��ġ
		Audience.numberOfAudience=20*a;//�ܸ��ġ������ ������ ���� �ִ� 2000��
	}
	
	int getNumberOfAudience(){
		return numberOfAudience;
	}
	
	void setInterest(int a){//a�� ������ �ϼ���
		this.interest=a;
	}
	
	void showInterest(){
		
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}
		if(this.interest>=5) System.out.println("�������� �⸳�ڼ��� �մϴ�!");//5�� ������ ��ǥ��. ���ĺ��氡��
		else if(this.interest>=3) System.out.println("�������� ȯȣ�մϴ�!");
		else if(this.interest>=1) System.out.println("�ڼ��Ҹ��� �Բ� ���븦 ��Ĩ�ϴ�.");
		else System.out.println("�������� ǥ���� ���� �ʽ��ϴ�.");
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
	}
	
	void setHappiness(){
		
		if(this.interest>=5) this.happiness+=3;
		else if(this.interest>=3) this.happiness+=2;
		else if(this.interest>1) this.happiness+=1;
		else  this.happiness+=0;	
	}
	
	int pay(){
		return (this.happiness*11000)*Audience.numberOfAudience;//�ִ� �δ� 99000���� ����.
	}//������� ������ ���丮�� �����Ѵ�. �ִ� ���� 1��9800����
	
	
}
