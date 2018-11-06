/*
	50이상 100이하의 난수를 100개 생성하고, 
	50과 100이 몇번째 난수로 생성되었는지를 출력하고, 
	최초로 몇번째에 나타났는지 출력하는 프로그램을 작성하라.
*/

public class RandomNumberGeneration{		
	public static void main(String[] args){
		int first50=1000, first100=1000;	//최초로 50과 100이 출현한 인덱스를 저장할 변수. 초기화는 절대로 나올 수 없는 인덱스(난수 100개 설정하므로 1000번째에 첫번째로 출현한다는 것은 있을 수 없음)로 설정.
		int randomNumber;
		for(int i=0; i<100; i++){
			randomNumber = (int)(Math.random()*51)+50;
			if(randomNumber==50){
				System.out.println("Found 50 at "+(i+1));
				if(first50==1000) first50 = i+1;		//50이 이전에 한번도 나오지 않았다면 first50이 1000으로 설정되어 있을 것이고, 한번이라도 나타났다면 100이하의 수로 설정되어 있을 것이므로, first50의 값이 1000이라면(50이 이제껏 한번도 생성되지 않았다면) 지금 인덱스를 처음 50이 발생한 인덱스로 설정. 
			}
			else if(randomNumber==100){
				System.out.println("Found 100 at "+(i+1));
				if(first100==1000) first100 = i+1;
			}
		}
		//50과 100이 한번이라도 나타난 경우에만 아래 문구 출력. 
		if(first50!=1000)		System.out.println("The first appearance of 50 was at "+first50);
		if(first100!=1000)		System.out.println("The first appearance of 100 was at "+first100);
	}
}
