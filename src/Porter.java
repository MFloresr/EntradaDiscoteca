import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Porter {
    private List<Client> listaFiltrada;

    //mostramos la lista de clientes que tienen las listas
    public void verclientes(List<Client> listaclientes) {
        for (int i = 0; i < listaclientes.size(); i++) {
            System.out.println(listaclientes.get(i));
        }
    }
    //decidimos quienes pueden entrar a la discoteca
    public Boolean PuedeEntrar(Client clientInspecionat, Client modelo) {
        if (clientInspecionat.getSexe().equals(modelo.getSexe())) {
            return false;
        }
        if ((clientInspecionat.getEdad() <= modelo.getEdad())) {
            return false;
        }
        if ((clientInspecionat.getDiners() <= modelo.getDiners())) {
            return false;
        }
        if (clientInspecionat.getNom().equals(modelo.getNom())) {
            return false;
        }
        if (clientInspecionat.getPeus().equals(modelo.getPeus())) {
            return false;
        }
        return true;
    }
}
