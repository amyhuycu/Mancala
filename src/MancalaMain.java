import java.util.*;

class Player {
	String name = "";
	int gems = 0;
}

public class MancalaMain {

	public static int getUserMove(Player thisPlayer, char AB, Vector<Integer> gems) {
		
		Scanner inMove = new Scanner(System.in);
		
		char userInput;
		int valid = 0;
		while (valid == 0) {
			valid = 1;
			System.out.println(thisPlayer.name + "'s turn: ");
			System.out.print("Choose a move: ");
			if (AB == 'a') {
				System.out.println(" ( a, b, c, d, e )"); 
			} else {
				System.out.println(" ( f, g, h, i, j )");
			}
			userInput = inMove.next().charAt(0);
			if (AB == 'a') {
				switch(userInput) {
					case 'a':
						if (gems.get(0) != 0) {
							return 0;
						} else {
							valid = 0;
							System.out.println("Invalid input, try again0");
							continue;
						}
					case 'b':
						if (gems.get(1) != 0) {
							return 1;
						} else {
							valid = 0;
							System.out.println("Invalid input, try again1");
							continue;
						}
					case 'c':
						if (gems.get(2) != 0) {
							return 2;
						} else {
							valid = 0;
							System.out.println("Invalid input, try again2");
							continue;
						}
					case 'd':
						if (gems.get(3) != 0) {
							return 3;
						} else {
							valid = 0;
							System.out.println("Invalid input, try again3");
							continue;
						}
					case 'e':
						if (gems.get(4) != 0) {
							return 4;
						} else {
							valid = 0;
							System.out.println("Invalid input, try again4");
							continue;
						}
					default:
						valid = 0;
						System.out.println("Invalid input, try again5");
						continue;
				}
			} else {
				switch(userInput) {
					case 'f':
						if (gems.get(6) != 0) {
							return 6;
						} else {
							valid = 0;
							System.out.println("Invalid input, try again6");
							continue;
						}
					case 'g':
						if (gems.get(7) != 0) {
							return 7;
						} else {
							valid = 0;
							System.out.println("Invalid input, try again7");
							continue;
						}
					case 'h':
						if (gems.get(8) != 0) {
							return 8;
						} else {
							valid = 0;
							System.out.println("Invalid input, try again8");
							continue;
						}
					case 'i':
						if (gems.get(9) != 0) {
							return 9;
						} else {
							valid = 0;
							System.out.println("Invalid input, try again9");
							continue;
						}
					case 'j':
						if (gems.get(10) != 0) {
							return 10;
						} else {
							valid = 0;
							System.out.println("Invalid input, try again10");
							continue;
						}
					default:
						valid = 0;
						System.out.println("Invalid input, try again11");
						continue;
				}
			}
		}
		return 0;
	}
	
	public static void initializeGame(Player player1, Player player2, Vector<Integer> gems) {
		
		Scanner in = new Scanner(System.in);

		System.out.println("Enter player 1's name");
		String player1name = in.nextLine();

		System.out.println("Enter player 2's name");
		String player2name = in.nextLine();
		
		player1.name = player1name;
		player2.name = player2name;
		
		for (int i = 0; i < 5; i++) {
			gems.add(4);
		}
		gems.add(0);
		for (int i = 0; i < 5; i++) {
			gems.add(4);
		}
		gems.add(0);
	}
	public static void displayGame(Player player1, Player player2, Vector<Integer> gems) {
		System.out.println();
		
		System.out.printf("%6s", player1.name);
		System.out.print("           <-------");
		System.out.printf("%18s", player2.name);
		System.out.println();
		// top border
		System.out.print("      ");
		for (int i = 0; i < 31; i++) {
			System.out.print("-");
		}
		System.out.println();
		
		// 1:
		System.out.print("      ");
		for (int i = 0; i < 5; i++) {
			System.out.print("|     ");
		}
		System.out.println("|");
		
		// 2:
		int num = 4; 

		System.out.print("      ");
		for (int i = 0; i < 5; i++) {
			String thisNum = Integer.toString(gems.get(num));
			System.out.print("|(");
			
			System.out.printf("%3s", thisNum);
			System.out.print(")");
			num--;
		}
		System.out.println("|");
		
		// 3:
		char letter = 'e';
		System.out.print("      ");
		for (int i = 0; i < 5; i++) {
			System.out.print("|");
			System.out.print(letter);
			System.out.print("    ");
			letter--;
		}
		System.out.println("|");
		
		
		for (int i = 0; i < 43; i++) {
			System.out.print("-");
		}
		
		System.out.println();
		// middle
		// 1.
		System.out.print("|     |");
		for (int j = 0; j < 29; j++) {
			System.out.print(" ");
		}
		System.out.println("|     |");
		
		// 2. 
		System.out.print("|(");
		String myNum = Integer.toString(player1.gems);
		System.out.printf("%3s", myNum);
		System.out.print(")|");
		for (int j = 0; j < 29; j++) {
			System.out.print(" ");
		}
		System.out.print("|(");
		myNum = Integer.toString(player2.gems);
		System.out.printf("%3s", myNum);
		System.out.println(")|");
		
		// 3. 
		System.out.print("|     |");
		for (int j = 0; j < 29; j++) {
			System.out.print(" ");
		}
		System.out.println("|     |");
		
		// bottom
		for (int i = 0; i < 43; i++) {
			System.out.print("-");
		}
		
		System.out.println();
		// 1:
		System.out.print("      ");
		for (int i = 0; i < 5; i++) {
			System.out.print("|     ");
		}
		System.out.println("|");
		
		// 2:
		num = 6; 

		System.out.print("      ");
		for (int i = 0; i < 5; i++) {
			String thisNum = Integer.toString(gems.get(num));
			System.out.print("|(");
			
			System.out.printf("%3s", thisNum);
			System.out.print(")");
			num++;
		}
		System.out.println("|");
		
		// 3:
		letter = 'f';
		System.out.print("      ");
		for (int i = 0; i < 5; i++) {
			System.out.print("|");
			System.out.print(letter);
			System.out.print("    ");
			letter++;
		}
		System.out.println("|");
		
		System.out.print("      ");
		for (int i = 0; i < 31; i++) {
			System.out.print("-");
		}
	
		System.out.println();
		
		System.out.printf("%6s", player1.name);
		System.out.print("           ------->");
		System.out.printf("%18s", player2.name);
		System.out.println();
		System.out.println();
		System.out.println();
			
	}
	
