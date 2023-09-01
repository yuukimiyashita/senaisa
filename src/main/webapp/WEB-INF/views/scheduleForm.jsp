<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Gym Scheduling App - Criar Agendamento</title>
</head>
<body>
    <h1>Criar nova visita</h1>
    <form action="${pageContext.request.contextPath}/schedule/create" method="post">
        <label for="dateTime">Data e hora:</label>
        <input type="datetime-local" id="dateTime" name="dateTime" required>
        <br><br>
        <button type="submit">Criar</button>
    </form>
    <p><a href="${pageContext.request.contextPath}/schedule/list">Voltar para agendamentos</a></p>
</body>
</html>
