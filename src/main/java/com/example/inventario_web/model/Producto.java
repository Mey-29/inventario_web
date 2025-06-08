package com.example.inventario_web.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "productos")
public class Producto {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer idProd;

  @Column(nullable = false, length = 100)
  private String nomProd;

  @ManyToOne
  @JoinColumn(name = "id_cate", nullable = false)
  private Categoria categoria;

  @Column(nullable = false)
  private Integer stockActual;
}
