<?xml version = "1.0"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" 
 "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<%@ page import = "mystruts.*" %>

<jsp:include page="header.jsp"/>

<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<Center>
   <p><h1> Book List </h1></p>
   <table border = 2>
      <thead>
         <tr>
           <th>Book Name</th>
           <th>Price</th>
         </tr>
      </thead>
      
      <tbody>
           <c:forEach var="book" begin="0" items="${bookList}">
           <tr> 
               <td> <center> <c:out value="${book.bookname}"/> </center> </td>
               <td> <c:out value="${book.price}"/> </td>
           </tr>
           </c:forEach>
      </tbody>
   </table>
</Center>

<jsp:include page="footer.jsp"/>

