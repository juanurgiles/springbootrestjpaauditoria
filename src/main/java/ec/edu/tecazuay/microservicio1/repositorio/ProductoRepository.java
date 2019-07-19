/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.tecazuay.microservicio1.repositorio;

import ec.edu.tecazuay.microservicio1.modelo.Cliente;
import ec.edu.tecazuay.microservicio1.modelo.Pedido;
import ec.edu.tecazuay.microservicio1.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author casa
 */
public interface ProductoRepository extends JpaRepository<Producto, Long>{
    
}
