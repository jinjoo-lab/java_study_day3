import java.util.*;
public class multigame {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int input=0,score=0;
		int random=0;
		while(true) {
		
		int left_num=(int)((Math.random()*9)+1);
		int right_num=(int)((Math.random()*9)+1);
		
		random=left_num*right_num;
		
		System.out.printf("%d * %d =",left_num,right_num);
		input=scanner.nextInt();
		
		if(input==random) {
			score= score +10;
		}
		if(score==100)
			break;
		if(input!=random)
			break;
	}
		System.out.println("your score is "+score);
	}
}
