package genricMethod;

import com.github.javafaker.Faker;

public class RandomString
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getRandomString());
	}
	
	
	public synchronized static String getRandomString()
	{
		Faker faker = new Faker();

		String firstName = faker.name().firstName();
		return firstName;

	}

}
