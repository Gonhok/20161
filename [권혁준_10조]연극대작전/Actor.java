/**
 * ��� Ŭ����
 */
import java.util.*;

public class Actor {
	   
    private int face;//��
    private int yeongi;//�����
    public int acting;//������ ������
    
    Actor(){}

    
    void setFace( ){//�ܸ��ġ ����
    	Scanner input = new Scanner(System.in);
    	int coin;
    	do{
    		System.out.printf("\n����� �ܸ� �����մϴ�.������ �����ϴ�. 1.�ո� 0.�޸� �� ������\n>>");
    		coin=input.nextInt();
    	}while(coin !=1&&coin !=0);
    	if(coin==(int)(Math.random()*2)){
    		this.face=(int)(Math.random()*21+80);//80-100�� �ܸ�
    		System.out.println(">>����!����� �ܸ��ġ "+this.face+" �� ��츦 ������ϴ�.<<");
    	}
    	else{
    		this.face=(int)(Math.random()*61+10);//10-70�� �ܸ�
    		System.out.println(">>��!����� �ܸ��ġ "+this.face+" �� ��츦 ������ϴ�.<<");
    	}
 
    }
    
    int getFace(){
    	return this.face;
    }
    
   
    void setYeongi(){
    	Scanner input = new Scanner(System.in);
    	int coin;
    	do{
    		System.out.printf("\n����� ������� �����մϴ�.������ �����ϴ�. 1.�ո� 0.�޸� �� ������\n>>");
    		coin=input.nextInt();
    	}while(coin !=1&&coin !=0);
    	if(coin==(int)(Math.random()*2)){
    		this.yeongi=(int)(Math.random()*21+80);//80-100�� �����
    		System.out.println(">>����!����� ����� "+this.yeongi+" �� ��츦 ������ϴ�.<<");
    	}
    	else{
    		this.yeongi=(int)(Math.random()*61+10);//10-70�� �����
    		System.out.println(">>��!����� ����� "+this.yeongi+" �� ��츦 ������ϴ�.<<");
    	}

    }
  
    void startPlaying(){
    	System.out.printf("\n>>��찡 ���⸦ �����մϴ�!\n");
    	try{
			Thread.sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}

      if(this.yeongi<(int)(Math.random()*101)){//�Ǽ��ϸ� -1����Ʈ
    	  System.out.println(">>��찡 �Ǽ��� �߽��ϴ�..!");
    	  acting=-1;
      }
      else if(this.yeongi>(int)(Math.random()*101)+10){//�����ϸ� +2����Ʈ
    	  System.out.println(">>����� ���Ⱑ �����߽��ϴ�!");
    	  acting=2;;
      }
      else{
    	  System.out.println(">>��찡 ���⸦ ���ƽ��ϴ�!");
      }
    }
}