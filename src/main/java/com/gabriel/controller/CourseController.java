package com.gabriel.controller;

import java.util.List;

import com.gabriel.model.Course;
import com.gabriel.repository.CourseRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController // Fala para o Spring que essa classe contém um end-point(uma URL que acessa a API)
//Por trás dos panos é um servlet, que tem métodos, POST, GET,DELETE e outros.

@RequestMapping("/api/courses") //Fala qual será o end-point - URL
@AllArgsConstructor // Realiza a injeção de dependência fazendo os construtores

public class CourseController {

    private final CourseRepository courseRepository;

    //Realiza a injeção de dependência com o construtor
    // pode ser realizado com Lonkbok utilizando o @AllArgsConstructor
    /*public CourseController(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }*/

    @GetMapping // Nosso servlet terá um método do GET. 
    //@RequestMapping(method = RequestMethod.GET) // é a mesma coisa que o de cima

    //Criando método!
    //Retorna uma lista
    public List<Course> list(){
        return courseRepository.findAll(); // Faz um SELECT * da tabela do banco de dados(Sem cláusulas WHERE)
    }
    
}
