package br.com.api.crud.controller;

import br.com.api.crud.controller.dto.TopicosDto;
import br.com.api.crud.modelo.Curso;
import br.com.api.crud.modelo.Topico;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class TopicosController {
    @ResponseBody
    @RequestMapping("/topicos")
    public String lista(){
        Topico topico = new Topico("teste", "teste", new Curso("spring", "programação"));
        TopicosDto topicoDTO = new TopicosDto(topico);
       // return Arrays.asList(topicoDTO, topicoDTO, topicoDTO);
        return "topicos";
    }
}
