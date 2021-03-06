<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<%@include file="/WEB-INF/views/include/include_head.jspf" %>
</head>

<style>
table{
	width: 80%;
	margin: 0 auto;
	border: 1px solid black;
	color: dimgray;
	font-style: italic;
}
th{
	padding: 4px 8px;
}
td{
	border: 1px solid black;
	padding: 4px 8px;
}
.data-row{
	cursor: pointer;
	text-align: right;
}
.data-row:hover{
	color: white;
	background-color: dimgray;
}
.table-container{
	width: 100%;
	margin: 0 auto;
	text-align: center;
}
.table-container p{
	padding: 2px 8px;
	margin: 2px 8px;
	margin-bottom: 30px;
	text-decoration: none;
	font-size: 25px;
	font-style: italic;
	font-weight: bold;
	color: darkgray;
}
</style>
<script>
$(function(){
	$(".data-row").click(function(){
		let d_code=$(this).attr("data-code")
		/*
		opener.document.getElementById("select-dcode").value=d_code
		window.close()
		*/
		$("#select-dcode").val(d_code)
		$(".modal").css("display", "none")
	})
        
    
})
</script>
<body>
<p></p>
<div class="table-container">
<p class="bounce-in-ani">Department List</p>
<table class="fade-in-ani">
	<tr>
		<th>Department Code</th>
		<th>Department Name</th>
	</tr>
	<c:choose>
		<c:when test="${empty LIST}">
			<tr><td colspan="2">No data</td></tr>
		</c:when>
		<c:otherwise>
		<c:forEach var="dept" items="${LIST}" varStatus="i">
			<tr class="data-row" data-code="${dept.d_code}">
				<td>${dept.d_code}</td>
				<td>${dept.d_name}</td>
			</tr>
		</c:forEach>
		</c:otherwise>
	</c:choose>
</table>
</div>
</body>
</html>