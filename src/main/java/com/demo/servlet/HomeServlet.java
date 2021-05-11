package com.demo.servlet;

import com.demo.dao.ProductDao;
import com.demo.entity.ProductEntity;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(name = "HomeServlet")
public class HomeServlet extends javax.servlet.http.HttpServlet {

    ProductDao dao = new ProductDao();
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        insertProduct();
        request.getRequestDispatcher("addphone.jsp").forward(request, response);
    }

    private void insertProduct(){
        ProductEntity p =new ProductEntity(3, "Iphone7", 10000, "blabla", "Iphone");
        dao.insertProduct(p);
    }
}
