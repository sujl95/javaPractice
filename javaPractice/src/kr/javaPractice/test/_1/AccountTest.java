package kr.javaPractice.test._1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class AccountTest {
	private Account account;

	@Test
	public void testAccount() throws Exception {
		setup();
	}

	@Before
	public void setup() {
		account = new Account(10000);
	}

	@Test
	public void testGetBalance() throws Exception {
		setup();
		assertEquals(10000, account.getBalance());

		account = new Account(1000);
		assertEquals(1000, account.getBalance());

		account = new Account(0);
		assertEquals(0, account.getBalance());
	}

	@Test
	public void testDeposit() throws Exception {
		setup();
		account.deposit(1000);
		assertEquals(11000, account.getBalance());
	}

	@Test
	public void testWithdraw() throws Exception {
		setup();
		account.withdraw(1000);
		assertEquals(9000, account.getBalance());
	}
}
