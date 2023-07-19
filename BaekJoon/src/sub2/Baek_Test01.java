package sub2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_Test01 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		try {
			
			st = new StringTokenizer(br.readLine());
			/*
			 * String ca = br.readLine();
			 * 
			 * String cb = br.readLine();
			 */
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			
			//System.out.println(ca.getClass().getName());
			
			
			if(A > B) {
				System.out.println(">");
				
			}else if(A < B){
				System.out.println("<");
				
			}else {
				System.out.println("==");
			}
			
			
			br.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
			

		}

	}


