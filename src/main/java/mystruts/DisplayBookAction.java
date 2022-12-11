package mystruts;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class DisplayBookAction extends Action 
{
	   private Connection connection;
	   private PreparedStatement getRecords;

	   public ActionForward execute(ActionMapping mapping,
               ActionForm form,
               HttpServletRequest request,
               HttpServletResponse response)
 		throws ServletException, IOException
       {
		   
		    ArrayList bookList = new ArrayList();
	   	    try
		    {
			   Class.forName("com.mysql.jdbc.Driver");
			   String url = "jdbc:mysql://localhost:3306/bookdb";
		       connection = DriverManager.getConnection(url,"root", "123456");
		       getRecords = connection.prepareStatement("Select * From books");
			
	           ResultSet results = getRecords.executeQuery();

	  	       while (results.next())
			   {
	  	    	  BookBean a_book = new BookBean();
	  	    	  a_book.setBookname(results.getString(1));
	  	    	  a_book.setPrice(results.getInt(2));
		    	  bookList.add(a_book);
			   }
			
		       getRecords.close();		   	   
	        
	 	       request.setAttribute("bookList", bookList);
		   
	 	       return (mapping.findForward("success"));
		    }
	   	    catch (Exception e)
	   	    {}
	   	    return (mapping.findForward("failure"));
       }
}
