package com.example.RDMProject.repository;
import com.example.RDMProject.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
}
