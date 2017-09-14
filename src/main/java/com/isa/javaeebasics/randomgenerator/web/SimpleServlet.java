package com.isa.javaeebasics.randomgenerator.web;

import com.isa.javaeebasics.randomgenerator.NumbersGenerator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/generator")
public class SimpleServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        NumbersGenerator numbers = new NumbersGenerator();
        resp.getWriter().print(numbers.getRandomInt(100));
    }
}
