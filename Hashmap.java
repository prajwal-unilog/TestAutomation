package SimpleProgram;

import java.util.logging.Logger;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;


public class Hashmap {

	public static void main(String[] args) {
		
		HashMap<String, String> hash =  new HashMap<String, String>();
		hash.put("Name", "Prajwal");
		hash.put("Designation", "Automation test engineer");
		
		System.out.println("hash values are:"+hash.get("Name"));
		
		Iterator<String> I = hash.keySet().iterator();
		while(I.hasNext())
		{
		String key = I.next();
		System.out.println(key+":"+hash.get(key));
	}
		/*for(java.util.Map.Entry<String, String> entry : hash.entrySet())
		{
            System.out.println(entry.getKey()+":"+entry.getValue());		
}*/
	}
}
