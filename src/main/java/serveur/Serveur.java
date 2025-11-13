package serveur;
import jakarta.xml.ws.Endpoint;
import service.Calculatrice;

public class Serveur {

    public static void main(String[] args) {
        // L'URL où notre service sera accessible.
        // Vous pouvez choisir un autre port si le 8080 est déjà utilisé.
        String url = "http://localhost:8080/calculatrice";
        Endpoint.publish(url, new Calculatrice());
        System.out.println("Service web Calculatrice démarré sur l'adresse : " + url);
        System.out.println("WSDL disponible à l'adresse : " + url + "?wsdl");
    }
}
