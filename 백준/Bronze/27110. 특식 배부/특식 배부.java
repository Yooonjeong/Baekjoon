
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n,a,b,c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[3];
		int sum=0;
		for(int i=0; i<3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(arr[i]<=n) {
				sum += arr[i];
			}
			else {
				sum += n;
			}
		}
		System.out.println(sum);
	}

}
