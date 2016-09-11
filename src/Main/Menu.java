package Main;

import java.io.IOException;

public class Menu {

	public Menu(){

		try {
			new Lecture();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
