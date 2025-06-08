package com.example.inventario_web.controller;

import com.example.inventario_web.model.Inventario;
import com.example.inventario_web.services.CategoriaService;
import com.example.inventario_web.services.InventarioService;
import com.example.inventario_web.services.ProductoService;
import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class InventarioController {
  
  @Autowired
  private InventarioService inventarioService;
  
  @Autowired
  private ProductoService productoService;

  @Autowired
  private CategoriaService categoriaService;

  @GetMapping("/")
  public String mostrarInventarios(Model model) {
      model.addAttribute("listaInventarios", inventarioService.listarTodos());
      return "ListadoValencia";
  }
  
  @GetMapping("/registrar")
  public String mostrarFormulario(Model model) {
    model.addAttribute("inventario", new Inventario());

    model.addAttribute("listaProductos", productoService.listarTodos());
    model.addAttribute("listaCategorias", categoriaService.listarTodos());

    return "RegistroValencia";
  }
  
  @PostMapping("/registrar")
  public String registrarInventario(@ModelAttribute("inventario") 
                                    Inventario inventario,
                                    RedirectAttributes redirectAttrs) {
    try {
        // Asignar fecha actual
        inventario.setFecha(LocalDate.now());

        inventarioService.registrar(inventario);
        redirectAttrs.addFlashAttribute("exito", "Inventario registrado correctamente.");
    } catch (Exception e) {
        redirectAttrs.addFlashAttribute("error", "Error al registrar inventario.");
    }
    return "redirect:/registrar";
  }
}
