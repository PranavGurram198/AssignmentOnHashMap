//package largest_key_in_hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainLargestKeyHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> re = new HashMap<Integer, String>();
        int n = scanner.nextInt();
        for(int i=0; i<n; i++)
        	re.put(scanner.nextInt(), scanner.next());
        String r=UserMainLargestKeyHashMap.getstring(re);
        System.out.println(r);
	}

}