import java.io.*;
import java.util.*;

public class Play{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		File file = new File("편지.txt");
		File story = new File("story.txt");
		if(file.exists()){//마지막 편지를 받을 수 있도록 조치
			System.out.println("우선 우편함(실행폴더)의 편지를 비워주세요!");
			System.exit(1);
		}
		
		if(!story.exists()){//스토리파일
			System.out.println("스토리를 건너뜁니다.");
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
		//스토리 부분 story.txt파일을 제거해서 스킵할 수 있다.
		System.out.println("게임을 시작하시겠습니까?(Y/다른키 입력시 종료.)");
		if((input.next()).equalsIgnoreCase("y"));
		else{
			System.exit(2);
		}
		
	
		System.out.printf("\n\n\n\n\n\t\t");//로고
		for(int i=0;i<7;i++){
			String s = "~연극대작전~";
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.print(s.substring(i, i+1));
		}
		System.out.printf("\n\n\n\n\n");
		System.out.println("");
		
		
		System.out.printf("무대를 만듭니다.\n\n");
		Stage s1 = new Stage();//무대 객체 생성  1 2 3 막
		Stage s2 = new Stage();
		Stage s3 = new Stage();
		
		Actor actor = new Actor();//배우 객체 생성
		
		Audience aud = new Audience();//관객 객체 생성
		
		s1.genre();//무대의 공통된(static) 장르 설정
		
		actor.setYeongi();//배우의 연기력 결정
		actor.setFace();//배우의 외모 결정
		
		aud.setNumberOfAudience(actor.getFace());//외모수치에 따른 관객 몰림
		
		System.out.printf("\n~1막~\n");//1 막 구성
		s1.background();
		s1.music();
		s1.tool();
		
		System.out.printf("\n====1막이 올랐습니다====\n");// 1막 실행
		
		s1.result();
		actor.startPlaying();
		aud.setInterest((s1.wansungdo)+(actor.acting));
		aud.setHappiness();//마지막 결과에 영향을 미치는 행복도를 막마다 합산
		aud.showInterest();
		
		System.out.printf("\n====1막이 내렸습니다====\n");
		
		System.out.printf("\n~2막~\n");//2 막 구성
		s2.background();
		s2.music();
		s2.tool();
		
		System.out.printf("\n====2막이 올랐습니다====\n");// 2막 실행
		
		s2.result();
		actor.startPlaying();
		aud.setInterest((s2.wansungdo)+(actor.acting));
		aud.setHappiness();
		aud.showInterest();
		
		System.out.printf("\n====2막이 내렸습니다====\n");
		
		System.out.printf("\n~3막~\n");//3막 구성
		s3.background();
		s3.music();
		s3.tool();
		
		System.out.printf("\n====3막이 올랐습니다====\n");//3막 실행
		
		s3.result();
		actor.startPlaying();
		aud.setInterest((s3.wansungdo)+(actor.acting));
		aud.setHappiness();
		aud.showInterest();
		
		System.out.printf("\n====3막이 내렸습니다====\n");
		
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.printf("\n\n====연극이 끝났습니다====\n\n");//연극 종료 
		
	
		System.out.println("연극을 무사히 마친 당신은 집으로 돌아갔다.");
		//플레이어는 게임 결과를 편지로 받게된다.
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("며칠 후 당신은 한통의 편지를 받았습니다.");
		System.out.println("(편지는 이 프로그램이 있는 폴더로 배송됩니다.)");
		
		try(PrintWriter output = new PrintWriter(file)){
			output.println("~ 선배님 이번 연극의 결과입니다.");
			output.println("이번 연극을 총 "+aud.getNumberOfAudience()+"명이 관람했으며,");
			output.println("선배님은 총 "+aud.pay()+"원을 받게 될거예요.~");
			if(aud.pay()>=50_000_000){
				output.println();
				output.printf("당신은 차를 되찾았다. 좋은 꿈 꾸시길~");
			}
			else{
				output.println();
				output.printf("당신은 차를 되찾을 수 없었다. 다시한번 도전해보자.");
			}
		}catch(IOException e){
			System.out.println("!IOExcepiont!");
		}finally{
			System.out.printf("\n\n~끝~");
		}
		
	
	}
}