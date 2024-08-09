import java.util.Scanner;
import java.util.*;
public class Main{
	public static void main(String[] args){
		puzzle p = new puzzle();



		int[] board = p.create();
		p.print(board);
		System.out.println(p.possible(board));
		System.out.println(p.findBlank(board));
		System.out.println(p.canMove(board)[0] + " " + p.canMove(board)[1] + " " + p.canMove(board)[2] + " " + p.canMove(board)[3]);


		
	}
}