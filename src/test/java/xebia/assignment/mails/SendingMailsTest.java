package xebia.assignment.mails;

import org.junit.jupiter.api.Test;

/**
 * @author gopal211292@gmail.com
 *
 */
public class SendingMailsTest {

	/**
	 * Test class to run the logic. This Test will print all the e-mail id's and the
	 * message to whom the e-mail will be sent by the sendMail() method.
	 */
	@Test
	public void testSendingMails() {
		final String[][] friendsArray = { { "rahul@test.com", "rajat@test.com,rashmi@test.com,vinod@test.com" },
				{ "vineet@test.com", "ajay@test.com,rajat@test.com,rahul@test.com" },
				{ "vinod@test.com", "rahul@test.com,nitin@test.com,vineet@test.com" } };

		SendingMails sendingMails = new SendingMails();
		sendingMails.sendMail("rahul@test.com", "Hello", friendsArray);
	}
}
