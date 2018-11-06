/**
 * 관객 클래스
 * @author Kwon
 *
 */
public class Audience {

	private static int numberOfAudience;//관객의 수 결정
	private int interest;//관객의 연극에 대한 흥미
	private int happiness;//만족도

	Audience(){}
	
	void setNumberOfAudience(int a){//a=배우의 외모수치
		Audience.numberOfAudience=20*a;//외모수치에따라 관객수 결정 최대 2000명
	}
	
	int getNumberOfAudience(){
		return numberOfAudience;
	}
	
	void setInterest(int a){//a는 연극의 완성도
		this.interest=a;
	}
	
	void showInterest(){
		
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}
		if(this.interest>=5) System.out.println("관객들이 기립박수를 합니다!");//5는 임의의 지표임. 추후변경가능
		else if(this.interest>=3) System.out.println("관객들이 환호합니다!");
		else if(this.interest>=1) System.out.println("박수소리와 함께 무대를 마칩니다.");
		else System.out.println("관객들의 표정이 좋지 않습니다.");
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
	}
	
	void setHappiness(){
		
		if(this.interest>=5) this.happiness+=3;
		else if(this.interest>=3) this.happiness+=2;
		else if(this.interest>1) this.happiness+=1;
		else  this.happiness+=0;	
	}
	
	int pay(){
		return (this.happiness*11000)*Audience.numberOfAudience;//최대 인당 99000원씩 낸다.
	}//벌어들인 돈으로 스토리도 결정한다. 최대 매출 1억9800만원
	
	
}
