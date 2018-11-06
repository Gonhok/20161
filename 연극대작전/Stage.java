/**
 * 무대 클래스
 */
import java.util.Scanner;

public class Stage{
	private String[] genre={"공포", "로맨스","시대극","범죄","스포츠"};
	private String sopum;//소품 결정
	private String baegyeong;//배경 결정
	private String umak;//음악 결정
	static private String choiceOfgenre;//장르결정
	public int wansungdo=0;//완성도결정
	private int gongpo=0;
	private int romance=0;
	private int sidaeguk=0;
	private int beomgeu=0;
	private int sports=0;
	
	void genre( ){
		Scanner sc = new Scanner(System.in);
	    do{
	    	System.out.printf("\n장르를 결정해주세요.(숫자로)\n[1.공포, 2.로맨스, 3.시대극, 4.범죄, 5.스포츠]\n>>");//목록들은 대략적으로 설정했습니다.
	    	int n=sc.nextInt();
	    	Stage.choiceOfgenre = genre[n-1];
	    	if(n==1||n==2||n==3||n==4||n==5) break;
	    }while(true);

	}
	   
	void background(){
		Scanner sc = new Scanner(System.in);
		do{
			System.out.printf("\n배경을 설정하세요.(글자)\n[숲, 도시, 경기장, 카페, 차 안,  고궁]\n>>");//목록들은 대략적으로 설정했습니다.
	         this.baegyeong = sc.nextLine();
	      
	         if(this.baegyeong.equals("숲")) {
	            this.gongpo++;
	            this.sidaeguk++;
	            break;}
	         else if (this.baegyeong.equals("도시")){
	            this.romance++;
	            this.beomgeu++;
	            break;}
	         else if (this.baegyeong.equals("경기장")){
	            this.sports++;
	            break;}
	         else if (this.baegyeong.equals("카페")){
	            this.romance++;
	            this.beomgeu++;
	            break;}
	         else if (this.baegyeong.equals("차 안")){
	            this.gongpo++;
	            this.romance++;
	            break;}
	         else if(this.baegyeong.equals("고궁")){
	            this.sidaeguk++;
	            break;} 
	      }while (true);

	      }
	      
	   

	   void tool(){
	      Scanner sc = new Scanner(System.in);
	      do{
	         System.out.printf("\n소품을 설정하세요.(글자)\n[칼, 컵, 목도리, 활, 권총]\n>>");//목록들은 대략적으로 설정했습니다.
	         this.sopum = sc.nextLine();
	      
	         if(this.sopum.equals("칼")){
	            this.sidaeguk++;
	            this.gongpo++;
	            break;
	         }
	         else if (this.sopum.equals("컵")){
	            this.beomgeu++;
	            break;
	         }
	         else if(this.sopum.equals("목도리")){
	            this.romance++;
	            break;
	         }
	         else if(this.sopum.equals("활")){
	            this.sidaeguk++;
	            this.sports++;
	            break;}
	         else if (this.sopum.equals("권총")){
	            this.sports++;
	            break;
	         }
	      }while(true);

	   }
	   
	   void music(){
	      Scanner sc = new Scanner(System.in);
	      do{
	         System.out.print("\n음악을 설정하세요.(글자)\n[시간을 돌려서, 오페라의 사탄, 돌아가는 몽키매직, 불태워라, 럭키 원, 몬스터]\n>>");//목록들은 대략적으로 설정했습니다.
	      
	         this.umak = sc.nextLine();
	         if(this.umak.equals("시간을 돌려서")){
	            this.sidaeguk++;
	            break;
	         }
	         else if (this.umak.equals("오페라의 사탄")){
	            this.beomgeu++;
	            this.gongpo++;
	            break;
	         }
	         else if(this.umak.equals("돌아가는 몽키매직")){
	            this.romance++;
	            break;
	         }
	         else if(this.umak.equals("럭키 원")){
	            this.romance++;
	            this.sports++;
	            break;}
			else if(this.umak.equals("몬스터")){
	            this.beomgeu++;
	            this.sidaeguk++;
	            break;}
	         else if (this.umak.equals("불태워라")){
	            this.sports++;
	            break;
	         }
	      }while(true);

	   }
	   
	  void result(){
	    	  try{
					Thread.sleep(1000);
				}catch(Exception e){
					e.printStackTrace();
				}

	      if (Stage.choiceOfgenre.equals("공포")){
	         if(this.gongpo>=2) {
	            this.wansungdo+=this.gongpo;
	            System.out.printf("\n>>장르와 소품이 아주 잘 어울린다.");
	         }
	         else {
	            this.wansungdo--;
	            System.out.printf("\n>>장르와 소품이 잘 맞지 않다.");
	         }
	      }
	      else if (Stage.choiceOfgenre.equals("로맨스")){
	         if(this.romance>=2) {
	            this.wansungdo+=this.romance;
	            System.out.printf("\n>>장르와 소품이 아주 잘 어울린다.");
	         }
	         else{
	            this.wansungdo--;
	            System.out.printf("\n>>장르와 소품이 잘 맞지 않다.");
	         }
	      }
	      else if (Stage.choiceOfgenre.equals("시대극")){
	         if(this.sidaeguk>=2) {
	            this.wansungdo+=this.sidaeguk;
	            System.out.printf("\n>>장르와 소품이 아주 잘 어울린다.");
	         }
	         else {
	            this.wansungdo--;
	            System.out.printf("\n>>장르와 소품이 잘 맞지 않다.");
	         }
	      }
	      else if (Stage.choiceOfgenre.equals("범죄")){
	         if(this.beomgeu>=2) {
	            this.wansungdo+=this.beomgeu;
	            System.out.printf("\n>>장르와 소품이 아주 잘 어울린다.");
	         }
	         else {
	            this.wansungdo--;
	            System.out.printf("\n>>장르와 소품이 잘 맞지 않다.");
	         }
	      }
	      else if (Stage.choiceOfgenre.equals("스포츠")){
	         if(this.sports>=2) {
	            this.wansungdo+=this.sports;
	            System.out.printf("\n>>장르와 소품이 아주 잘 어울린다.");
	         }
	         else {
	            this.wansungdo--;
	            System.out.printf("\n>>장르와 소품이 잘 맞지 않다.");
	         }
	         
	      }
	      else ;
	   }
	}

