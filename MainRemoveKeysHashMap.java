//package remove_keys_from_hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class MainRemoveKeysHashMap {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		
		for(int  i=0;i<n;i++)
		{
			hm.put(sc.nextInt(),sc.next());
			}
		System.out.println(UserMainRemoveKeysHashMap.intsizeOfResultandHashMap(hm));
		}
	}