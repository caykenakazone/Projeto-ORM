package com.iftm.api.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class HelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}
	// Get
	@GetMapping
	public String helloWorld(){
		return "Olá,Mundo!";
	}
	@GetMapping("/mars")
	public String HelloMars(){
		return "Olá, Marte!";
	}
	@GetMapping("/moon")
	public String HelloMoon(){
		return "Olá, Lua!";
	}
	@GetMapping("alunos")
	public List<Aluno> getAluno(){
		var listaDeAlunos = new ArrayList<Aluno>();
		listaDeAlunos.add(new Aluno("Braulio",21));
		listaDeAlunos.add(new Aluno("Rodrigo",30));
		listaDeAlunos.add(new Aluno("Jose Pereira",81));
		listaDeAlunos.add(new Aluno("Maria Laura",27));
		return listaDeAlunos;
	}
}
