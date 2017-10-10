package com.infoshareacademy.messageboard.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/form")
public class FormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");

        PrintWriter writer = resp.getWriter();

        writer.println("Selected name: " + name);

        String fruit = req.getParameter("fruit");
        writer.println("Selected fruit: " + fruit);

        String whatever = req.getParameter("whatever");
        writer.println("Is checkbox selected? " + (whatever != null));

        String[] sports = req.getParameterValues("sport");
        writer.println("Selected sports: " + String.join(",", sports));
    }
}
