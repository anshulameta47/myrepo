<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<body>
<head>Your Result:</head><br/>
<table align="center" border=1>
<tr>
<td>Student ID:</td>
<td>${myresult.getId()}</td>
</tr>
<br/>
<tr>
<td>Class:</td>
<td>${myresult.getStandard()}</td>
</tr>
<br/>
<tr>
<td>Name:</td>
<td>${myresult.getName()}</td>
</tr>
<br/>
<tr>
<td>Hindi:</td>
<td>${myresult.getHindi()}</td>
</tr>
<br/>
<tr>
<td>English:</td>
<td>${myresult.getEnglish()}</td>
</tr>
<br/>
<tr>
<td>Math:</td>
<td>${myresult.getMath()}</td>
</tr>
<br/>
<tr>
<td>Total:</td>
<td>${myresult.getTotal()}</td>
</tr>
<br/>


<tr>
<td>Result:</td>
<td>${myresult.getResult()}</td>
</tr>
<br/>




</table>
</body>
</html>