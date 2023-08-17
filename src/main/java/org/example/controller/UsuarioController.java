package org.example.controller;

import org.example.model.UsuarioModel;
import org.example.repository.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/users")
public class UsuarioController {
    private final UsuarioService _usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService){
        _usuarioService = usuarioService;
    }

    @PostMapping("/add")
    public UsuarioModel Criar(@RequestBody UsuarioModel usuario){
        return _usuarioService.Criar(usuario);
    }

    @GetMapping("/email")
    public UsuarioModel BuscarPorEmail(@RequestParam String email){
        return _usuarioService.BuscaPorEmail(email);
    }

    @GetMapping("/all")
    public List<UsuarioModel> BuscarTodos(){
        return _usuarioService.BuscaTodos();
    }


}
