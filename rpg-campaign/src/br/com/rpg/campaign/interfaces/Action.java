package br.com.rpg.campaign.interfaces;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
	
	String executa(HttpServletRequest req, HttpServletResponse res)  throws IOException, ServletException;

}
