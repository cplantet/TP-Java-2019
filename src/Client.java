public class Client {

    private String nom;
    private String prenom;
    private String dateDeNaissance;
    private String telephone;
    private String adresse;

    public Client(String nom,String prenom,String dateDeNaissance,String telephone,String adresse){

        this.nom = nom;
        this.prenom=prenom;
        this.dateDeNaissance=dateDeNaissance;
        this.adresse=adresse;
        this.telephone=telephone;

    }

    /*------------------------------------------Accesseur--------------------------------*/

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /*-------------------------------------------Mutateurs-------------------------------*/


    public String getAdresse() {
        return adresse;
    }

    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTelephone() {
        return telephone;
    }
}
