package app.instrutor;

import javax.annotation.processing.Generated;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
@Table(name = "instrutores")
@Getter
@Setter
@NoArgsConstructor
public class Instrutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String Formacao;

    public Instrutor(InstrutorInsertDTO dados) {
        this.setNome(dados.nome());
        this.setFormacao(dados.formacao());
    }

    public Instrutor(InstrutorDTO dados) {
        this.setId(dados.id());
        this.setNome(dados.nome());
        this.setFormacao(dados.formacao());
    }
}