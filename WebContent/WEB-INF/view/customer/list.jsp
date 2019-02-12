<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../home/top.jsp"/>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" 
	href="${css}/customer/list.css" />
<div class="grid-item" id="nav">
	<jsp:include page="../employee/nav.jsp"/>
</div>
<div class="grid-item" id="side_menu">
 	<h1><font style="font-size: 30px">고객 목록</font>
 	</h1>
</div>
<div class="grid-item" id="content">
	<table id="cust_tab">
	  <tr>
	    <th>No.</th>
	    <th>아이디</th>
	    <th>이 름</th>
	    <th>생년월일 </th>
	    <th>성 별</th>
	    <th>전화번호</th>
	    <th>우편번호</th>
	    <th>지번주소</th>
	    <th>상세주소</th>
	  </tr>
	  <c:forEach items="${list}" var="cust" varStatus="status">
	  <tr>
	    <td>${cust.rnum}</td>
	    <td>${cust.customerID}</td>
	    <td>${cust.customerName}</td>
	    <td>${cust.ssn}</td>
	    <td>남</td>
	    <td>${cust.phone}</td>
	    <td>${cust.postalCode}</td>
	    <td>${cust.city}</td>
	    <td>${cust.address}</td>
	  </tr>
	  </c:forEach>
	  
	</table>
	<div style="height: 50px"></div>    
	<div class="center">
	  <div class="pagination">
	  <a href="#">&laquo;</a>
	  <a href="#" class="active">1</a>
	  <a href="#" id ="page2" >2</a>
	  <a href="#">3</a>
	  <a href="#">4</a>
	  <a href="#">5</a>
	  <a href="#">&raquo;</a>
	  </div>
	</div>
</div>
<jsp:include page="../home/bottom.jsp"/>
<script>
 $('#page2').click(function(){
 		alert('2페이지로 넘어갑니다~');
 		location.assign('customer.do?cmd=cust_list&page=list&page_num=2&page_size=5');
 });
	//page_um,pageSize,
	//?cmd=list&page=list&page_num=2&page_size=5
	/*
 	 	<input type="hidden" name="cmd" value="access" />
	    <input type="hidden" name="dir" value="customer" />
	    <input type="hidden" name="page" value="list" />
	*/
</script>