import java.io.*;
import java.util.*;

public class Play{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		File file = new File("����.txt");
		File story = new File("story.txt");
		if(file.exists()){//������ ������ ���� �� �ֵ��� ��ġ
			System.out.println("�켱 ������(��������)�� ������ ����ּ���!");
			System.exit(1);
		}
		
		if(!story.exists()){//���丮����
			System.out.println("���丮�� �ǳʶݴϴ�.");
		}
		else{
			try(Scanner st = new Scanner(story)){
				while(st.hasNextLine()){
					System.out.println(st.nextLine());
				}
			}catch(IOException e){
				System.out.println("!IOE!");
			}
		}
		//���丮 �κ� story.txt������ �����ؼ� ��ŵ�� �� �ִ�.
		System.out.println("������ �����Ͻðڽ��ϱ�?(Y/�ٸ�Ű �Է½� ����.)");
		if((input.next()).equalsIgnoreCase("y"));
		else{
			System.exit(2);
		}
		
	
		System.out.printf("\n\n\n\n\n\t\t");//�ΰ�
		for(int i=0;i<7;i++){
			String s = "~���ش�����~";
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.print(s.substring(i, i+1));
		}
		System.out.printf("\n\n\n\n\n");
		System.out.println("");
		
		
		System.out.printf("���븦 ����ϴ�.\n\n");
		Stage s1 = new Stage();//���� ��ü ����  1 2 3 ��
		Stage s2 = new Stage();
		Stage s3 = new Stage();
		
		Actor actor = new Actor();//��� ��ü ����
		
		Audience aud = new Audience();//���� ��ü ����
		
		s1.genre();//������ �����(static) �帣 ����
		
		actor.setYeongi();//����� ����� ����
		actor.setFace();//����� �ܸ� ����
		
		aud.setNumberOfAudience(actor.getFace());//�ܸ��ġ�� ���� ���� ����
		
		System.out.printf("\n~1��~\n");//1 �� ����
		s1.background();
		s1.music();
		s1.tool();
		
		System.out.printf("\n====1���� �ö����ϴ�====\n");// 1�� ����
		
		s1.result();
		actor.startPlaying();
		aud.setInterest((s1.wansungdo)+(actor.acting));
		aud.setHappiness();//������ ����� ������ ��ġ�� �ູ���� ������ �ջ�
		aud.showInterest();
		
		System.out.printf("\n====1���� ���Ƚ��ϴ�====\n");
		
		System.out.printf("\n~2��~\n");//2 �� ����
		s2.background();
		s2.music();
		s2.tool();
		
		System.out.printf("\n====2���� �ö����ϴ�====\n");// 2�� ����
		
		s2.result();
		actor.startPlaying();
		aud.setInterest((s2.wansungdo)+(actor.acting));
		aud.setHappiness();
		aud.showInterest();
		
		System.out.printf("\n====2���� ���Ƚ��ϴ�====\n");
		
		System.out.printf("\n~3��~\n");//3�� ����
		s3.background();
		s3.music();
		s3.tool();
		
		System.out.printf("\n====3���� �ö����ϴ�====\n");//3�� ����
		
		s3.result();
		actor.startPlaying();
		aud.setInterest((s3.wansungdo)+(actor.acting));
		aud.setHappiness();
		aud.showInterest();
		
		System.out.printf("\n====3���� ���Ƚ��ϴ�====\n");
		
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.printf("\n\n====������ �������ϴ�====\n\n");//���� ���� 
		
	
		System.out.println("������ ������ ��ģ ����� ������ ���ư���.");
		//�÷��̾�� ���� ����� ������ �ްԵȴ�.
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("��ĥ �� ����� ������ ������ �޾ҽ��ϴ�.");
		System.out.println("(������ �� ���α׷��� �ִ� ������ ��۵˴ϴ�.)");
		
		try(PrintWriter output = new PrintWriter(file)){
			output.println("~ ����� �̹� ������ ����Դϴ�.");
			output.println("�̹� ������ �� "+aud.getNumberOfAudience()+"���� ����������,");
			output.println("������� �� "+aud.pay()+"���� �ް� �ɰſ���.~");
			if(aud.pay()>=50_000_000){
				output.println();
				output.printf("����� ���� ��ã�Ҵ�. ���� �� �ٽñ�~");
			}
			else{
				output.println();
				output.printf("����� ���� ��ã�� �� ������. �ٽ��ѹ� �����غ���.");
			}
		}catch(IOException e){
			System.out.println("!IOExcepiont!");
		}finally{
			System.out.printf("\n\n~��~");
		}
		
	
	}
}