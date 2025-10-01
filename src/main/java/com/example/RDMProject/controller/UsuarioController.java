package com.example.RDMProject.controller;

import com.example.RDMProject.model.Usuario;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping({"/Usuario"})
@RestController
public class UsuarioController {
    private List<Usuario> usuarios = new ArrayList();

    public UsuarioController() {
        // Usuario de ejemplo
        this.usuarios.add(new Usuario(
                1,
                "admin",
                "12345",
                "Administrador Sistema",
                "admin@sistema.com",
                1,
                1
        ));
    }

    @GetMapping
    public List<Usuario> obtenerUsuarios() {
        return this.usuarios;
    }

    @GetMapping({"/{id}"})
    public Usuario getUsuario(@PathVariable int id) {
        return (Usuario)this.usuarios.stream()
                .filter((u) -> u.getIdusuario() == id)
                .findFirst()
                .orElse((Usuario) null);
    }

    @PostMapping
    public Usuario postUsuario(@RequestBody Usuario nuevo) {
        this.usuarios.add(nuevo);
        return nuevo;
    }

    @PutMapping({"/{id}"})
    public ResponseEntity<Usuario> putUsuario(@PathVariable int id, @RequestBody Usuario usuario) {
        Iterator var3 = this.usuarios.iterator();

        while(var3.hasNext()) {
            Usuario u = (Usuario)var3.next();
            if (u.getIdusuario() == id) {
                u.setUsuario(usuario.getUsuario());
                u.setContrasenia(usuario.getContrasenia());
                u.setNombreCompleto(usuario.getNombreCompleto());
                u.setEmail(usuario.getEmail());
                u.setRol(usuario.getRol());
                u.setEstado(usuario.getEstado());
                return ResponseEntity.ok(u);
            }
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @DeleteMapping({"/{id}"})
    public ResponseEntity<Void> deleteUsuario(@PathVariable int id) {
        boolean eliminado = this.usuarios.removeIf((u) -> u.getIdusuario() == id);

        if (eliminado) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PatchMapping({"/{id}"})
    public ResponseEntity<Usuario> patchUsuario(@PathVariable int id, @RequestBody Usuario usuarioParcial) {
        Iterator var3 = this.usuarios.iterator();

        while(var3.hasNext()) {
            Usuario u = (Usuario)var3.next();
            if (u.getIdusuario() == id) {
                // Solo actualiza los campos que no son valores por defecto
                if (usuarioParcial.getUsuario() != null) {
                    u.setUsuario(usuarioParcial.getUsuario());
                }
                if (usuarioParcial.getContrasenia() != null) {
                    u.setContrasenia(usuarioParcial.getContrasenia());
                }
                if (usuarioParcial.getNombreCompleto() != null) {
                    u.setNombreCompleto(usuarioParcial.getNombreCompleto());
                }
                if (usuarioParcial.getEmail() != null) {
                    u.setEmail(usuarioParcial.getEmail());
                }
                if (usuarioParcial.getRol() != 0) {
                    u.setRol(usuarioParcial.getRol());
                }
                if (usuarioParcial.getEstado() != 0) {
                    u.setEstado(usuarioParcial.getEstado());
                }

                return ResponseEntity.ok(u);
            }
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}