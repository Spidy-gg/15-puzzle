import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		puzzle p = new puzzle();
		Scanner sc = new Scanner(System.in);


		int[] board = p.create();
		p.print(board);


		for(int i = 0; i < 99; i++) {
			System.out.println("What is your next move move up(w), move right(d), move down(s), or move left(a):");
			String move = sc.next();
			board = p.move(board, move);
			p.print(board);
		}

		sc.close();

		
		
		
	}
}