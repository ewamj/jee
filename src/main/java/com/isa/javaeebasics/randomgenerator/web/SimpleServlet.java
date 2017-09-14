package com.isa.javaeebasics.randomgenerator.web;

import com.isa.javaeebasics.randomgenerator.NumbersGenerator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/generator")
public class SimpleServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        NumbersGenerator numbers = new NumbersGenerator();

        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter writer = resp.getWriter();

        writer.println("<!DOCTYPE html>");
        writer.println("<html>");
        writer.println("<body text=\"green\">");
        writer.println("Random number: "+numbers.getRandomInt(100));
        writer.println("</body>");
        writer.println("</html>");
    }
}