	public static int updateGame(Player thisPlayer, int boxNum, Vector<Integer> gems, char AB) {
		// this box is now empty
		int numGems = gems.get(boxNum);
		gems.set(boxNum, 0);
		int cur = boxNum + 1;
		for (int i = 0; i < numGems; i++) {
			if (cur == 12) {
				cur = 0;
			}
			if (AB == 'a') {
				if (cur == 5) {
					thisPlayer.gems++;
				} else if (cur == 11) {
					i--;
				} else {
					gems.set(cur, gems.get(cur) + 1);
				}

			} else {
				if (cur == 11) {
					thisPlayer.gems++;
				} else if (cur == 5) {
					i--;
				} else {
					gems.set(cur, gems.get(cur) + 1);
				}
			}
			cur++;
		}
		if (AB == 'a') {
			if (cur - 1 == 5) {
				return 1;
			}
		} else {
			if (cur - 1 == 11) {
				return 1;
			}
		}
		return 0;
		
	}
	
	public static int checkWinner(Player thisPlayer, Vector<Integer> gems, char AB) {
		if (AB == 'a') {
			for (int i = 0; i < 5; i++) {
				if (gems.get(i) != 0) {
					return 0;
				}
			}
		} else {
			for (int i = 6; i < 12; i++) {
				if (gems.get(i) != 0) {
					return 0;
				}
			}
		}
		
		return 1;
	}
	
	public static void main(String[] args) {
		Player player1 = new Player();
		Player player2 = new Player();
		Player thisPlayer = player1;
		Player otherPlayer = player2;
		Vector<Integer> gems = new Vector<Integer>();
		int boxNum;
		int win = 0;
		int again = 0;
		char AB = 'a';
		
		initializeGame(player1, player2, gems);
		displayGame(player1, player2, gems);
		
		while (win != 1) {
			again = 0;

			boxNum = getUserMove(thisPlayer, AB, gems);
			again = updateGame(thisPlayer, boxNum, gems, AB);
			
			displayGame(player1, player2, gems);
			
			// check winner
			win = checkWinner(thisPlayer, gems, AB);
			if (win == 1) {
				System.out.println("Final Score: " + player1.gems + " vs " + player2.gems);
				if (player1.gems > player2.gems) {
					System.out.println(player1.name + " wins! ");					
				} else {
					System.out.println(player2.name + " wins! ");
				}
				break;
			}
			
			if (again == 1) {
				System.out.println("Finished in ( " + thisPlayer.name + " ). Go again.");
			}
			
			// switch players
			if (again == 0) { // same player doesn't go again, need to switch
				if (thisPlayer == player1) {
					thisPlayer = player2;
					otherPlayer = player1;
					AB = 'b';
				} else {
					thisPlayer = player1;
					otherPlayer = player2;
					AB = 'a';
				}
			}

		}
		
	}

}
