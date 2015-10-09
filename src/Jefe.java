import java.util.ArrayList;
import java.util.Scanner;

public class Jefe {

    private ArrayList orden= new ArrayList();
    private Scanner input= new Scanner(System.in);
    private Client modelo=new Client();

    public Client OrdenJefe(){

        System.out.println("Soy el Jefe ");
        System.out.println("Quien no pueden entrar:");
        modelo.setNom(input.next());

        System.out.println("Hoy entran solo:(Hombre,Mujer,Ambos) ");
        modelo.setSexe(input.next());

        System.out.println("calzado de lo k no deven llevar: (Sabates, Bambes, Sandalies)");
        modelo.setPeus(input.next());

        System.out.println("Edad minima pa entrar a la discoteca: ");
        modelo.setEdad(input.nextInt());

        System.out.println("Dinero minimo que traen los clientes: ");
        modelo.setDiners(input.nextInt());

        modelo.toString();

        return modelo;
    }
}
