import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.*;

public class Main {
	public static void main(String[] args) throws IOException{
		try{
			OutputStream output = System.out;
			InputStream input = System.in;
			StringBuilder str = new StringBuilder("");

			int l = 0;
			while (true){
				l = input.read();
				if (l == -1) break;
				StringBuilder ll = new StringBuilder("");
				ll = ll.append(Integer.toHexString(l));
				if (ll.length() < 2) {str = str.append("0");str = str.append(ll);}
				else str = str.append(ll);
			}
			String st = str.toString();
			st = st.toUpperCase();
			System.out.print(st);
		}
		catch (Exception e){throw e;}
	}
}