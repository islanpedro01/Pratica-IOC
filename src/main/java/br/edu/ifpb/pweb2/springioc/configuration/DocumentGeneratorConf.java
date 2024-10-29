package br.edu.ifpb.pweb2.springioc.configuration;

import br.edu.ifpb.pweb2.springioc.gerador.GeradorDocumentoIntf;
import br.edu.ifpb.pweb2.springioc.gerador.GeradorRelatorio;
import br.edu.ifpb.pweb2.springioc.paragrafo.GeradorParagrafoIntf;
import br.edu.ifpb.pweb2.springioc.paragrafo.GeradorParagrafoTexto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("br.edu.ifpb.pweb2.springioc")
public class DocumentGeneratorConf {

    @Bean
    public GeradorParagrafoIntf geradorParagrafoTexto(){
        return new GeradorParagrafoTexto();
    }

    @Bean
    public GeradorDocumentoIntf geradorRelatorio(){
        return new GeradorRelatorio();

    }

}