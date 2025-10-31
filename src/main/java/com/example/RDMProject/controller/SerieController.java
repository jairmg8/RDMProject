package com.example.RDMProject.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.RDMProject.model.SerieFactura;
import com.example.RDMProject.repository.SerieFacturaRepository;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/series-factura")
public class SerieController {
    @Autowired
    private SerieFacturaRepository repo;

    @GetMapping
    public List<SerieFactura> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<SerieFactura> getById(@PathVariable Integer id) {
        return repo.findById(id);
    }

    @PostMapping
    public SerieFactura create(@RequestBody SerieFactura sf) {
        return repo.save(sf);
    }

    @PatchMapping("/{id}")
    public SerieFactura update(@PathVariable Integer id, @RequestBody SerieFactura data) {
        return repo.findById(id)
                .map(s -> {
                    if (data.getSerie() != null) s.setSerie(data.getSerie());
                    if (data.getEstado() != 0) s.setEstado(data.getEstado());
                    return repo.save(s);
                })
                .orElseThrow(() -> new RuntimeException("SerieFactura no encontrada"));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        repo.deleteById(id);
    }
}
