package br.com.brokenbrain.BB.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.brokenbrain.BB.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
