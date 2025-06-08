package com.example.inventario_web.repository;

import com.example.inventario_web.model.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventarioRepository extends JpaRepository<Inventario, Integer> {}
