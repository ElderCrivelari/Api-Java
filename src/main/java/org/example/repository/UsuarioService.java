package org.example.repository;

import org.example.model.UsuarioModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final IUsuarioRepository _usuarioRepository;

    @Autowired
    public UsuarioService(IUsuarioRepository usuarioRepository){
        _usuarioRepository = usuarioRepository;
    }

    public UsuarioModel Criar(UsuarioModel usuario){
        return  _usuarioRepository.save(usuario);
    }

    public List<UsuarioModel> BuscaTodos(){
        return _usuarioRepository.findAll();
    }

    public UsuarioModel BuscaPorEmail(String email){
        return _usuarioRepository.findByEmail(email);
    }
}
