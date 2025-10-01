package com.example.RDMProject.controller;

import com.example.RDMProject.model.Clientes;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/ClienteProveedor")
@RestController
public class ClienteProveedorController {
    private List<Clientes> clientes = new ArrayList<>();
    public ClienteProveedorController(){
        clientes.add(new Clientes(1,
                1,
                72447836,
                "JEXSON JAIR MACALUPU GUZMAN",
                "PAITA",
                01,
                "JAIR MACALUPU",
                "M",
                999333990,
                "jairmg3@gmail.com",
                "-",
                1));
    }

    @GetMapping
    public List<Clientes>ObtenerClientes(){ return  clientes; }

    @GetMapping("/{id}")
    public Clientes getClientes(@PathVariable int id){
        return clientes.stream().filter( c->c.getIdCliente()==id).findFirst().orElse( null);
    }

    //creacion de metodos post
    @PostMapping
    public Clientes postCliente(@RequestBody Clientes nuevo){
        clientes.add(nuevo);
        return nuevo;
    }

    //creacion de metodo PUT
    @PutMapping
    public Clientes putCliente(@RequestBody Clientes cliente){
        for(Clientes c:clientes){
            if(c.getIdCliente() == cliente.getIdCliente()){
                c.setTipoDocumento(cliente.getTipoDocumento());
                c.setNroDocumento(cliente.getNroDocumento());
                c.setNombreCliente(cliente.getNombreCliente());
                c.setDireccion(cliente.getDireccion());
                c.setTipoClienteProvedoor(cliente.getTipoClienteProvedoor());
                c.setAlias(cliente.getAlias());
                c.setGenero(cliente.getGenero());
                c.setNumerocelular(cliente.getNumerocelular());
                c.setEmail(cliente.getEmail());
                c.setDatosAdicionales(cliente.getDatosAdicionales());
                c.setEstado(cliente.getEstado());
            }
            return c;
        }
        return null;
    }
}
