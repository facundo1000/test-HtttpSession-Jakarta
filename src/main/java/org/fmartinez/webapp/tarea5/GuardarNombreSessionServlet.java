package org.fmartinez.webapp.tarea5;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/guardar-session")
public class GuardarNombreSessionServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("nombre");
        HttpSession session = req.getSession();

        if (!username.isEmpty() || !username.isBlank()) {
            session.setAttribute("nombre", username);
            resp.sendRedirect(getServletContext().getContextPath() + "/perfil-usuario");
        } else {
            session.invalidate();
            getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
        }
    }
}
