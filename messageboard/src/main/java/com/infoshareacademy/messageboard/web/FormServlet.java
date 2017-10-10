package com.infoshareacademy.messageboard.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

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

    @Override
    public void destroy() {
        System.out.println("SERVLET DESTROYED: " + new Date());

        super.destroy();
    }

    @Override
    public void init() throws ServletException {
        super.init();

        System.out.println("SERVLET CREATED: " + new Date());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
