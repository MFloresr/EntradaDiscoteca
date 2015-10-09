import com.sun.xml.internal.bind.v2.TODO;

import java.util.Scanner;

public class Client {

    //propiedades
    private String Nom;
    private String Sexe;
    private String Peus;
    private int Edad;
    private int Diners;

    //constructores
    public Client(){
    }
    public Client(String Nom, String Sexe, String Peus, int Edad, int Diners){
        this.Nom = Nom;
        this.Sexe = Sexe;
        this.Peus = Peus;
        this.Edad = Edad;
        this.Diners = Diners;
    }

    //getters and setter
    public String getNom() {
        return Nom;
    }
    public String getSexe() {
        return Sexe;
    }
    public String getPeus() {
        return Peus;
    }
    public int getEdad() {
        return Edad;
    }
    public int getDiners() {
        return Diners;
    }
    public void setDiners(int diners) {
        Diners = diners;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    public void setPeus(String peus) {
        Peus = peus;
    }
    public void setSexe(String sexe) {
        Sexe = sexe;
    }
    public void setNom(String nom) {
        Nom = nom;
    }

    //aqui sobreescribimos la funcion toString para que imprima nuestros datos
    @Override
    public String toString() {
        return "[Nombre : "+this.getNom()+"] [Sexo: "+this.getSexe()+"] [Peus: " +this.getPeus() + "] [Diners: "+this.getDiners()+"] [Edat: "+this.getEdad()+"]";
    }
}