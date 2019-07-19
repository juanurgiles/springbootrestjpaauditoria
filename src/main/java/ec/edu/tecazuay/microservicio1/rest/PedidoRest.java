/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.tecazuay.microservicio1.rest;

import ec.edu.tecazuay.microservicio1.modelo.Cliente;
import ec.edu.tecazuay.microservicio1.modelo.Pedido;
import ec.edu.tecazuay.microservicio1.repositorio.ClienteRepositorio;
import ec.edu.tecazuay.microservicio1.repositorio.PedidoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author casa
 */
@RestController
@RequestMapping("/pedido")
public class PedidoRest {
    @Autowired
    PedidoRepository repositorio;
    @GetMapping("/")
    @ResponseBody
    public List<Pedido> listar(){
     return this.repositorio.findAll();
    }
    @PostMapping("/")
    @ResponseBody
    public Pedido guardar(@RequestBody Pedido pedido){
        return this.repositorio.save(pedido);
    }
}
