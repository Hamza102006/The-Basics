import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Hamza khan 
 * Date: 9/7/2023
 * Description:
 *
 */
public class BreakTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// display a bunch of numbers 
		
		String message =  "";
		
		
		for (int i = 0; i <= 10; i++) {
			if (i == 6) {
				break;
			}
			message = message + i + "\n";
		}
		JOptionPane.showMessageDialog(null, message);
	}

}
