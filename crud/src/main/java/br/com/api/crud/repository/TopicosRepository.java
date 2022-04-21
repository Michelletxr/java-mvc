package br.com.api.crud.repository;

import br.com.api.crud.modelo.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


/*
*  <T, ID>
    T= entidade
    ID= qual o tipo de id (int, long...)
*
* */
public interface TopicosRepository extends JpaRepository<Topico, Long> {
    List<Topico> findByCursoNome(String nomeCurso);
}
