// Open an image from URL

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class P1_17 {

	public static void main(String[] args) throws Exception {
		String url = "https://pbs.twimg.com/profile_images/421317967591129089/4Ttm9efN.png";
		URL image_location = new URL(url);
		JOptionPane.showMessageDialog(null, null, "HackBulgaria", JOptionPane.PLAIN_MESSAGE, new ImageIcon(image_location));

	}

}
