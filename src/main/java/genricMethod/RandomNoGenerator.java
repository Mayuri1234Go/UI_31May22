package genricMethod;

import java.util.Random;

public class RandomNoGenerator {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println(getRandomNumberString());
		System.out.println(randomNumberGenerator());
		System.out.println(getRndNumber());
	}


	public static String getRandomNumberString() {
		// It will generate 6 digit random Number.
		// from 0 to 999999.
		Random rnd = new Random();
		
		int number = rnd. nextInt(999999);
		// this will convert any number sequence into 6 character.
		return String. format("%06d", number);

	}
	
	
	public static String randomNumberGenerator() {
		String randomNumber = "";
		Random random = new Random();
		int num = 100000 + (int) (random.nextFloat() * 89990000);
		randomNumber = randomNumber + String.valueOf(num);
		return randomNumber;
	}
	
	
	public static  String getRndNumber() {	
		Random r=new Random();
		return ((r.nextInt(900000000-700000000)+700000000))+""+r.nextInt(9);
	}

}