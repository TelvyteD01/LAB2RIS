package com.example.demo1;

import com.example.demo1.ejb.CreditBean;
import com.example.demo1.entity.Credit;
import jakarta.ejb.EJB;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;
@WebServlet("/best-credits")
public class BestCreditServlet extends HttpServlet {
    @EJB
    private CreditBean creditBean;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Credit> bestCredits = creditBean.findCreditsWithBestConditions(2); // Здесь выбираем 5 лучших кредитов
        request.setAttribute("bestCredits", bestCredits);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/best-credits.jsp");
        dispatcher.forward(request, response);
    }
}
