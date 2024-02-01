package sio.premierprojet;

public class jouet {
    private String unNom;

    private  String uneMatiere;

    private  int unPrix;

    private int uneCategorie;

    public void setNom(String unNom) {
        this.unNom = unNom;
    }

    public String getNom() {
        return  this.unNom;
    }

    public void setPrix(int unPrix) {
        this.unPrix = unPrix;
    }

    public void modifPrix(int pourcentage) {
        this.unPrix = this.unPrix * ( this.unPrix * (1 - pourcentage) );
    }
    public void intervertir_cat_objet(jouet jouet_1, jouet jouet_2)  {
        int tampon;
        tampon = jouet_1.uneCategorie;
        jouet_1.uneCategorie = jouet_2.uneCategorie;
        jouet_2.uneCategorie = tampon;

    }
    public int getPrix() {
        return this.unPrix;
    }

    public void setMatiere(String uneMatiere) {
        this.uneMatiere = uneMatiere;
    }

    public String getMatiere() {
        return  this.uneMatiere;
    }

    public void  setUneCategorie(int uneCategorie) {
        this.uneCategorie = uneCategorie;
    }

    public int categorie() {
        return this.uneCategorie;
    }

    public String getPublic() {
        if(categorie() == 1) {
            return "bebe";
        }
        if(categorie() == 2) {
            return "enfants";
        }
        if(categorie() == 3) {
            return "adolescents";
        }
        if(categorie() == 4) {
            return "adultes";
        }
        return "Erreur";
    }
}
