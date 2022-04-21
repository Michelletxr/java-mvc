package br.com.api.crud.controller;

import br.com.api.crud.controller.dto.TopicosDto;
import br.com.api.crud.controller.form.TopicosForm;
import br.com.api.crud.modelo.Curso;
import br.com.api.crud.modelo.Topico;
import br.com.api.crud.repository.CursoRepository;
import br.com.api.crud.repository.TopicosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicosController {

    @Autowired
    private TopicosRepository topicosRepository;
    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping
    public List<Topico> lista(String nomeCurso){
        List<Topico> topicos;
        if(nomeCurso == null){
            //filtrar todos os topicos
            topicos = topicosRepository.findAll();
        }else{
            //filtrar topico pelo nome do curso
            topicos = topicosRepository.findByCursoNome(nomeCurso);
        }
        //TopicosDto topicoDTO = new TopicosDto(topicos);

       return topicos;

    }

    public void cadastrar(@RequestBody TopicosForm topicoForm){
        Topico topico = topicoForm.converter(cursoRepository);
        topicosRepository.save(topico);
    }
}
