<?xml version = "1.0"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" 
 "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<jsp:include page="header.jsp"/>

<h1 align="Center"> Delete Book </h1>
<p align="Center">Enter a book name and book price to delete from database</p>
<br />
<table align="center">
<form method="post" action="deletebook.do">
 <tr>
 <td>
  <label for="booknamedelete">Book Name:</label>
 </td>
 <td>
  <input type="text" name="booknamedelete"/> 
 </td>
 </tr>
 <tr>
 <td>
  <label for="bookpricedelete">Book price:</label>
 </td>
  <td>
  <input type="text" name="bookpricedelete"/> 
 </td>
 </tr>

  <td>
  <br>
   <input type="submit" value="Delete Book" />
  </td>
 </tr>
</form>
</table>