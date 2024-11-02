package com.railway.model;

public class CurrentLocationInfo {
	
	private int type;
	private String deeplink;
	private String img_url;
	private String label;
	private String message;
	private String readable_message;
	private String hint;
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getDeeplink() {
		return deeplink;
	}
	public void setDeeplink(String deeplink) {
		this.deeplink = deeplink;
	}
	public String getImg_url() {
		return img_url;
	}
	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getReadable_message() {
		return readable_message;
	}
	public void setReadable_message(String readable_message) {
		this.readable_message = readable_message;
	}
	public String getHint() {
		return hint;
	}
	public void setHint(String hint) {
		this.hint = hint;
	}
	public CurrentLocationInfo(int type, String deeplink, String img_url, String label, String message,
			String readable_message, String hint) {
		super();
		this.type = type;
		this.deeplink = deeplink;
		this.img_url = img_url;
		this.label = label;
		this.message = message;
		this.readable_message = readable_message;
		this.hint = hint;
	}
	public CurrentLocationInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CurrentLocationInfo [type=" + type + ", deeplink=" + deeplink + ", img_url=" + img_url + ", label="
				+ label + ", message=" + message + ", readable_message=" + readable_message + ", hint=" + hint + "]";
	}
	
}
