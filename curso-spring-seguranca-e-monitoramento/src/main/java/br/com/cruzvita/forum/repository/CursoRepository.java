package br.com.cruzvita.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cruzvita.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);

}
