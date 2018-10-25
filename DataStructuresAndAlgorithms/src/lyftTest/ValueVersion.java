package lyftTest;

import java.util.HashMap;

public class ValueVersion {
	private Integer value; 
	private Integer version;
	private HashMap<Integer, Integer> valueVerMap;
	
	public ValueVersion (Integer value, Integer version) {
		this.setValue(value);
		this.setVersion(version);
		valueVerMap = new HashMap<>();
		valueVerMap.put(value, version);		
	}
	
	public void setValueVerMap(Integer value, Integer version) {
		valueVerMap.put(value, version);	
	}
	
	public HashMap<Integer, Integer> getValueVerMap() {
		return valueVerMap;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
