package exception;

import java.util.*;

public class Whatsapp {
	static void submit() throws WhatsappException {
		int age = 17;
		if (age >= 21) {
			System.out.println("valid age");
		} else {
			throw new WhatsappException("Invalid age");
		}
	}

	public static void main(String[] args) {
		try {
			submit();
		} catch (WhatsappException e) {
			System.out.println(e.getMessage());
		}
	}
}

	class WhatsappException extends Exception {
		
		String msg;

		WhatsappException(String msg) {
			this.msg = msg;
		}

		public String getMessage() {
			return msg;
		}
	}

