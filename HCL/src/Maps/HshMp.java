package Maps;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HshMp {

	public static void main(String[] args) {
		Map hs=new HashMap<>();
		hs.put(1, "Java");
		hs.put(2, "Mava");
		hs.put("HI", "Goa");
		
		System.out.println(hs.get(1));
		System.out.println(hs.get("HI"));
		
		System.out.println(hs.containsKey(2));
		System.out.println(hs.containsValue("Mava"));
		System.out.println("****************");
		System.out.println(hs.entrySet());
		
		System.out.println("****************");
		Set s=hs.keySet();
		for(Object key:s){
			System.out.println(key+"-->"+hs.get(key));
		}
		System.out.println("****************");
		Iterator<Entry> en=hs.entrySet().iterator();
		while(en.hasNext()){
			System.out.println(en.next());
		}
		
	}

}
