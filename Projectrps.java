import java.util.*;

public class Projectrps {

	public static void main(String[] args) {
		Random random=new Random();
		Scanner sc=new Scanner(System.in);
		String[] choice={"rock","paper","scissor"};
		int countplayer=0;
		int countengine=0;
		int countdraw=0;
		System.out.println("Enter 1 to continue 0 to stop:");
		int input=sc.nextInt();
		sc.nextLine();
		do {
		System.out.println("Enter rock paper scissor:");
		 String player=sc.nextLine();
		 String compmove=choice[random.nextInt(choice.length)];
		System.out.println("Computer move is:"+compmove);
		if(player.equals(compmove)) {
			
			countdraw++;
		}
		else if(player.equals("rock")&&compmove.equals("scissor") ||
				player.equals("paper")&&compmove.equals("rock")||
				player.equals("scissor")&&compmove.equals("paper")) {
			
			countplayer++;
		}
		else {
			
			countengine++;
		}
		System.out.println("Enter 1 to continue 0 to stop:");
		input=sc.nextInt();
		sc.nextLine();
		}while(input==1);
		int playerscore=(countplayer*2)+countdraw;
		int enginescore=(countengine*2)+countdraw;
		System.out.println("Score is :"+playerscore+"-"+enginescore);
		if(playerscore>enginescore) {
			System.out.println("You won:)");
		}
		else if(playerscore==enginescore) {
			System.out.println("Its a tie!!!!");
		}
		else {
			System.out.println("You lost:(");
		}
		sc.close();
		
	}

}