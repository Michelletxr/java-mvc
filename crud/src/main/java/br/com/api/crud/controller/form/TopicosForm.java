package br.com.api.crud.controller.form;

import br.com.api.crud.modelo.Curso;
import br.com.api.crud.modelo.Topico;
import br.com.api.crud.repository.CursoRepository;

public class TopicosForm {

    private String titulo;
    private String mensagem;
    private String nomeCurso;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Topico converter(CursoRepository cursoRepository){
        Curso curso = cursoRepository.findByNome(nomeCurso);
        Topico topicoConvertido = new Topico(titulo, mensagem, curso);
        return topicoConvertido;

    }
}
