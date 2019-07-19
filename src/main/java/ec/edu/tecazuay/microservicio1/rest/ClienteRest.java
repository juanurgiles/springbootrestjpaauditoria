/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.tecazuay.microservicio1.rest;

import ec.edu.tecazuay.microservicio1.modelo.Cliente;
import ec.edu.tecazuay.microservicio1.repositorio.ClienteRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("/cliente")
public class ClienteRest {
    @Autowired
    ClienteRepositorio repositorio;
    @GetMapping("/")
    @ResponseBody
    public List<Cliente> listar(){
     return this.repositorio.findAll();
    }
    @DeleteMapping("/{idCliente}")
    @ResponseBody
    public void borrar(@PathVariable Long idCliente){
         this.repositorio.deleteById(idCliente);
    }
    @GetMapping("/{idCliente}")
    @ResponseBody
    public Cliente guardar(@PathVariable Long idCliente){
        return this.repositorio.getOne(idCliente);
    }
    
}
