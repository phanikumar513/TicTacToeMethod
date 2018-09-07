//tic tac toe board using methods.
import java.util.*;
public class TicTacToeMethod{
	
	public static void printBoard(char[][]board)
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(board[i][j]+" ");
			System.out.println();
		}
	}
	
	public static boolean winner(char a[][])
	{
		if(a[0][0]==a[0][1] && a[0][1]==a[0][2] && a[0][0]!='-')
			return true;
		if(a[1][0]==a[1][1] && a[1][1]==a[1][2] && a[1][0]!='-')
			return true;
		if(a[2][0]==a[2][1] && a[2][1]==a[2][2] && a[2][2]!='-')
			return true;
		if(a[0][0]==a[1][0] && a[1][0]==a[2][0] && a[0][0]!='-')
			return true;
		if(a[0][1]==a[1][1] && a[1][1]==a[2][1] && a[1][1]!='-')
			return true;
		if(a[0][2]==a[1][2] && a[1][2]==a[2][2] && a[0][2]!='-')
			return true;
		if(a[0][0]==a[1][1] && a[1][1]==a[2][2] && a[0][0]!='-')
			return true;
		if(a[0][2]==a[1][1] && a[1][1]==a[2][0] && a[2][0]!='-')
			return true;
		
		
		
		return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		char[][]board= {{'-','-','-'},{'-','-','-'},{'-','-','-'}};
		int x,y,player1=0,player2=0,winner=0;
		while(winner==0)
		{
			while(player1==0)
			{
				printBoard(board);
				System.out.println("Enter player 1 location:");
				x=obj.nextInt();
				y=obj.nextInt();
				if(x>=0 && x<3 && y>=0 && y<3)
				{
					if(board[x][y]=='-')
					{
						board[x][y]='0';
						player1++;
						player2=0;
						if(winner(board))
						{
							printBoard(board);
							System.out.println("Player 1 is winner!!");
							winner++;
							player2=1;
							break;
						}
					}
					else
						System.out.println("Entered location is invalid!!");
				}
				else
					System.out.println("Entered location is invalid!!");
				
			}
			while(player2==0)
			{
				printBoard(board);
				System.out.println("Enter player 2 location:");
				x=obj.nextInt();
				y=obj.nextInt();
				if(x>=0 && x<3 && y>=0 && y<3)
				{
					if(board[x][y]=='-')
					{
						board[x][y]='*';
						player2++;
						player1=0;
						if(winner(board))
						{
							printBoard(board);
							System.out.println("Player 2 is winner!!");
							winner++;
							player1=0;
							break;
						}
					}
					else
						System.out.println("Entered location is invalid!!");
				}
				else
					System.out.println("Entered location is invalid!!");
			}
		}
	}
}
