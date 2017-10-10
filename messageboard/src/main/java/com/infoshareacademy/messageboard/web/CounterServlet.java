package com.infoshareacademy.messageboard.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/counter")
public class CounterServlet extends HttpServlet {
    private static final String COUNTER_SESSION_KEY = "count";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        Integer counter = (Integer) session.getAttribute(COUNTER_SESSION_KEY);
        if (counter == null) {
            counter = 0;
        }

        counter++;

        session.setAttribute(COUNTER_SESSION_KEY, counter);

        req.setAttribute("counter", counter);
        req.getRequestDispatcher("counter.jsp").forward(req, resp);
    }
}
