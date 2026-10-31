package com.todocodeacademy.Ferreteria.service;

import com.todocodeacademy.Ferreteria.model.Producto;
import java.util.List;

public interface IProductoService {

    //Métodos para el CRUD

    //READ
    List<Producto> traerProductos();
    //READ UN PRODUCTO ESPECIFICO
    Producto buscarProducto (Long codProd);

    //CREATE
    Producto crearProducto (Producto prod);

    //UPDATE
    Producto editarProducto(Long codProd, Producto prod);

    //DELETE
    boolean eliminarProducto(Long codProd);

}
