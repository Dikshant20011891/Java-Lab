import java.io.*;

class Ques16
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream fis=new FileInputStream("file1.txt");  
		BufferedInputStream bis=new BufferedInputStream(fis);
		FileOutputStream fos=new FileOutputStream("file2.txt"); 
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		int i=0;
		while((i=bis.read())!=-1)
		{
			System.out.print((char)i);
			bos.write(i);  
		} 
		System.out.println();
		bos.close();
		fos.close(); 
		bis.close();
		fis.close();
		
	}
}
