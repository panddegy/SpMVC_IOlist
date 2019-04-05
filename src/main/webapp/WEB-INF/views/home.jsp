<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
	<%@include file="/WEB-INF/views/include/include_head.jspf" %>
</head>
<style>

</style>
<body>
	<%@include file="/WEB-INF/views/include/include_header.jspf" %>
	
<section>
	<c:if test="${BODY=='DUMMY'}">
		<%@include file="/WEB-INF/views/bodies/dummy.jspf" %>
	</c:if>
	<c:if test="${BODY=='LIST'}">
		<%@include file="/WEB-INF/views/bodies/io_list.jspf" %>
	</c:if>
	<c:if test="${BODY=='DEPTLIST'}">
		<%@include file="/WEB-INF/views/bodies/dept_list.jspf" %>
	</c:if>
	<c:if test="${BODY=='PRODUCTLIST'}">
		<%@include file="/WEB-INF/views/bodies/product_list.jspf" %>
	</c:if>
	<c:if test="${BODY=='IOWRITE'}">
		<%@include file="/WEB-INF/views/bodies/io_write.jspf" %>
	</c:if>
	<c:if test="${BODY=='IOUPDATE'}">
		<%@include file="/WEB-INF/views/bodies/io_write.jspf" %>
	</c:if>
	<c:if test="${BODY=='DEPTWRITE'}">
		<%@include file="/WEB-INF/views/bodies/dept_write.jspf" %>
	</c:if>
	<c:if test="${BODY=='DEPTUPDATE'}">
		<%@include file="/WEB-INF/views/bodies/dept_write.jspf" %>
	</c:if>
	<c:if test="${BODY=='PRODUCTWRITE'}">
		<%@include file="/WEB-INF/views/bodies/product_write.jspf" %>
	</c:if>
	<c:if test="${BODY=='PRODUCTUPDATE'}">
		<%@include file="/WEB-INF/views/bodies/product_write.jspf" %>
	</c:if>
</section>
<footer>

</footer>
</body>
</html>



















