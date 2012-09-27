import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HashTest{
	public static void main(String[] args) {


		String key = null;

		HashADT<String, Integer> st = new HashADT<String, Integer>();
		try {
	         File file = new File("/home/madav/work/Android/Hash_ADT/src/res/hash_test_file.txt");
	         FileReader reader = new FileReader(file);
	         BufferedReader in = new BufferedReader(reader);
	         String string;
	         int i = 0;
	         while ((string = in.readLine()) != null) {
	        	 st.put(string, i++);
	        //	 System.out.println(string);
	         }
	         in.close();
	       } catch (IOException e) {
	         e.printStackTrace();
	       }
			
		
// print keys
		for (String s : st.keys())
			System.out.println(s + " " + st.get(s));
	}
}