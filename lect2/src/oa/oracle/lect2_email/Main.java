package oa.oracle.lect2_email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static boolean testEmail(String email) {
		Pattern sample = Pattern
				.compile("(\\w+)@(\\w+)\\.([a-z]+)\\.?([a-z]+)?\\.?([a-z]+)?$");

		Matcher m = sample.matcher(email);
		return m.matches();
	}

	public static void main(String[] args) {

		String[] emailsToCheck = { "valid@ukr.net", "abcd@ua!ukr.net",
				"AB_CD@mail.nEt", "ab@@ukr.net", "as.net@ukr.net", "ad.com",
				"ad@cum.ua.su.pl", "as@", "abc5@ukr.ukr.net",
				"false@meta.ua.uk.privet.by" };

		for (int i = 0; i < emailsToCheck.length; i++) {
			System.out.print("email ");
			System.out.printf("%-30s", emailsToCheck[i]); // question   will new string create ?
			System.out.printf("%10s%n", testEmail(emailsToCheck[i]));
		}

	}

}
