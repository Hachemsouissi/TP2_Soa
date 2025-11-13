package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
@WebService(name = "CalculatriceWS", targetNamespace = "http://service.tp.umontpellier.fr/")
public interface ICalculatrice {

    @WebMethod(operationName = "additionner")
    double somme(
            @WebParam(name = "valeur1") double a,
            @WebParam(name = "valeur2") double b);

    @WebMethod(operationName = "soustraire")
    double soustraction(
            @WebParam(name = "valeur1") double a,
            @WebParam(name = "valeur2") double b);

    @WebMethod(operationName = "multiplier")
    double multiplication(
            @WebParam(name = "valeur1") double a,
            @WebParam(name = "valeur2") double b);

    @WebMethod(operationName = "diviser")
    double division(
            @WebParam(name = "dividende") double a,
            @WebParam(name = "diviseur") double b);
}