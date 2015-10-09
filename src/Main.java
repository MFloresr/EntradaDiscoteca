import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Client> NoEntran = new ArrayList<>();
        List<Client> Entran = new ArrayList<>();
        List<Client> clientes = Arrays.asList(
                //          nom     sexe    calçat  edad diners
                new Client("Jose","Hombre","Bambes",30,150),
                new Client("Maria","Mujer","Sabates",20,20),
                new Client("Maria","Mujer","Bambes",25,30),
                new Client("Jose","Hombre","Sandalies",18,20),
                new Client("Manuel","Hombre","Sabates",18,35),
                new Client("Mariona","Mujer","Sandalies",24,20),
                new Client("Juana","Mujer","Sandalies",17,200),
                new Client("Jose","Hombre","Sabates",27,200)
        );

        Jefe jefe=new Jefe();
        Porter porter= new Porter();

        Client modelo =jefe.OrdenJefe();

        for(int i=0;i<clientes.size();i++){
           if(porter.PuedeEntrar(clientes.get(i), modelo)==true){
               Entran.add(new Client(clientes.get(i).getNom(),clientes.get(i).getSexe(),clientes.get(i).getPeus(),clientes.get(i).getEdad(),clientes.get(i).getDiners()));
           }else{
               NoEntran.add(new Client(clientes.get(i).getNom(),clientes.get(i).getSexe(),clientes.get(i).getPeus(),clientes.get(i).getEdad(),clientes.get(i).getDiners()));
           }
        }
        System.out.println("Entran :");
        System.out.println(" ");
        porter.verclientes(Entran);
        System.out.println(" ");
        System.out.println("No puede entrar : ");
        System.out.println(" ");
        porter.verclientes(NoEntran);
        System.out.println(" ");
        System.out.println("Modelo : ");
        System.out.println(" ");
        System.out.println(modelo);

    }
}
