package br.com.militao.springtestecloudrun.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @GetMapping
    ResponseEntity<List<String>> listAll(){

        return ResponseEntity.ok(List.of("Gol", "Honda", "Vectra"));
    }
}
