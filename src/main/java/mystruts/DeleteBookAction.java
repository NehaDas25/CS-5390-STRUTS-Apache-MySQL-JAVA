package mystruts;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.*;
import org.apache.struts.action.*;
import com.mysql.jdbc.Driver;

public class DeleteBookAction extends Action 
{
	   private Connection connection;
	   private PreparedStatement insertRecords;
	   
	   public ActionForward execute(ActionMapping mapping,
			                        ActionForm form,
			                        HttpServletRequest request,
			                        HttpServletResponse response)
	                  		throws ServletException, IOException
	   {
		  try
		  {
			String bookname = request.getParameter("booknamedelete");
			
			int bookprice = 0;
			try {
				bookprice = Integer.parseInt( request.getParameter("bookpricedelete") );
			} catch (Exception e) {
				return (mapping.findForward("failure"));
			}
			
			
			if (bookname != null)
			{
	            Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/bookdb";
			    connection = DriverManager.getConnection(url,"root", "123456");
			      
			    insertRecords = connection.prepareStatement("DELETE FROM books WHERE bookname=? AND price=?");
				insertRecords.setString(1, bookname);
				insertRecords.setInt(2, bookprice);
				
				int result = insertRecords.executeUpdate();	
	            insertRecords.close();
				    
				return (mapping.findForward("success"));
			}
			else
			{
				return (mapping.findForward("failure"));
			}
		  }
		  catch (Exception e)
		  { }
		  return (mapping.findForward("failure"));
	   }
}
