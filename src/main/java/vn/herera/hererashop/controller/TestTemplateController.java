package vn.herera.hererashop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class TestTemplateController {
    @RequestMapping("/admin")
    public String homrAdmin(){
//        return"/admin/index";
        return "/fragments/main_layout_admin";
    }
    @RequestMapping(value = {"/","/index"})
    public String home(){
        return"/home/index";
    }
    @RequestMapping(value = {"/product"})
    public String allProducts(){
        return"/home/products";
    }
    @RequestMapping(value = {"/productdetail"})
    public String ProductDetail(){
        return"/home/product-detail";
    }
    @RequestMapping(value = {"/shopingcart"})
    public String shopingCart(){
        return"/home/shoping-cart";
    }
    @RequestMapping(value = {"/about"})
    public String about(){
        return"/home/about";
    }
    @RequestMapping(value = {"/contact"})
    public String contact(){
        return"/home/contact";
    }
}
