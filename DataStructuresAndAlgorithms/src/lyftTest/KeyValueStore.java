package lyftTest;

import java.util.HashMap;
import lyftTest.ValueVersion;
import java.util.Map;

public class KeyValueStore {
	private static int version=1;
	private String key;
	private int value;	 
	private HashMap<String, ValueVersion> keyValueStoreMap = new HashMap<>();
	
	public KeyValueStore(String key, int value) {
		this.key=key;
		this.value=value;
		put(key, value);		
				
	}
	
	protected ValueVersion createValueVersionObj(Integer value, Integer version) {
			return new ValueVersion(value, version);
	}
	
	public void put(String key, int value) {
		if(!keyValueStoreMap.containsKey(key)) {
			keyValueStoreMap.put(key, createValueVersionObj(value, version));
		} else {
			keyValueStoreMap.get(key).setValueVerMap(value, version);
		}
		
		System.out.println("PUT(#"+version+")"+" "+key);
		version++;
	}
	
	public void get(String Key) {
		Integer largest=Integer.MIN_VALUE;
		Integer largestValue=Integer.MIN_VALUE;
		if (!keyValueStoreMap.containsKey(key)) {
			System.out.println("NULL");
		} else {
			for (Map.Entry< Integer, Integer> entry : keyValueStoreMap.get(Key).getValueVerMap().entrySet()) {
				if(largest<entry.getValue()) {
				largest=entry.getValue();
				largestValue=entry.getKey();				
				}
				System.out.println("largest: "+largest);
			}		
		}
		System.out.println("largest: "+largest);
		System.out.println("GET "+key+" ="+keyValueStoreMap.get(Key).getValueVerMap().get(largestValue));		
	}
	
	public void get(String key, Integer versionNo) {
		boolean found=false;
		
		if(!keyValueStoreMap.containsKey(key)) {
			System.out.println("NULL");				
		} else {
			for (Map.Entry< Integer, Integer> entry : keyValueStoreMap.get(key).getValueVerMap().entrySet()) {
				if(entry.getValue().equals(versionNo)) {
					found=true;	
					System.out.println("GET "+key+" (#"+versionNo+") ="+entry.getKey());
					break;
				}				
			}
		}
		if (!found) System.out.println("NULL");
		
	}

}
