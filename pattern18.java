public class Pattern18 
{
public static void main(String[] args)
 {
	int line=5,starcount=5,mid=(line+1)/2,spacecount=2;
	for(int i=1;i<=line;i++)
	{
		for(int j=1;j<=starcount;j++)
		{
			for(int k=1;k<=spacecount;k++)
			{
				System.out.print("*");
			}
		
			if(i<=mid)
			{
				starcount--;
				spacecount++;
			}
			else 
			{
				spacecount--;
				starcount++;
			}
			
		}
		System.out.println();
	}
		
 }
}
