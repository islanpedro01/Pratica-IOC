package br.edu.ifpb.pweb2.springioc.paragrafo;

public class GeradorParagrafoTexto implements GeradorParagrafoIntf{

    public void addParagrafo(String texto) {
        System.out.println("<p>" + texto + "</p>");
    }

}
