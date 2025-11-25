package com.example.RDMProject.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.RDMProject.model.Venta;
import com.example.RDMProject.repository.VentaRepository;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/ventas")
public class VentaRestController {

    @Autowired
    private VentaRepository repo;

    @GetMapping
    public List<Venta> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Venta> getById(@PathVariable Integer id) {
        return repo.findById(id);
    }

    @PostMapping
    public Venta create(@RequestBody Venta venta) {
        return repo.save(venta);
    }

    @PatchMapping("/{id}")
    public Venta update(@PathVariable Integer id, @RequestBody Venta data) {
        return repo.findById(id)
                .map(v -> {
                    if (data.getObservaciones() != null) v.setObservaciones(data.getObservaciones());
                    if (data.getTotal() != 0) v.setTotal(data.getTotal());
                    return repo.save(v);
                })
                .orElseThrow(() -> new RuntimeException("Venta no encontrada"));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        repo.deleteById(id);
    }
}