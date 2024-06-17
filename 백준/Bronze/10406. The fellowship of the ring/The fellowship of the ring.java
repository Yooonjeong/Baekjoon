
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int w, n, p, cnt=0;
		w = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		p = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<p; i++) {
			int in = Integer.parseInt(st.nextToken());
			if(in>=w&&in<=n) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
