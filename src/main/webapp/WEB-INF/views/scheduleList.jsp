<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Gym Scheduling App - Lista de Agendamentos</title>
</head>
<body>
    <h1>Lista de Agendamentos</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Data e hora</th>
            <th>Deletar</th>
        </tr>
        <c:forEach var="schedule" items="${schedules}">
            <tr>
                <td>${schedule.id}</td>
                <td>${schedule.dateTime}</td>
                <td><a href="${pageContext.request.contextPath}/schedule/delete/${schedule.id}">Deletar</a></td>
            </tr>
        </c:forEach>
    </table>
    <p><a href="${pageContext.request.contextPath}/">Voltar</a></p>
    <p><a href="${pageContext.request.contextPath}/schedule/create">Criar Agendamento</a></p>
</body>
</html>
