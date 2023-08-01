package com.tts;

public class Main {

	public static void main(String[] args) {
			
		MobilePhone fake_phone = new MobilePhone("Apple", "IOS", "888-888-8888", 64);
		
		fake_phone.makeCall("111-111-1111");
		
		fake_phone.installApp("game app");
		
		fake_phone.displayInfo();
		
	}
	
}
