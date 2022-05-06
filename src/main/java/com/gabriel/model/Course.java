package com.gabriel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data // Realiza os getters e Setters
@Entity // Especificamos essa classe como uma entidade que fará mapeamento no banco de dados.

public class Course {

    //variáveis da lista de cursos. São as mesmas que estão no angular.

    @Id // Indica que é chave primária
    @GeneratedValue(strategy = GenerationType.AUTO) //  gera automaticamente o ID no banco de dados.
    private Long id;

    @Column(length = 200, nullable = false) // Indica que são outras colunas = Não são chave primária
    //Podemos indicar tamanho dos nomes e se poderão seu campos nulos ou não
    private String name;

    @Column(length = 10, nullable = false)
    private String category;


}
