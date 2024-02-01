package sio.premierprojet;

public class Moto {
    private String modele;
    private String couleur;
    private int vitesse;

    public Moto(String unMod, String uneCoul, int uneVisit) {
        this.modele = unMod;
        this.couleur = uneCoul;
        this.vitesse = uneVisit;
    }
    public void accelerer(int vitesse_acceleration) {
        if(this.vitesse + vitesse_acceleration > 130)
            this.vitesse = 130;
        else
            this.vitesse += vitesse_acceleration;
    }

    public int donnervitesse() {
        return this.vitesse;
    }
}
