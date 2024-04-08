<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Monthly Payment</title>
    <style>
        body {
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            background-color: #3498db; /* Синий фон */
        }

        h1 {
            text-align: center;
            color: white; /* Белый текст */
        }

        form {
            margin: 0 auto;
            padding: 10px;
            border: 1px solid #ddd;
            width: 400px;
        }

        label {
            display: inline-block;
            width: 100px;
            margin-bottom: 5px;
            color: white; /* Белый текст */
        }

        input[type="text"],
        input[type="number"] {
            width: 200px;
            padding: 5px;
            margin-bottom: 10px;
        }
        button {
            margin: 0 auto;
            margin: 0 10px;
            padding: 8px 16px;
            color: white;
            background-color: #34495e; /* Темно-синяя кнопка */
            border: none;
            cursor: pointer;
            font-size: 14px;
            border-radius: 4px;
        }
        button[type="submit"] {
            padding: 5px;
            background-color: #34495e; /* Темно-синяя кнопка */
            color: white; /* Белый текст */
            border: none;
            cursor: pointer;
            font-size: 14px;
            border-radius: 4px;
        }

    </style>
</head>
<body>
<h1>Monthly Payment Calculation</h1>

<form action="monthly-payment" method="post">
    <label for="creditId">Credit ID:</label>
    <input type="number" id="creditId" name="creditId" required><br>

    <label for="loanAmount">Loan Amount:</label>
    <input type="number" id="loanAmount" name="loanAmount" required><br>

    <button type="submit">Calculate</button>
</form>

<c:if test="${not empty monthlyPayment}">

    <h2>Monthly Payment</h2>
    <p>The monthly payment for the selected credit is: ${monthlyPayment}</p>
</c:if>

<button onclick="window.location.href='credit'">Main</button>

</body>
</html>