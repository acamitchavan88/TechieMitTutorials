import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FNFExceptionDemo {

	public static void main(String[] args)  throws IOException {
		try
		{
		FileReader fileReaderObject=new FileReader("G://Amit//Youtube//TechieMitTutorials-main//README.mds");
		System.out.println("Read data from file "+fileReaderObject.read());
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("File Not Found on specified path");
		}
		

	}

}
