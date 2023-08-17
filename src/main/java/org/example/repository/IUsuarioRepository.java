package org.example.repository;

import org.example.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository  extends JpaRepository<UsuarioModel,Long> {

    UsuarioModel findByEmail(String email);
}
