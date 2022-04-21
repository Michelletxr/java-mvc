package br.com.api.crud.repository;

import br.com.api.crud.modelo.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {

    Curso findByNome(String cursoNome);

}
