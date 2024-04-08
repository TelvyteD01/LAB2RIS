package com.example.demo1;

import com.example.demo1.ejb.CreditBean;
import com.example.demo1.entity.Credit;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/monthly-payment")
public class MonthlyPaymentServlet extends HttpServlet {
    @EJB
    private CreditBean creditBean;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int creditId = Integer.parseInt(request.getParameter("creditId"));
        double loanAmount = Double.parseDouble(request.getParameter("loanAmount"));

        Credit selectedCredit = creditBean.getCreditById(creditId);
        if (selectedCredit == null) {
            return;
        }

        double interestRate = selectedCredit.getInterestRate();
        int durationMonths = selectedCredit.getDurationMonths();

        double monthlyPayment = creditBean.calculateMonthlyPayment(loanAmount, interestRate, durationMonths);
        request.setAttribute("monthlyPayment", monthlyPayment);

        request.getRequestDispatcher("/monthly-payment.jsp").forward(request, response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          request.getRequestDispatcher("/monthly-payment.jsp").forward(request, response);
    }
}