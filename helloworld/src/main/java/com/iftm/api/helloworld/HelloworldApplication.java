package com.iftm.api.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

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

	@GetMapping("aluno")
	public Aluno getAluno(){
		var aluno = new Aluno("Joao",12);
		var aluno2 = new Aluno();
		aluno2.setNome("Jose");
		aluno2.setAge(24);
		return new Aluno("Fabio",21);
	}
	@PostMapping("aluno")
	public Aluno saveAluno(@RequestBody Aluno aluno){
		Logger logger = Logger.getLogger(HelloworldApplication.class.getName());
		logger.info("Aluno recebido: \n"+aluno.toString());
		return aluno;
	}
	@GetMapping("alunos")
	public List<Aluno> getAlunos(){
		var listaDeAlunos = new ArrayList<Aluno>();
		listaDeAlunos.add(new Aluno("Braulio",21));
		listaDeAlunos.add(new Aluno("Rodrigo",30));
		listaDeAlunos.add(new Aluno("Jose Pereira",81));
		listaDeAlunos.add(new Aluno("Maria Laura",27));
		return listaDeAlunos;

	}
}
