package br.edu.ifpb.pweb2.springioc.app;

import br.edu.ifpb.pweb2.springioc.configuration.DocumentGeneratorConf;
import br.edu.ifpb.pweb2.springioc.gerador.GeradorDocumentoIntf;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GeradorTextoApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DocumentGeneratorConf.class);
        GeradorDocumentoIntf gerador = context.getBean("geradorRelatorio",GeradorDocumentoIntf.class);

        gerador.addTexto("As fronteiras da minha linguagem são as fronteiras do meu mundo.");
        gerador.addTexto("Sobre o que não se pode falar, deve-se calar.");
        gerador.addTexto("-- Ludwig Wittgenstein");

        context.close();
    }


}
