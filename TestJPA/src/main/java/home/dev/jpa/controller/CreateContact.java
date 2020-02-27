package home.dev.jpa.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.dev.jpa.model.ContactInformation;
import home.dev.jpa.model.ContactService;

@WebServlet("/createcontact.do")
public class CreateContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CreateContact() {
        super();        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//inside servlet
		ContactInformation contactInformation = new ContactInformation();
		ContactService contactService= new ContactService();
		contactInformation.setName(request.getParameter("cname"));
		contactInformation.setPhoneNo(request.getParameter("cnum"));
		contactService.createContact(contactInformation);
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/view/jsp/MainInterface.jsp");
		view.forward(request, response);
	}
}
