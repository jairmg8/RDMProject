package com.example.RDMProject.repository;
import com.example.RDMProject.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductoRepository extends JpaRepository<Producto,Integer> {
}
