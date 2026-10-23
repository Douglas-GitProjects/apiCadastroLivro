package br.gov.sp.etec.apiCadastroLivro.controller

import br.gov.sp.etec.apiCadastroLivro.entity.Livro
import br.gov.sp.etec.apiCadastroLivro.service.BibliotecaService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController // indica que a classe recebe requisições e produz respostas HTTP
@RequestMapping("/livros")  //Define o caminho principal

// o val service serve para utilizar o BibliotecaService dentro do Controller
class LivroController(val service: BibliotecaService) {

    @PostMapping
    fun cadastroLivro(@RequestBody livro: Livro): ResponseEntity<Livro> {

        return ResponseEntity
            .status(HttpStatus.CREATED) //retorna o status HTTP 201
            .body(service.cadastrar(livro))  //Chama o estilo de cadastro do Service
    }
}