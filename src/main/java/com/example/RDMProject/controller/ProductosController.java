package com.example.RDMProject.controller;

import com.example.RDMProject.model.Productos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping({"/Productos"})
@RestController
public class ProductosController {
    private List<Productos> productos = new ArrayList();

    public ProductosController() {
        // Producto de ejemplo
        this.productos.add(new Productos(
                1,
                "Jarabe",
                10001,
                2500.00,
                18.00,
                "UND",
                1,
                null,
                2000.00,
                2.5,
                "jarabe",
                5,
                10,
                0.0,
                "43211503",
                1
        ));
    }

    @GetMapping
    public List<Productos> obtenerProductos() {
        return this.productos;
    }

    @GetMapping({"/{id}"})
    public Productos getProducto(@PathVariable int id) {
        return (Productos)this.productos.stream()
                .filter((p) -> p.getIdProducto() == id)
                .findFirst()
                .orElse((Productos) null);
    }

    @PostMapping
    public Productos postProducto(@RequestBody Productos nuevo) {
        this.productos.add(nuevo);
        return nuevo;
    }

    @PutMapping({"/{id}"})
    public ResponseEntity<Productos> putProducto(@PathVariable int id, @RequestBody Productos producto) {
        Iterator var3 = this.productos.iterator();

        while(var3.hasNext()) {
            Productos p = (Productos)var3.next();
            if (p.getIdProducto() == id) {
                p.setNombre(producto.getNombre());
                p.setCodigo(producto.getCodigo());
                p.setPrecioVenta(producto.getPrecioVenta());
                p.setIgv(producto.getIgv());
                p.setIdUnidadMedida(producto.getIdUnidadMedida());
                p.setIdCategoria(producto.getIdCategoria());
                p.setImagen(producto.getImagen());
                p.setPrecioInicialCompra(producto.getPrecioInicialCompra());
                p.setPesoBruto(producto.getPesoBruto());
                p.setAlias(producto.getAlias());
                p.setStockMin(producto.getStockMin());
                p.setStockIni(producto.getStockIni());
                p.setDescuento(producto.getDescuento());
                p.setCodigoSunat(producto.getCodigoSunat());
                p.setEstado(producto.getEstado());
                return ResponseEntity.ok(p);
            }
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @DeleteMapping({"/{id}"})
    public ResponseEntity<Void> deleteProducto(@PathVariable int id) {
        boolean eliminado = this.productos.removeIf((p) -> p.getIdProducto() == id);

        if (eliminado) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PatchMapping({"/{id}"})
    public ResponseEntity<Productos> patchProducto(@PathVariable int id, @RequestBody Productos productoParcial) {
        Iterator var3 = this.productos.iterator();

        while(var3.hasNext()) {
            Productos p = (Productos)var3.next();
            if (p.getIdProducto() == id) {
                // Solo actualiza los campos que no son valores por defecto
                if (productoParcial.getNombre() != null) {
                    p.setNombre(productoParcial.getNombre());
                }
                if (productoParcial.getCodigo() != 0) {
                    p.setCodigo(productoParcial.getCodigo());
                }
                if (productoParcial.getPrecioVenta() != 0.0) {
                    p.setPrecioVenta(productoParcial.getPrecioVenta());
                }
                if (productoParcial.getIgv() != 0.0) {
                    p.setIgv(productoParcial.getIgv());
                }
                if (productoParcial.getIdUnidadMedida() != null) {
                    p.setIdUnidadMedida(productoParcial.getIdUnidadMedida());
                }
                if (productoParcial.getIdCategoria() != 0) {
                    p.setIdCategoria(productoParcial.getIdCategoria());
                }
                if (productoParcial.getImagen() != null) {
                    p.setImagen(productoParcial.getImagen());
                }
                if (productoParcial.getPrecioInicialCompra() != 0.0) {
                    p.setPrecioInicialCompra(productoParcial.getPrecioInicialCompra());
                }
                if (productoParcial.getPesoBruto() != 0.0) {
                    p.setPesoBruto(productoParcial.getPesoBruto());
                }
                if (productoParcial.getAlias() != null) {
                    p.setAlias(productoParcial.getAlias());
                }
                if (productoParcial.getStockMin() != 0) {
                    p.setStockMin(productoParcial.getStockMin());
                }
                if (productoParcial.getStockIni() != 0) {
                    p.setStockIni(productoParcial.getStockIni());
                }
                if (productoParcial.getDescuento() != 0.0) {
                    p.setDescuento(productoParcial.getDescuento());
                }
                if (productoParcial.getCodigoSunat() != null) {
                    p.setCodigoSunat(productoParcial.getCodigoSunat());
                }
                if (productoParcial.getEstado() != 0) {
                    p.setEstado(productoParcial.getEstado());
                }

                return ResponseEntity.ok(p);
            }
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}