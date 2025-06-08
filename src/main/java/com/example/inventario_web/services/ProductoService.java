package com.example.inventario_web.services;

import java.util.List;
import com.example.inventario_web.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.inventario_web.repository.ProductoRepository;

@Service
public class ProductoService {
  @Autowired
  private ProductoRepository productoRepository;

  public List<Producto> listarTodos() {
      return productoRepository.findAll();
  }
}
