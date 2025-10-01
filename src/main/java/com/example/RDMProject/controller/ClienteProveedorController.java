package com.example.RDMProject.controller;

import com.example.RDMProject.model.Clientes;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/ClienteProveedor")
//listar todos
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
        clientes.add(new Clientes(2,
                2,
                1098765433,
                "UN CHAMITO",
                "PIURA",
                01,
                "CHAMO",
                "M",
                999333990,
                "CHAMITO@gmail.com",
                "-",
                1));
        clientes.add(new Clientes(3,
                1,
                72448836,
                "JUAN PEREZ",
                "PAITA - PIURA",
                01,
                "JUANITO",
                "M",
                999333990,
                "juanito@gmail.com",
                "-",
                1));
    }

    @GetMapping
    public List<Clientes>ObtenerClientes(){ return  clientes; }

    //listar por id
    @GetMapping("/{id}")
    public Clientes getClientes(@PathVariable int id){
        return clientes.stream().filter( c->c.getIdCliente()==id).findFirst().orElse( null);
    }

    //creacion de metodos post // create
    @PostMapping
    public Clientes postCliente(@RequestBody Clientes nuevo){
        clientes.add(nuevo);
        return nuevo;
    }

    //creacion de metodo PUT //update
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

    // metodo delete

    @DeleteMapping("/{id}")
    public String deleteCliente(@PathVariable int id){
        for(Clientes c: clientes){
            if(c.getIdCliente()==id)
                clientes.remove(c); //eliminar el objeto
            return "Cliente con id : " + id + " eliminado correctamente";
        }
        return null;
    }

    //path hace cambios de solo unos campos no es necesario pasar todo
    @PatchMapping
    public Clientes patchCliente(@RequestBody Clientes cliente){
        for(Clientes c: clientes){
           if(c.getIdCliente() == cliente.getIdCliente()){
               if(cliente.getNombreCliente() != null)
                   c.setNombreCliente(cliente.getNombreCliente());
               if(cliente.getDireccion() != null)
                   c.setDireccion(cliente.getDireccion());
               return c; //retornar el objeto
           }
        }
        return null;
    }
}
