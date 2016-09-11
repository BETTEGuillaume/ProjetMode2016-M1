package Main;

import java.io.IOException;

public class Menu {

	public Menu() throws IOException{

		Lecture l = new Lecture();
		if(l.Vision() == 1){
			//Mettre ici la suite du developpement du code
		}
		else{
			System.out.println("Impossible de lire votre fichier");
		}
	}


}
