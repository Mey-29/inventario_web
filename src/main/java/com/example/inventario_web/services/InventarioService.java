package com.example.inventario_web.services;

import java.util.List;
import com.example.inventario_web.model.Inventario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.inventario_web.repository.InventarioRepository;

@Service
public class InventarioService {
  @Autowired
  private InventarioRepository inventarioRepository;

  public List<Inventario> listarTodos() {
      return inventarioRepository.findAll();
  }

  public Inventario registrar(Inventario inventario) {
      return inventarioRepository.save(inventario);
  }
}
