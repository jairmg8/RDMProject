package com.example.RDMProject.controller;

import com.example.RDMProject.model.Compras;
import java.util.ArrayList;
import java.util.Date;
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

@RequestMapping({"/Compras"})
@RestController
public class ComprasController {
    private List<Compras> compras = new ArrayList();

    public ComprasController() {
        // Compra de ejemplo
        this.compras.add(new Compras(
                1,
                1,
                1,
                1,
                "F001",
                12345,
                new Date(),
                new Date(),
                "Compra de prueba",
                1000.00,
                50.00,
                171.00,
                1121.00
        ));
    }

    @GetMapping
    public List<Compras> obtenerCompras() {
        return this.compras;
    }

    @GetMapping({"/{id}"})
    public Compras getCompra(@PathVariable int id) {
        return (Compras)this.compras.stream()
                .filter((c) -> c.getIdCompra() == id)
                .findFirst()
                .orElse((Compras) null);
    }

    @PostMapping
    public Compras postCompra(@RequestBody Compras nueva) {
        this.compras.add(nueva);
        return nueva;
    }

    @PutMapping({"/{id}"})
    public ResponseEntity<Compras> putCompra(@PathVariable int id, @RequestBody Compras compra) {
        Iterator var3 = this.compras.iterator();

        while(var3.hasNext()) {
            Compras c = (Compras)var3.next();
            if (c.getIdCompra() == id) {
                c.setIdUsuario(compra.getIdUsuario());
                c.setIdProveedor(compra.getIdProveedor());
                c.setIdTipoComprobante(compra.getIdTipoComprobante());
                c.setSerieComprobante(compra.getSerieComprobante());
                c.setNroComprobante(compra.getNroComprobante());
                c.setFecha_compra(compra.getFecha_compra());
                c.setFecha_emision(compra.getFecha_emision());
                c.setObservaciones(compra.getObservaciones());
                c.setSubtotal(compra.getSubtotal());
                c.setDescuento(compra.getDescuento());
                c.setIgv(compra.getIgv());
                c.setTotal(compra.getTotal());
                return ResponseEntity.ok(c);
            }
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @DeleteMapping({"/{id}"})
    public ResponseEntity<Void> deleteCompra(@PathVariable int id) {
        boolean eliminado = this.compras.removeIf((c) -> c.getIdCompra() == id);

        if (eliminado) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PatchMapping({"/{id}"})
    public ResponseEntity<Compras> patchCompra(@PathVariable int id, @RequestBody Compras compraParcial) {
        Iterator var3 = this.compras.iterator();

        while(var3.hasNext()) {
            Compras c = (Compras)var3.next();
            if (c.getIdCompra() == id) {
                // Solo actualiza los campos que no son valores por defecto
                if (compraParcial.getIdUsuario() != 0) {
                    c.setIdUsuario(compraParcial.getIdUsuario());
                }
                if (compraParcial.getIdProveedor() != 0) {
                    c.setIdProveedor(compraParcial.getIdProveedor());
                }
                if (compraParcial.getIdTipoComprobante() != 0) {
                    c.setIdTipoComprobante(compraParcial.getIdTipoComprobante());
                }
                if (compraParcial.getSerieComprobante() != null) {
                    c.setSerieComprobante(compraParcial.getSerieComprobante());
                }
                if (compraParcial.getNroComprobante() != 0) {
                    c.setNroComprobante(compraParcial.getNroComprobante());
                }
                if (compraParcial.getFecha_compra() != null) {
                    c.setFecha_compra(compraParcial.getFecha_compra());
                }
                if (compraParcial.getFecha_emision() != null) {
                    c.setFecha_emision(compraParcial.getFecha_emision());
                }
                if (compraParcial.getObservaciones() != null) {
                    c.setObservaciones(compraParcial.getObservaciones());
                }
                if (compraParcial.getSubtotal() != 0.0) {
                    c.setSubtotal(compraParcial.getSubtotal());
                }
                if (compraParcial.getDescuento() != 0.0) {
                    c.setDescuento(compraParcial.getDescuento());
                }
                if (compraParcial.getIgv() != 0.0) {
                    c.setIgv(compraParcial.getIgv());
                }
                if (compraParcial.getTotal() != 0.0) {
                    c.setTotal(compraParcial.getTotal());
                }

                return ResponseEntity.ok(c);
            }
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}