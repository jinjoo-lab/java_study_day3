import java.util.*;
public class updown_dowhile {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int input=0, rand=0,count=0;
		rand=(int)(Math.random()*10)+1;
	
		do {
			System.out.print("1~10������ ���� �Է��ϼ���:");
			input=scanner.nextInt();
			
			if(input<rand)
			{
				System.out.println("Up");
				System.out.println("���� count:"+(4-count));
			}
			else if(input>rand)
			{
				System.out.println("Down");
				System.out.println("���� count:"+(4-count));
			}
			count++;
		}while(input!=rand&&count<6);
		
		System.out.println("correct!");
		System.out.println("�õ� Ƚ��:"+count);
	}

}
