package com.example.RDMProject.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.RDMProject.model.Cliente;
import com.example.RDMProject.repository.ClienteRepository;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> getAll() {
        return clienteRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Cliente> getById(@PathVariable Integer id) {
        return clienteRepository.findById(id);
    }

    @PostMapping
    public Cliente create(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @PatchMapping("/{id}")
    public Cliente update(@PathVariable Integer id, @RequestBody Cliente data) {
        return clienteRepository.findById(id)
                .map(c -> {
                    if (data.getNombreCliente() != null) c.setNombreCliente(data.getNombreCliente());
                    if (data.getEmail() != null) c.setEmail(data.getEmail());
                    return clienteRepository.save(c);
                })
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        clienteRepository.deleteById(id);
    }
}
