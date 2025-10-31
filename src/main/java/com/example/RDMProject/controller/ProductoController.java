package com.example.RDMProject.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.RDMProject.model.Producto;
import com.example.RDMProject.repository.ProductoRepository;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoRepository productoRepository;

    @GetMapping
    public List<Producto> getAll() {
        return productoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Producto> getById(@PathVariable Integer id) {
        return productoRepository.findById(id);
    }

    @PostMapping
    public Producto create(@RequestBody Producto producto) {
        return productoRepository.save(producto);
    }

    @PatchMapping("/{id}")
    public Producto update(@PathVariable Integer id, @RequestBody Producto data) {
        return productoRepository.findById(id)
                .map(p -> {
                    if (data.getNombre() != null) p.setNombre(data.getNombre());
                    if (data.getPrecioVenta() != 0) p.setPrecioVenta(data.getPrecioVenta());
                    if (data.getStockIni() != 0) p.setStockIni(data.getStockIni());
                    return productoRepository.save(p);
                })
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        productoRepository.deleteById(id);
    }
}
