<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Counter</title>
</head>
<body>
    <jsp:useBean id="date" scope="page" class="java.util.Date" />
    <h2>Count: ${counter}</h2>
    <h3>Current date: ${date}</h3>

    <jsp:useBean id="info" scope="page" class="com.infoshareacademy.messageboard.model.CounterInfo" />

    <%
        info.setCount(3);
        info.setDate(date);
    %>

    <h4>${info.count} // ${info.date}</h4>

</body>
</html>
