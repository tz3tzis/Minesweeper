//AM 2142 TZETZIS MARKOS
import java.util.Random;

class MineField
{	
	
	private int[][] array;
	private int[][] arrayCheck;
	private int sumMine;
	private Random randomGenerator = new Random();
	
	
	
	
	//DEFAULT CONSTRUCTOR
	public MineField(){
		
		int x,y;
				
		//arxikopoihsh pinaka kinhsewn
		arrayCheck = new int[10][10];

		array=new int[10][10];
		sumMine=20;
		int i = 0;

		do{	
			x=randomGenerator.nextInt(10); y=randomGenerator.nextInt(10);
			if(array[x][y] == 0){
				array[x][y]=-1;		
				i=i+1;
			}
		}while(i<sumMine);
	
		//plegma
		for( i =0;i<10;i++){

			for(int j=0;j<10;j++){

				if(array[i][j] == -1){

					if((i>0 && i<9)&&(j>0 && j<9)){

						if(array[i-1][j-1]!= -1)
							array[i-1][j-1]+=1;
						if(array[i-1][j]!=-1)
							array[i-1][j]+=1;
						if(array[i-1][j+1]!=-1)
							array[i-1][j+1]+=1;
						if(array[i+1][j-1]!=-1)
							array[i+1][j-1]+=1;
						if(array[i+1][j]!=-1)
							array[i+1][j]+=1;
						if(array[i+1][j+1]!=-1)
							array[i+1][j+1]+=1;
						if(array[i][j-1]!=-1)
							array[i][j-1]+=1;
						if(array[i][j+1]!=-1)
							array[i][j+1]+=1;

					}

					if(i==0 && (j >0 && j<9)){

						if(array[i+1][j]!=-1)
							array[i+1][j]+=1;
						if(array[i][j+1]!=-1)
							array[i][j+1]+=1;
						if(array[i+1][j+1]!=-1)
							array[i+1][j+1]+=1;
						if(array[i][j-1]!=-1)
							array[i][j-1]+=1;
						if(array[i+1][j-1]!=-1)
							array[i+1][j-1]+=1;
				
					}

					if(j==0 && (i >0 && i<9)){

						if(array[i+1][j]!=-1)
							array[i+1][j]+=1;
						if(array[i-1][j]!=-1)
							array[i-1][j]+=1;
						if(array[i][j+1]!=-1)
							array[i][j+1]+=1;
						if(array[i-1][j+1]!=-1)
							array[i-1][j+1]+=1;
						if(array[i+1][j+1]!=-1)
							array[i+1][j+1]+=1;
			
					}

					if(i==9 && (j >0 && j<9)){

						if(array[i-1][j-1]!=-1)
							array[i-1][j-1]+=1;
						if(array[i][j-1]!=-1)
							array[i][j-1]+=1;
						if(array[i-1][j]!=-1)
							array[i-1][j]+=1;
						if(array[i-1][j+1]!=-1)
							array[i-1][j+1]+=1;
						if(array[i][j+1]!=-1)
							array[i][j+1]+=1;
				
					}

					if(j==9 && (i >0 && i<9)){
						if(array[i-1][j]!=-1)
							array[i-1][j]+=1;
						if(array[i+1][j]!=-1)
							array[i+1][j]+=1;
						if(array[i+1][j-1]!=-1)
							array[i+1][j-1]+=1;
						if(array[i][j-1]!=-1)
							array[i][j-1]+=1;
						if(array[i-1][j-1]!=-1)
							array[i-1][j-1]+=1;
					}
					if(i==0 && j==0){

						if(array[i+1][j]!=-1)
							array[i+1][j]+=1;
						if(array[i+1][j+1]!=-1)
							array[i+1][j+1]+=1;
						if(array[i][j+1]!=-1)
							array[i][j+1]+=1;
					}

					if(i==9 && j==0){

						if(array[i][j+1]!=-1)
							array[i][j+1]+=1;
						if(array[i-1][j]!=-1)
							array[i-1][j]+=1;
						if(array[i-1][j+1]!=-1)
							array[i-1][j+1]+=1;
					}

					if(i==0 && j==9){
						if(array[i+1][j]!=-1)
							array[i+1][j]+=1;
						if(array[i+1][j-1]!=-1)
							array[i+1][j-1]+=1;
						if(array[i][j-1]!=-1)
							array[i][j-1]+=1;
					}

					if(i==9 && j==9){
						if(array[i][j-1]!=-1)
							array[i][j-1]+=1;
						if(array[i-1][j-1]!=-1)
							array[i-1][j-1]+=1;
						if(array[i-1][j]!=-1)
							array[i-1][j]+=1;
					}
				}			
			}
		}
			
	}
	//CONSTRUCTOR ME ORISMA TO PLH8OS TWN NARKWN
	public MineField(int number){
		
		int x,y;
				
		//arxikopoihsh pinaka kinhsewn
		arrayCheck = new int[10][10];

		array=new int[10][10];
		sumMine=number;
		int i = 0;
		do{	
			x=randomGenerator.nextInt(10); y=randomGenerator.nextInt(10);
			if(array[x][y] == 0){
				array[x][y]=-1;		
				i=i+1;
			}
		}while(i<sumMine);
	
		//plegma
		for( i =0;i<10;i++){

			for(int j=0;j<10;j++){

				if(array[i][j] == -1){

					if((i>0 && i<9)&&(j>0 && j<9)){

						if(array[i-1][j-1]!= -1)
							array[i-1][j-1]+=1;
						if(array[i-1][j]!=-1)
							array[i-1][j]+=1;
						if(array[i-1][j+1]!=-1)
							array[i-1][j+1]+=1;
						if(array[i+1][j-1]!=-1)
							array[i+1][j-1]+=1;
						if(array[i+1][j]!=-1)
							array[i+1][j]+=1;
						if(array[i+1][j+1]!=-1)
							array[i+1][j+1]+=1;
						if(array[i][j-1]!=-1)
							array[i][j-1]+=1;
						if(array[i][j+1]!=-1)
							array[i][j+1]+=1;

					}

					if(i==0 && (j >0 && j<9)){

						if(array[i+1][j]!=-1)
							array[i+1][j]+=1;
						if(array[i][j+1]!=-1)
							array[i][j+1]+=1;
						if(array[i+1][j+1]!=-1)
							array[i+1][j+1]+=1;
						if(array[i][j-1]!=-1)
							array[i][j-1]+=1;
						if(array[i+1][j-1]!=-1)
							array[i+1][j-1]+=1;
				
					}

					if(j==0 && (i >0 && i<9)){

						if(array[i+1][j]!=-1)
							array[i+1][j]+=1;
						if(array[i-1][j]!=-1)
							array[i-1][j]+=1;
						if(array[i][j+1]!=-1)
							array[i][j+1]+=1;
						if(array[i-1][j+1]!=-1)
							array[i-1][j+1]+=1;
						if(array[i+1][j+1]!=-1)
							array[i+1][j+1]+=1;
			
					}

					if(i==9 && (j >0 && j<9)){

						if(array[i-1][j-1]!=-1)
							array[i-1][j-1]+=1;
						if(array[i][j-1]!=-1)
							array[i][j-1]+=1;
						if(array[i-1][j]!=-1)
							array[i-1][j]+=1;
						if(array[i-1][j+1]!=-1)
							array[i-1][j+1]+=1;
						if(array[i][j+1]!=-1)
							array[i][j+1]+=1;
				
					}

					if(j==9 && (i >0 && i<9)){
						if(array[i-1][j]!=-1)
							array[i-1][j]+=1;
						if(array[i+1][j]!=-1)
							array[i+1][j]+=1;
						if(array[i+1][j-1]!=-1)
							array[i+1][j-1]+=1;
						if(array[i][j-1]!=-1)
							array[i][j-1]+=1;
						if(array[i-1][j-1]!=-1)
							array[i-1][j-1]+=1;
					}
					if(i==0 && j==0){

						if(array[i+1][j]!=-1)
							array[i+1][j]+=1;
						if(array[i+1][j+1]!=-1)
							array[i+1][j+1]+=1;
						if(array[i][j+1]!=-1)
							array[i][j+1]+=1;
					}

					if(i==9 && j==0){

						if(array[i][j+1]!=-1)
							array[i][j+1]+=1;
						if(array[i-1][j]!=-1)
							array[i-1][j]+=1;
						if(array[i-1][j+1]!=-1)
							array[i-1][j+1]+=1;
					}

					if(i==0 && j==9){
						if(array[i+1][j]!=-1)
							array[i+1][j]+=1;
						if(array[i+1][j-1]!=-1)
							array[i+1][j-1]+=1;
						if(array[i][j-1]!=-1)
							array[i][j-1]+=1;
					}

					if(i==9 && j==9){
						if(array[i][j-1]!=-1)
							array[i][j-1]+=1;
						if(array[i-1][j-1]!=-1)
							array[i-1][j-1]+=1;
						if(array[i-1][j]!=-1)
							array[i-1][j]+=1;
					}
				}			
			}
		}
			
	}
	
	//METHODOS PRINT-EKTUPWNEI TON PINAKA
	public void print(){
		String x="X";
		String numbersLinesVertical="          0      1      2      3      4      5      6      7      8      9";
		System.out.println(numbersLinesVertical);
		for(int i =0;i<10;i++){
			System.out.printf(" %5d ",i);
			for(int j=0;j<10;j++){
				if(arrayCheck[i][j]==0){
					System.out.printf(" %5s ",x);
				}else if(arrayCheck[i][j]==1){
					System.out.printf(" %5d ",array[i][j]);
				}
			}
					
			System.out.println();
		}
	}

	//METHODOS CHECK -ELENXEI AN UPARXEI NARKH
	public boolean check(int x,int y){
	
		if((arrayCheck[x][y]==0)&&(array[x][y]==-1)){

			arrayCheck[x][y]=1;
			sumMine=sumMine-1;
			return true;
		}else{
			arrayCheck[x][y]=1;
			return false;
		}
					
	}
	

	public boolean allMinesFound(){

		if(sumMine == 0){
			return true;
		}else{
			return false;
		}		
	}
	
		
}
