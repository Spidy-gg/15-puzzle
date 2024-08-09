import java.util.Scanner;
import java.util.*;
public class Main{
	public static void main(String[] args){
		puzzle p = new puzzle();

		// int[] board = {	15, 14, 13, 12, 
		// 				11, 10, 9, 8, 
		// 				7, 6, 5, 4, 
		// 				3, 2, 1, 16   };

		int[] board = p.create();
		p.print(board);
		System.out.println(p.possible(board));


		
	}
}