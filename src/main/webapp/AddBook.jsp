<?xml version = "1.0"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" 
 "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<jsp:include page="header.jsp"/>

<h1 align="Center"> Add Book </h1>

<br />
<table align="center">
<form method="post" action="addbook.do">
 <tr>
 <td>
  <label for="bookname">Book Name:</label>
 </td>
 <td>
  <input type="text" name="bookname"/> 
 </td>
 </tr>
 <tr>
 <td>
  <label for="price">Price:</label>
 </td>
 <td>
  <input type="text" name="price" />
 </td>
 <tr>
  <td>
   <input type="submit" value="Add Book" />
  </td>
 </tr>
</form>
</table>