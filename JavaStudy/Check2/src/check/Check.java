package check;

import constants.Constants;

public class Check {

	private static String firstName="北澤";
	private static String lastName="遼";
	
	private static void printName(String firstName,String lastName) {
		System.out.println("printNameメソッド　→　" + firstName + " " + lastName);
	}
	
	public static void main(String[] args) {
		Check.printName(firstName,lastName);
		Pet Pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		Pet.introduce();

		RobotPet RobotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		RobotPet.introduce();
		
	}
}

