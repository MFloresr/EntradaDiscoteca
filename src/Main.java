import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
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
               System.out.println("Puede entrar");
           }else{
               System.out.println("No puede entrar");
           }
        }

        //porter.PuedeEntrar(clientes, modelo );
        //porter.verclientes(clientes);

    }
}
