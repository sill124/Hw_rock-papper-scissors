import java.util.Scanner;

/**
 * This program implements a rock-paper-scissors game.
 * 
 * @author Younho An
 * @version v0.1
 * @since 04-23 2022
 */

public class HW_Q5 {

	public static void main(String[] args) {

		
		String myHand;
		String botHand[] = {"scissors", "rock", "paper"};
		// it will generates 1~3 value randomly.
		int n = (int)(Math.random()*3); 

		System.out.print("Rock...Scissors...");
		Scanner	scan = new Scanner(System.in);

		myHand = scan.nextLine();

		if(myHand.equals("rock") ||myHand.equals("Rock")) {
			System.out.println("컴퓨터는 *" +botHand[n]+ "*를 냈다.");
			//컴 가위
			if(botHand[n] == botHand[0] ) {
				System.out.println("*****YOU WIN*****");
			}//컴 바위
			else if(botHand[n] == botHand[1] ) {
				System.out.println("=====DRAW=====");
			}//컴 보
			else if(botHand[n] == botHand[2] ) {
				System.out.println("'YOU LOSE'");
			}
		} 
		
		else if(myHand.equals("scissors") || myHand.equals("Scissors")) {
			System.out.println("컴퓨터는 *" +botHand[n]+ "*를 냈다.");
			//컴 가위
			if(botHand[n] == botHand[0]) {
				System.out.println("=====DRAW=====");
			}//컴 바위
			else if(botHand[n] == botHand[1] ) {
				System.out.println("'YOU LOSE'");
			}//컴 보
			else if(botHand[n] == botHand[2] ) {
				System.out.println("*****YOU WIN*****");
			}
		} 
		
		else if(myHand.equals("paper") || myHand.equals("Paper")) {
			System.out.println("컴퓨터는 *" +botHand[n]+ "*를 냈다.");
			//컴 가위
			if(botHand[n] == botHand[0] ) {
				System.out.println("'YOU LOSE'");
			}//컴 바위
			else if(botHand[n] == botHand[1] ) {
				System.out.println("*****YOU WIN*****");
			}//컴 보
			else if(botHand[n] == botHand[2] ) {
				System.out.println("=====DRAW=====");
			}
		}
		
		else {System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");}
	}
}
