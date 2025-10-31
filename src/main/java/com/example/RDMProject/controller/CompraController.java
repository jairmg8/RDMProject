package com.example.RDMProject.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.RDMProject.model.Compra;
import com.example.RDMProject.repository.CompraRepository;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/compras")
public class CompraController {

    @Autowired
    private CompraRepository repo;

    @GetMapping
    public List<Compra> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Compra> getById(@PathVariable Integer id) {
        return repo.findById(id);
    }

    @PostMapping
    public Compra create(@RequestBody Compra compra) {
        return repo.save(compra);
    }

    @PatchMapping("/{id}")
    public Compra update(@PathVariable Integer id, @RequestBody Compra data) {
        return repo.findById(id)
                .map(c -> {
                    if (data.getObservaciones() != null) c.setObservaciones(data.getObservaciones());
                    if (data.getTotal() != 0) c.setTotal(data.getTotal());
                    return repo.save(c);
                })
                .orElseThrow(() -> new RuntimeException("Compra no encontrada"));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        repo.deleteById(id);
    }
}