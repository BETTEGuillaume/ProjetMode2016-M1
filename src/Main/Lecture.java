package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Lecture {


	public Lecture() throws IOException{

		try{
			File f = new File ("test.txt");
			FileReader fr = new FileReader (f);
			BufferedReader br = new BufferedReader (fr);
			String ligne = "coucou";
			int nbPoint= 0;
			int nbSegment = 0;
			int nbFaces = 0;
			//Nb voulu lors de l'initialisation
			int check = 0;
			//verifie si le nb de lignes est respecte
			int tmpCheck = 0;
			int goIn = 0;
			try{
				while (ligne != null)
				{
					//	System.out.println("tmpCheck : " + tmpCheck + " check : " + check);
					ligne = br.readLine();	

					if(ligne.startsWith("#")){
						if(check == tmpCheck){
							System.out.println("out");
							tmpCheck = 0;
						}
						else{
							System.out.println("Votre fichier ne correspond pas au bon format. Veuillez changer votre fichier");
							break;
						}	
					}
					//Laisser en if on doit toujours passer par cette verification
					if(ligne.equals("# nb points, nb segments, nb faces")){
						goIn = 1;
						check = 1;
					}
					else if(goIn == 1){
						nbPoint = Integer.parseInt(ligne.substring(0, 1));
						nbSegment = Integer.parseInt(ligne.substring(2,3));
						check = 2;
						goIn = 0;

					}
					else if(ligne.equals("# points")){
						System.out.println("nbPoint :" + nbPoint);
						check = nbPoint;
						tmpCheck--;
					}
					else if(ligne.equals("# segments")){
						System.out.println("nbSegments :" + nbSegment);
						check = nbSegment;
						tmpCheck--;
					}

					tmpCheck++;

					System.out.println(ligne);		
				}



			}
			catch (NoSuchElementException exception){
				System.out.println(exception.getMessage());
			}

		}

		catch (FileNotFoundException exception){
			System.out.println ("Le fichier n'a pas été trouvé");
		}


	}
}
