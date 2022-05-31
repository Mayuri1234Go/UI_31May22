package genricMethod;

import java.util.Random;

/*
 * Created By Vinayak Waghchaure
 */

public class AadharCardNoGenerator
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getAadharCardNo());

	}


	public static String getAadharCardNo() {
		// It will generate 12 digit random Number.
		// from 0 to 999999.
		Random rnd = new Random();

		int number = rnd. nextInt(99999);
		// this will convert any number sequence into 12 character.
		return String. format("%012d", number);

	}



}
