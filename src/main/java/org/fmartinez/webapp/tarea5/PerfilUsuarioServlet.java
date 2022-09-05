package org.fmartinez.webapp.tarea5;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/perfil-usuario")
public class PerfilUsuarioServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");

        HttpSession session = req.getSession();
        String username = (String) session.getAttribute("nombre");

        try (PrintWriter out = resp.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("   <head>");
            out.println("   <meta charset=\"UTF-8\">");
            out.println("   <title>Perfil del Usuario</title>");
            out.println("   </head>");
            out.println("   <body>");
            out.println("   <h1>Perfil del Usuario " + username + "</h1>");
            out.println("   <ul>");
            out.println("   <li>Username: " + username + "</li>");
            out.println("   </ul>");
            out.println("   <a href='" + req.getContextPath() + "/index.jsp'>Volver a Index</a>");
            out.println("   </body>");
            out.println("</html>");
        }
    }
}
