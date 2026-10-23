package br.gov.sp.etec.apiCadastroLivro.service

import br.gov.sp.etec.apiCadastroLivro.entity.Livro
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service


@Service //informa ao Spring que essa classe faz parte da camada de serviços da aplicação.

class BibliotecaService {

    //Recebe um objeto Livro e retorna o mesmo objeto
    fun cadastrar(livro: Livro): Livro {
        return livro
    }
}