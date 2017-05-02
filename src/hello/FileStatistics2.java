package hello;

import java.io.File;

public class FileStatistics2 
{
	public static void main(String[] args)
	{
		
		File file1 = new File("files/textFile");
		File file2 = new File("files/Quote.docx");
		
		if(file1.exists() && file2.exists())
		{		
			double bytes = file1.length();
			
			double bytes2 = file2.length();	
			
			System.out.println(file1.getName()+" Size is "+ bytes+" bytes\n");
			System.out.println(file2.getName()+" Size is "+ bytes2+" bytes\n");
			
			if(bytes>bytes2)
			{
				System.out.println(file1.getName()+" : "+ file2.getName() +" is "+bytes/bytes2+ " : ");
			}
			else
			{
				System.out.println(file1.getName()+" : "+ file2.getName() +" = : "+bytes2/(double)bytes);
			}
		}
		else
		{
			System.out.println(file1.getName() + " or "+file2.getName()+ " is not found");
		}
	}
}
