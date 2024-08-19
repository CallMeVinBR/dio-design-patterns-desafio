package dio.desafio_design_patterns;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@Scope("singleton")
@ConfigurationProperties(prefix = "default")
public class PessoaSingleton {
    // Por padrão: nome=Vinicius, idade=19
    @Value("${nome}")
    private String nome;
    @Value("${idade}")
    private int idade;

    public PessoaSingleton(){
        System.out.println(getInstance());
    }

    @Bean(name = "pessoaSingleton")
    public static PessoaSingleton getInstance() {
        // Instancia unica criada pelo Spring
        return new PessoaSingleton();
    }
}
