package com.example.RDMProject.service.impl;
import com.example.RDMProject.model.Producto;
import com.example.RDMProject.repository.ProductoRepository;
import com.example.RDMProject.service.ProductoService;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class ProductoServiceImpl implements ProductoService {
    private final ProductoRepository productoRepository;

    public ProductoServiceImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Producto> findById(Long id) {
        return productoRepository.findById(Math.toIntExact(id));
    }

    @Override
    @Transactional
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        if (productoRepository.existsById(Math.toIntExact(id))) {
            productoRepository.deleteById(Math.toIntExact(id));
        } else {
            throw new RuntimeException("Producto no encontrado con id: " + id);
        }
    }
}
