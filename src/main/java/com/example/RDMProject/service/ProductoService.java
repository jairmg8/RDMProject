package com.example.RDMProject.service;
import com.example.RDMProject.model.Producto;
import java.util.List;
import java.util.Optional;
public interface ProductoService {
    List<Producto> findAll();
    Optional<Producto> findById(Long id);
    Producto save(Producto producto);
    void deleteById(Long id);
}
