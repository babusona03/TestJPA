package home.dev.jpa.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.dev.jpa.model.ContactInformation;
import home.dev.jpa.model.ContactService;

@WebServlet("/showcontact.do")
public class ShowContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ContactService contactService;	
	
    public ShowContact() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		contactService=new ContactService();
		List<ContactInformation> contactInformation=contactService.readContact();
		for(ContactInformation i : contactInformation) {
			System.out.println(" "+i.getId()+" "+i.getContactName()+" "+i.getPhoneNo());
		}
		request.setAttribute("result", contactInformation);
		request.setAttribute("data", "HOHOHEEHEHAHA");
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/view/jsp/ListContact.jsp");
		view.forward(request, response);
	}

}
