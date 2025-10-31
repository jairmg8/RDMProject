package com.example.RDMProject.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.RDMProject.model.DetalleVenta;
import com.example.RDMProject.repository.DetalleVentaRepository;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/detalle-ventas")
public class DetalleVentaController {

    @Autowired
    private DetalleVentaRepository repo;

    @GetMapping
    public List<DetalleVenta> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<DetalleVenta> getById(@PathVariable Integer id) {
        return repo.findById(id);
    }

    @PostMapping
    public DetalleVenta create(@RequestBody DetalleVenta dv) {
        return repo.save(dv);
    }

    @PatchMapping("/{id}")
    public DetalleVenta update(@PathVariable Integer id, @RequestBody DetalleVenta data) {
        return repo.findById(id)
                .map(d -> {
                    if (data.getCantidad() != 0) d.setCantidad(data.getCantidad());
                    if (data.getSubtotal() != 0) d.setSubtotal(data.getSubtotal());
                    return repo.save(d);
                })
                .orElseThrow(() -> new RuntimeException("DetalleVenta no encontrado"));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        repo.deleteById(id);
    }
}