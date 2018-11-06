/**
 * 배우 클래스
 */
import java.util.*;

public class Actor {
	   
    private int face;//얼굴
    private int yeongi;//연기력
    public int acting;//연기의 성공도
    
    Actor(){}

    
    void setFace( ){//외모수치 결정
    	Scanner input = new Scanner(System.in);
    	int coin;
    	do{
    		System.out.printf("\n배우의 외모를 결정합니다.동전을 던집니다. 1.앞면 0.뒷면 을 고르세요\n>>");
    		coin=input.nextInt();
    	}while(coin !=1&&coin !=0);
    	if(coin==(int)(Math.random()*2)){
    		this.face=(int)(Math.random()*21+80);//80-100의 외모
    		System.out.println(">>정답!당신은 외모수치 "+this.face+" 의 배우를 얻었습니다.<<");
    	}
    	else{
    		this.face=(int)(Math.random()*61+10);//10-70의 외모
    		System.out.println(">>땡!당신은 외모수치 "+this.face+" 의 배우를 얻었습니다.<<");
    	}
 
    }
    
    int getFace(){
    	return this.face;
    }
    
   
    void setYeongi(){
    	Scanner input = new Scanner(System.in);
    	int coin;
    	do{
    		System.out.printf("\n배우의 연기력을 결정합니다.동전을 던집니다. 1.앞면 0.뒷면 을 고르세요\n>>");
    		coin=input.nextInt();
    	}while(coin !=1&&coin !=0);
    	if(coin==(int)(Math.random()*2)){
    		this.yeongi=(int)(Math.random()*21+80);//80-100의 연기력
    		System.out.println(">>정답!당신은 연기력 "+this.yeongi+" 의 배우를 얻었습니다.<<");
    	}
    	else{
    		this.yeongi=(int)(Math.random()*61+10);//10-70의 연기력
    		System.out.println(">>땡!당신은 연기력 "+this.yeongi+" 의 배우를 얻었습니다.<<");
    	}

    }
  
    void startPlaying(){
    	System.out.printf("\n>>배우가 연기를 시작합니다!\n");
    	try{
			Thread.sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}

      if(this.yeongi<(int)(Math.random()*101)){//실수하면 -1포인트
    	  System.out.println(">>배우가 실수를 했습니다..!");
    	  acting=-1;
      }
      else if(this.yeongi>(int)(Math.random()*101)+10){//굉장하면 +2포인트
    	  System.out.println(">>배우의 연기가 굉장했습니다!");
    	  acting=2;;
      }
      else{
    	  System.out.println(">>배우가 연기를 마쳤습니다!");
      }
    }
}