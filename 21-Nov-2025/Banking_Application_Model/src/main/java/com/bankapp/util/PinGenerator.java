package com.bankapp.util;

import java.util.Random;

public class PinGenerator {

	public static int generatePin(String locationPin) {
		Random r = new Random();
		int random = 100 + r.nextInt(900); // 3-digit random
		return Integer.parseInt(locationPin.substring(0, 3) + random);
	}
}
