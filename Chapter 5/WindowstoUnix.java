import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class WindowstoUnix {
	public static void main(String[] args) throws IOException {
		try {
			OutputStream output = System.out;
			InputStream input = System.in;
			int l = 0;
			boolean b = false;
			while (true){
				l = input.read();
				if(l == -1) break;
				else {
					if ((l == 13) && (b == false)) b = true;
					else if ((l == 13) && (b == true)) {b = true;output.write(13);}
					else {
						if (b == false) output.write(l);
						else {
							if (l == 10){
								output.write(l);
								b = false;
							}
							else {
								output.write(13);
								output.write(l);
								b = false;
							}
						}
					}
				}
			}
		}
		catch (Exception e) {throw e;}
		System.out.flush();
	}
}
