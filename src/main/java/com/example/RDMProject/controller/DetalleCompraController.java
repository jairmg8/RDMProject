package com.example.RDMProject.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.RDMProject.model.DetalleCompra;
import com.example.RDMProject.repository.DetalleCompraRepository;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/detalle-compras")
public class DetalleCompraController {

    @Autowired
    private DetalleCompraRepository repo;

    @GetMapping
    public List<DetalleCompra> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<DetalleCompra> getById(@PathVariable Integer id) {
        return repo.findById(id);
    }

    @PostMapping
    public DetalleCompra create(@RequestBody DetalleCompra dc) {
        return repo.save(dc);
    }

    @PatchMapping("/{id}")
    public DetalleCompra update(@PathVariable Integer id, @RequestBody DetalleCompra data) {
        return repo.findById(id)
                .map(d -> {
                    if (data.getCantidad() != 0) d.setCantidad(data.getCantidad());
                    if (data.getSubtotal() != 0) d.setSubtotal(data.getSubtotal());
                    return repo.save(d);
                })
                .orElseThrow(() -> new RuntimeException("DetalleCompra no encontrado"));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        repo.deleteById(id);
    }
}