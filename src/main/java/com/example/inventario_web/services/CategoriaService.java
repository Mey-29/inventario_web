package com.example.inventario_web.services;

import java.util.List;
import com.example.inventario_web.model.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.inventario_web.repository.CategoriaRepository;

@Service
public class CategoriaService {
  @Autowired
  private CategoriaRepository categoriaRepository;

  public List<Categoria> listarTodos() {
      return categoriaRepository.findAll();
  }
}
