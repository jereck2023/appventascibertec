package com.example.appventascibertec.controller.backoffice;

import com.example.appventascibertec.service.ICategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping ("/category") //Añadir recursos a nuestro URL
public class CategoryController {
    private ICategoryService iCategoryService;

    @GetMapping("/list")
    public String listarcategorias(Model model)
    {
        model.addAttribute("categorias",iCategoryService.listarcategorias());
        return "backoffice/category/frmcategory";
    }
}
