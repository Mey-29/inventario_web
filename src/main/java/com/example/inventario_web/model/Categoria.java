package com.example.inventario_web.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "categoria")
public class Categoria {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer idCate;

  @Column(nullable = false, length = 100)
  private String descripcion;

  @Column(nullable = false)
  private String frecuenciaCompra;
}
