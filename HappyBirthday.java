import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Hamza Khan 
 * Description: Program uses methods to display happy birthday song.
 * Date: 9/7/2023
 * 
 *Method List:
 *    -  public static void greeting(String name)   [Displays the greeting]
 *    - public static void sayHappy() [displays happy birthday to you]
 *    - public static void main(String[] args)  [Ask user to enter name]
 */
public class HappyBirthday {
	
	
	/**
	 * greeting method 
	 */
	public static void greeting(String name) {
		JOptionPane.showMessageDialog(null, "Happy Birthday dear " + name);
	}
	
	/**
	 * sayHappy method 
	 */
	public static void sayHappy() {
		JOptionPane.showMessageDialog(null, "Happy Birthday to You!");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declare variable of name
		String name;
		
		
		// ask the user for their name 
		name = JOptionPane.showInputDialog(null, "Please Enter Name");
		
		// call methods say happy method twice 
		sayHappy();
		sayHappy();
		
		// call greeting methods say happy birthday with name once 
		greeting(name);
		
		//call methods say happy method once
		sayHappy();
		
		
		System.out.println("Program is Done!");
		
		

	}

}
