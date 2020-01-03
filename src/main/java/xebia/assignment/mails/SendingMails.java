package xebia.assignment.mails;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SendingMails
 * 
 * @author gopal211292@gmail.com
 *
 */
public class SendingMails {

	/**
	 * This method will convert the friends Array into a hashMap and utilize
	 * populateFriendListToSendMail method recursively to find the solution.
	 * 
	 * @param emailAddress
	 * @param message
	 * @param friendsArray
	 */
	public void sendMail(String emailAddress, String message, String[][] friendsArray) {
		Map<String, List<String>> mapOfFriends = new HashMap<>();
		for (String[] mapping : friendsArray) {
			mapOfFriends.put(mapping[0], Arrays.asList(mapping[1].split(",")));
		}
		List<String> emailListToSendMail = new ArrayList<>();
		populateFriendListToSendMail(emailAddress, mapOfFriends, emailListToSendMail);
		// Sender should not receive e-mail even though he might be in friend network of
		// someone else
		emailListToSendMail.remove(emailAddress);
		for (String email : emailListToSendMail) {
			sendMail(email, message);
		}

	}

	/**
	 * Method which finds all the friends in the network.
	 * 
	 * @param emailAddress
	 * 
	 * @param mapOfFriends
	 * @param emailListToSendMail
	 */
	private void populateFriendListToSendMail(String emailAddress, Map<String, List<String>> mapOfFriends,
			List<String> emailListToSendMail) {
		// This will stop recursion in case the e-mail is already parsed once
		if (emailListToSendMail.contains(emailAddress)) {
			return;
		}
		emailListToSendMail.add(emailAddress);
		List<String> listOfFriends = mapOfFriends.get(emailAddress);
		if (listOfFriends != null && !listOfFriends.isEmpty()) {
			for (String friend : listOfFriends) {
				populateFriendListToSendMail(friend, mapOfFriends, emailListToSendMail);
			}
		}
	}

	/**
	 * This method is used to send the e-mail. Dummy method currently prints to the
	 * console.
	 * 
	 * @param emailAddress
	 * @param message
	 */
	private void sendMail(String emailAddress, String message) {
		System.out.println("E-mail : " + emailAddress);
		System.out.println("Message : " + message);
	}
}
