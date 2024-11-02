package com.railway.model;

import java.util.List;

public class SearchStation {
	
		
		    private boolean status;
		    private String message;
		    private long timestamp;
		    private List<Station> data;
			public boolean isStatus() {
				return status;
			}
			public void setStatus(boolean status) {
				this.status = status;
			}
			public String getMessage() {
				return message;
			}
			public void setMessage(String message) {
				this.message = message;
			}
			public long getTimestamp() {
				return timestamp;
			}
			public void setTimestamp(long timestamp) {
				this.timestamp = timestamp;
			}
			public List<Station> getData() {
				return data;
			}
			public void setData(List<Station> data) {
				this.data = data;
			}
			
		    
		    
	

}
