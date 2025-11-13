package serveur;
import jakarta.xml.ws.Endpoint;
import service.Calculatrice;

public class Serveur {

    public static void main(String[] args) {
        String url = "http://localhost:8080/calculatrice";
        Endpoint.publish(url, new Calculatrice());
        System.out.println("Service web Calculatrice démarré sur l'adresse : " + url);
        System.out.println("WSDL disponible à l'adresse : " + url + "?wsdl");
    }
}
