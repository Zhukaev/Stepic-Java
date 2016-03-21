import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/**
 * Created by Æóê on 21.03.2016.
 */
public class Step5_3 {
	public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
		StringBuilder newstr = new StringBuilder("");
		int a;
		Reader b = new InputStreamReader(inputStream,charset);
		while (true){
			a = b.read();
			if (a == -1) break;
			else newstr.append((char)a);
		}
		return newstr.toString();
	}
}
