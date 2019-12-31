package br.com.rpg.campaign.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

import br.com.rpg.campaign.model.User;

@WebServlet("/UserService")
public class UserService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		System.out.println("[ Web Service ] : UserService acessado!");

		String accept = req.getHeader("Accept");
		System.out.println(accept);

		if (accept.contains("application/json")) {

			Gson gson = new Gson();
			String json = gson.toJson(User.getLista());

			res.setContentType("application/json");
			res.getWriter().print(json);

		} else if (accept.contains("application/xml")) {

			XStream xStream = new XStream();
			xStream.alias("User", User.class);
			String xml = xStream.toXML(User.getLista());

			res.setContentType("application/xml");
			res.getWriter().print(xml);

		} else {
			
			res.setContentType("application/json");
			res.getWriter().print("{ \"message\" : \"no content\"}");
			
		}

	}

}
