package com.example.RDMProject.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.RDMProject.model.Usuario;
import com.example.RDMProject.repository.UsuarioRepository;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/usuarios")
public class UsuarioRestController {

    @Autowired
    private UsuarioRepository repo;

    @GetMapping
    public List<Usuario> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Usuario> getById(@PathVariable Integer id) {
        return repo.findById(id);
    }

    @PostMapping
    public Usuario create(@RequestBody Usuario usuario) {
        return repo.save(usuario);
    }

    @PatchMapping("/{id}")
    public Usuario update(@PathVariable Integer id, @RequestBody Usuario data) {
        return repo.findById(id)
                .map(u -> {
                    if (data.getUsuario() != null) u.setUsuario(data.getUsuario());
                    if (data.getEmail() != null) u.setEmail(data.getEmail());
                    if (data.getNombreCompleto() != null) u.setNombreCompleto(data.getNombreCompleto());
                    return repo.save(u);
                })
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        repo.deleteById(id);
    }
}