/*
	50�̻� 100������ ������ 100�� �����ϰ�, 
	50�� 100�� ���° ������ �����Ǿ������� ����ϰ�, 
	���ʷ� ���°�� ��Ÿ������ ����ϴ� ���α׷��� �ۼ��϶�.
*/

public class RandomNumberGeneration{		
	public static void main(String[] args){
		int first50=1000, first100=1000;	//���ʷ� 50�� 100�� ������ �ε����� ������ ����. �ʱ�ȭ�� ����� ���� �� ���� �ε���(���� 100�� �����ϹǷ� 1000��°�� ù��°�� �����Ѵٴ� ���� ���� �� ����)�� ����.
		int randomNumber;
		for(int i=0; i<100; i++){
			randomNumber = (int)(Math.random()*51)+50;
			if(randomNumber==50){
				System.out.println("Found 50 at "+(i+1));
				if(first50==1000) first50 = i+1;		//50�� ������ �ѹ��� ������ �ʾҴٸ� first50�� 1000���� �����Ǿ� ���� ���̰�, �ѹ��̶� ��Ÿ���ٸ� 100������ ���� �����Ǿ� ���� ���̹Ƿ�, first50�� ���� 1000�̶��(50�� ������ �ѹ��� �������� �ʾҴٸ�) ���� �ε����� ó�� 50�� �߻��� �ε����� ����. 
			}
			else if(randomNumber==100){
				System.out.println("Found 100 at "+(i+1));
				if(first100==1000) first100 = i+1;
			}
		}
		//50�� 100�� �ѹ��̶� ��Ÿ�� ��쿡�� �Ʒ� ���� ���. 
		if(first50!=1000)		System.out.println("The first appearance of 50 was at "+first50);
		if(first100!=1000)		System.out.println("The first appearance of 100 was at "+first100);
	}
}
