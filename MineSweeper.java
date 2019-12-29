//AM 2142 TZETZIS MARKOS
import java.util.Scanner;

class MineSweeper
{
	public static void main(String args[]){
		
		System.out.println("POSES NARKES THELEIS NA EXEI TO PAIXNIDI?  ");
		Scanner bombs= new Scanner (System.in);
		int mines= bombs.nextInt();
		MineField tablo=new MineField(mines);
		
		System.out.println("PAIXTH 1 DWSE MU TO ONOMA SOU:  ");
		Scanner alpha= new Scanner (System.in);
		String playerOne = alpha.nextLine();
		Player newPlayerOne = new Player(playerOne,0);

		System.out.println("PAIXTH 2 DWSE MU TO ONOMA SOU:  ");
		Scanner beta= new Scanner (System.in);
		String playerTwo = beta.nextLine();
		Player newPlayerTwo = new Player(playerTwo,0);
		
		do{
			tablo.print();
			newPlayerOne.play(tablo);
			newPlayerOne.printScore(newPlayerOne);
			newPlayerTwo.printScore(newPlayerTwo);
			tablo.print();
			newPlayerTwo.play(tablo);
			newPlayerOne.printScore(newPlayerOne);
			newPlayerTwo.printScore(newPlayerTwo);

		}while(tablo.allMinesFound() == false);

		newPlayerOne.printWinner(newPlayerTwo);
		System.out.println("GAME OVER");
	}
	


}
