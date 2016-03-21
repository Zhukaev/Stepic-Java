import java.io.IOException;
import java.io.InputStream;

public class Step5_2 {
	public static int checkSumOfStream(InputStream inputStream) throws IOException {
		int b;
		int C = 0;
		while (true){
			b = inputStream.read();
			if (b == -1) break;
			else C = Integer.rotateLeft(C,1)^b;
		}
		//System.out.print((int)C);
		return C;
	}
}
