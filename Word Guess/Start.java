import javax.swing.JOptionPane;
import java.util.*;
import java.io.*;

public class Start
{

	String [] array;
	String word;


    public Start() throws IOException
    {
    	array = new String[10];
    	getFile();
    	random();

	}
	public static void message()
	{
		JOptionPane.showMessageDialog(null, "Welcome to the Word Guessing Game!\nYou will choose a category of words and try to\n guess the letters in the word. Good Luck!");
	}
	public void getFile() throws IOException
	{
		String txtfile;
		String category;

	category = JOptionPane.showInputDialog("Please Enter a number of the category you wish to guess \n 1.Web\n 2.Programming ");

		while((category.equals("1")==false) && (category.equals("2")==false) && (category.equals("3")==false))
		{
			JOptionPane.showMessageDialog(null,"Invalid Answer");
			category = JOptionPane.showInputDialog("Please Enter a number of the category you wish to guess \n 1.Web\n 2.Programming");
		}

	switch(category)
		{

		case "1": txtfile="Web.txt";
			break;
		case "2":txtfile = "Programming.txt";
			break;
		default :txtfile = "Programming.txt";
			break;
		}

		File file = new File(txtfile);
		Scanner inputFile = new Scanner(file);

		for(int x=0;x<array.length;x++)
		{
			array[x]=inputFile.nextLine();
		}



	}
	public void random()
	{
		Random random = new Random();
		int randomNum =random.nextInt(array.length);

		 word = array[randomNum];

	}
	public int getLength()
	{
		return word.length();
	}
	public String getWord()
	{
		return word;
	}
}