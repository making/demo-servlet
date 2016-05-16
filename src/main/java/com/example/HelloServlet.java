package com.example;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Inject
    GreetingService greetingService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String greeting = greetingService.greet(name == null ? "World" : name);
        req.setAttribute("greeting", greeting);
        req.getRequestDispatcher("WEB-INF/hello.jsp").forward(req, resp);
    }
}
