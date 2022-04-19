//package remove_keys_from_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
class UserMainRemoveKeysHashMap{
	public static int intsizeOfResultandHashMap(HashMap<Integer ,String>hm)
	{
		int k,count=0;
		Iterator<Integer>it=hm.keySet().iterator();
		while(it.hasNext())
		{
			k=it.next();
			if(k%4!=0)count++;
			}
		return count;
		}
}