/**
 * ���� Ŭ����
 */
import java.util.Scanner;

public class Stage{
	private String[] genre={"����", "�θǽ�","�ô��","����","������"};
	private String sopum;//��ǰ ����
	private String baegyeong;//��� ����
	private String umak;//���� ����
	static private String choiceOfgenre;//�帣����
	public int wansungdo=0;//�ϼ�������
	private int gongpo=0;
	private int romance=0;
	private int sidaeguk=0;
	private int beomgeu=0;
	private int sports=0;
	
	void genre( ){
		Scanner sc = new Scanner(System.in);
	    do{
	    	System.out.printf("\n�帣�� �������ּ���.(���ڷ�)\n[1.����, 2.�θǽ�, 3.�ô��, 4.����, 5.������]\n>>");//��ϵ��� �뷫������ �����߽��ϴ�.
	    	int n=sc.nextInt();
	    	Stage.choiceOfgenre = genre[n-1];
	    	if(n==1||n==2||n==3||n==4||n==5) break;
	    }while(true);

	}
	   
	void background(){
		Scanner sc = new Scanner(System.in);
		do{
			System.out.printf("\n����� �����ϼ���.(����)\n[��, ����, �����, ī��, �� ��,  ���]\n>>");//��ϵ��� �뷫������ �����߽��ϴ�.
	         this.baegyeong = sc.nextLine();
	      
	         if(this.baegyeong.equals("��")) {
	            this.gongpo++;
	            this.sidaeguk++;
	            break;}
	         else if (this.baegyeong.equals("����")){
	            this.romance++;
	            this.beomgeu++;
	            break;}
	         else if (this.baegyeong.equals("�����")){
	            this.sports++;
	            break;}
	         else if (this.baegyeong.equals("ī��")){
	            this.romance++;
	            this.beomgeu++;
	            break;}
	         else if (this.baegyeong.equals("�� ��")){
	            this.gongpo++;
	            this.romance++;
	            break;}
	         else if(this.baegyeong.equals("���")){
	            this.sidaeguk++;
	            break;} 
	      }while (true);

	      }
	      
	   

	   void tool(){
	      Scanner sc = new Scanner(System.in);
	      do{
	         System.out.printf("\n��ǰ�� �����ϼ���.(����)\n[Į, ��, �񵵸�, Ȱ, ����]\n>>");//��ϵ��� �뷫������ �����߽��ϴ�.
	         this.sopum = sc.nextLine();
	      
	         if(this.sopum.equals("Į")){
	            this.sidaeguk++;
	            this.gongpo++;
	            break;
	         }
	         else if (this.sopum.equals("��")){
	            this.beomgeu++;
	            break;
	         }
	         else if(this.sopum.equals("�񵵸�")){
	            this.romance++;
	            break;
	         }
	         else if(this.sopum.equals("Ȱ")){
	            this.sidaeguk++;
	            this.sports++;
	            break;}
	         else if (this.sopum.equals("����")){
	            this.sports++;
	            break;
	         }
	      }while(true);

	   }
	   
	   void music(){
	      Scanner sc = new Scanner(System.in);
	      do{
	         System.out.print("\n������ �����ϼ���.(����)\n[�ð��� ������, ������� ��ź, ���ư��� ��Ű����, ���¿���, ��Ű ��, ����]\n>>");//��ϵ��� �뷫������ �����߽��ϴ�.
	      
	         this.umak = sc.nextLine();
	         if(this.umak.equals("�ð��� ������")){
	            this.sidaeguk++;
	            break;
	         }
	         else if (this.umak.equals("������� ��ź")){
	            this.beomgeu++;
	            this.gongpo++;
	            break;
	         }
	         else if(this.umak.equals("���ư��� ��Ű����")){
	            this.romance++;
	            break;
	         }
	         else if(this.umak.equals("��Ű ��")){
	            this.romance++;
	            this.sports++;
	            break;}
			else if(this.umak.equals("����")){
	            this.beomgeu++;
	            this.sidaeguk++;
	            break;}
	         else if (this.umak.equals("���¿���")){
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

	      if (Stage.choiceOfgenre.equals("����")){
	         if(this.gongpo>=2) {
	            this.wansungdo+=this.gongpo;
	            System.out.printf("\n>>�帣�� ��ǰ�� ���� �� ��︰��.");
	         }
	         else {
	            this.wansungdo--;
	            System.out.printf("\n>>�帣�� ��ǰ�� �� ���� �ʴ�.");
	         }
	      }
	      else if (Stage.choiceOfgenre.equals("�θǽ�")){
	         if(this.romance>=2) {
	            this.wansungdo+=this.romance;
	            System.out.printf("\n>>�帣�� ��ǰ�� ���� �� ��︰��.");
	         }
	         else{
	            this.wansungdo--;
	            System.out.printf("\n>>�帣�� ��ǰ�� �� ���� �ʴ�.");
	         }
	      }
	      else if (Stage.choiceOfgenre.equals("�ô��")){
	         if(this.sidaeguk>=2) {
	            this.wansungdo+=this.sidaeguk;
	            System.out.printf("\n>>�帣�� ��ǰ�� ���� �� ��︰��.");
	         }
	         else {
	            this.wansungdo--;
	            System.out.printf("\n>>�帣�� ��ǰ�� �� ���� �ʴ�.");
	         }
	      }
	      else if (Stage.choiceOfgenre.equals("����")){
	         if(this.beomgeu>=2) {
	            this.wansungdo+=this.beomgeu;
	            System.out.printf("\n>>�帣�� ��ǰ�� ���� �� ��︰��.");
	         }
	         else {
	            this.wansungdo--;
	            System.out.printf("\n>>�帣�� ��ǰ�� �� ���� �ʴ�.");
	         }
	      }
	      else if (Stage.choiceOfgenre.equals("������")){
	         if(this.sports>=2) {
	            this.wansungdo+=this.sports;
	            System.out.printf("\n>>�帣�� ��ǰ�� ���� �� ��︰��.");
	         }
	         else {
	            this.wansungdo--;
	            System.out.printf("\n>>�帣�� ��ǰ�� �� ���� �ʴ�.");
	         }
	         
	      }
	      else ;
	   }
	}

