// Starting scene for my java chess game
public class StartScene {
	// Create grid, place pieces etc
	// 8 x 8 grid
	// Number each piece, negative for black, have an update function, 
	static final int BOARD_DIM = 8;
	char pawnWhite = ' ';
	String pawnBlack = "\u2588";
	public void gridCreation() {
		for (int a = 0; BOARD_DIM >= a; a++) {
			if (a == 0) {
				System.out.println("  A B C D E F G F");
			}
			System.out.print(a + " . ");
			for (int b = 2; BOARD_DIM >= b; b++) {
				System.out.print(". ");
			}
			System.out.print(a + "\n" );
			
		}
		System.out.println("  A B C D E F G F");
		System.out.println(this.pawnBlack);
	}
}
