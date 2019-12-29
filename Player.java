//AM 2142 TZETZIS MARKOS
import java.util.Scanner;

class Player
{
	private String name="markos";
	private int score=0;

	public Player(String name,int score){

		this.name=name;
		this.score=score;

	}

	public void play(MineField table){
		int [][] samePlay;
		int x,y;
		
		Scanner input= new Scanner (System.in);
		samePlay= new int[10][10];
		

		System.out.println(this.name + "  POIO KELI THELEIS NA ANOIKSEIS? ");
		x = input.nextInt();y = input.nextInt();
		
		if((x<0 || x>9)||(y<0 || y>9)||(samePlay[x][y]==1)){

			do{
				System.out.println("LATHOS SUNTETAGMENES.KSANAPROSPA8HSE \n");
				System.out.println(this.name + "  POIO KELI THELEIS NA ANOIKSEIS? ");
				x = input.nextInt();y = input.nextInt();
				
			}while((x<0 || x>9)||(y<0 || y>9));
			

			if((table.check(x,y)==true)){
				
				System.out.println("BRHKES NARKH!MPRAVO!\n");
				samePlay[x][y]=1;
				this.score+=1;
			}else{
				samePlay[x][y]=1;
				System.out.println("ATUXIAA!\n");
			}
		}else{
			
			while(samePlay[x][y]==1){

				System.out.println("TO KELI EXEI KSANAANOIXTEI.KSANAPROSPA8HSE \n");
				System.out.println(this.name + "  POIO KELI THELEIS NA ANOIKSEIS? ");
				x = input.nextInt();y = input.nextInt();
			
			}
			
			if((table.check(x,y)==true)){
				samePlay[x][y]=1;
				System.out.println("BRHKES NARKH!MPRAVO!");
				this.score+=1;
			}else{
				samePlay[x][y]=1;
				System.out.println("ATUXIAA!"+samePlay[x][y]);
			}		
		}
			//DEN KSANAZHTAEI TIMES APO TON XRHSTH AN TO KELI EXEI KSANAANOIXTOI..
		
	}

	public void printScore(Player playerOne){
		System.out.println("\n"+playerOne.name +"  TO SCORE SOU EINAI:  "+playerOne.score+"\n" );	

	}	

	public void printWinner(Player playerTwo){
		if(this.score > playerTwo.score){
			System.out.println(this.name +"EISAI O NIKHTHS! ME SCORE: "+this.score);
		}else if(this.score < playerTwo.score){
			System.out.println(playerTwo.name +"EISAI O NIKHTHS! ME SCORE: "+playerTwo.score);
		}else{
			System.out.println("TO SCORE EINAI ISOPALIA");
		}
	}
	
	

		
}
