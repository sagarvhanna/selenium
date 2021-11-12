public class pattern13
{
public static void main(String[] args) 
{
	System.out.println("Program Started");
	int lines=5;
	int starcount=1;
	int spacecount=2;
	int mid=(lines+1)/2;
	for(int i=1;i<=lines;i++ )
	{
		for(int j=1;j<=starcount;j++)
		{
			System.out.print("*");
		}
		for(int k=1;k<=spacecount;k++)
		{
			System.out.print(" ");
		}
		for(int l=1;l<=starcount;l++)
		{
			System.out.print("*");
		}
	
		System.out.println();
		if(i<mid)
		{
			starcount++;
			spacecount--;
		}
		else {
			starcount--;
			spacecount++;
		}
	
	}	
}
}
