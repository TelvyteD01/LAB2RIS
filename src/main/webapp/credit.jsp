<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Credit List</title>
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

        h1, h2 {
            text-align: center;
            color: white; /* Белый текст */
        }

        table {
            width: 70%;
            border-collapse: collapse;
            margin-bottom: 20px;
            background-color: #ecf0f1; /* Нежно-голубая таблица */
        }

        th, td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #bdc3c7; /* Голубой фон заголовков */
            color: white; /* Белый текст в заголовках */
        }

        tr:hover {
            background-color: #f5f5f5;
        }

        .btn-group {
            display: flex;
            justify-content: center;
            align-items: center;
            margin-bottom: 20px;
        }

        .btn-group button {
            margin: 0 10px;
            padding: 8px 16px;
            color: white;
            background-color: #34495e; /* Темно-синяя кнопка */
            border: none;
            cursor: pointer;
            font-size: 14px;
            border-radius: 4px;
        }

        .btn-group button:hover {
            background-color: #2c3e50; /* Темно-синяя кнопка при наведении */
        }
    </style>
</head>
<body>
<h1>Credit List</h1>

<h2>All Credits</h2>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Interest Rate</th>
        <th>Loan Amount</th>
        <th>Duration (Months)</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="credit" items="${credits}">
        <tr>
            <td>${credit.id}</td>
            <td>${credit.name}</td>
            <td>${credit.interestRate}</td>
            <td>${credit.loanAmount}</td>
            <td>${credit.durationMonths}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<div class="btn-group">
    <button onclick="window.location.href='best-credits'">View Best Credits</button>
    <button onclick="window.location.href='monthly-payment'">Monthly Payment</button>
</div>
</body>
</html>