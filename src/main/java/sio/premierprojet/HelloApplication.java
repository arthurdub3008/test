package sio.premierprojet;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Moto a = new Moto("MT07", "noir", 100);
        jouet j = new jouet();
        j.setNom("Poupée Barbie");
        j.setMatiere("Plastique");
        j.setPrix(15);
        j.setUneCategorie(2);
        jouet i = new jouet();
        i.setNom("Echec lumineux");
        i.setMatiere("verre");
        i.setPrix(45);
        i.setUneCategorie(4);
        System.out.println(j.getNom());
        System.out.println((i.getPublic()));
        System.out.println((i.getMatiere()));
        int vitesse = a.donnervitesse();
        System.out.println(vitesse);
        a.accelerer(100);
        System.out.println(a.donnervitesse());
        //launch();
        int saisie = 1;
        do {
            System.out.println("\tTapez 1 pour connaitre l'etat des objets\n\tTapez 2 pour augmenter en pourcentage le prix des objets\n\tTapez 3 pour intervertir la categorie de deux objets\n\tTapez 4 pour quitter\n");
            Scanner sc = new Scanner(System.in);
            saisie = sc.nextInt();
            switch (saisie) {
                case 1:
                    System.out.println(j.getMatiere());
                    break;
                case 2:
                    System.out.println(j.getPrix());
                    j.modifPrix(12);
                    System.out.println(j.getPrix());
                    break;
                case 3:
                    j.intervertir_cat_objet(j, i);
                    System.out.println(i.categorie());
                    System.out.println(j.categorie());
                    break;

            }
        }while (saisie != 4);
    }
}