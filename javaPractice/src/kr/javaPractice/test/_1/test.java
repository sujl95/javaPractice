package kr.javaPractice.test._1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class test {


	@Test
	public void testAccount() throws Exception {
		Account account = new Account(10000);
	}

	@Test
	public void testGetBalance() throws Exception {
		Account account = new Account(10000);
		if (account.getBalance() != 10000) {
			// throw new Exception();
			fail("getBalance() -> " + account.getBalance());
		}

		account = new Account(1000);
		if (account.getBalance() != 1000) {
			fail();
		}

		account = new Account(0);
		if (account.getBalance() != 0) {
			fail();
		}
	}
}
