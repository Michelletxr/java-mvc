package br.com.api.crud.controller.dto;

import br.com.api.crud.modelo.Curso;
import br.com.api.crud.modelo.Topico;
import java.util.List;
import java.util.stream.Collectors;

public class TopicosDto {
    private String titulo;
    private String mensagem;
    private Curso curso;

    public TopicosDto(Topico topico){

        this.titulo = topico.getTitulo();
        this.mensagem = topico.getMensagem();
        this.curso = topico.getCurso();


    }
    public String getTitulo(){
        return this.titulo;
    }

    public String getMensagem(){
        return this.mensagem;
    }

    public String getUsuario(){
        return this.getUsuario();
    }
    public static List<TopicosDto> converter(List<Topico> topicos){
        return topicos.stream().map(TopicosDto::new).collect(Collectors.toList());
    }
}
