package com.example.inventario_web.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.Data;

@Entity
@Data
@Table(name = "inventario")
public class Inventario {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer nroInventario;

  @Column(columnDefinition = "DATE DEFAULT CURRENT_DATE")
  private LocalDate fecha;

  @ManyToOne
  @JoinColumn(name = "id_prod", nullable = false)
  private Producto producto;

  @Column(name = "costo_ingreso", nullable = false)
  private Double costoIngreso;
}
