package controllers;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import beans.Player;
import services.PlayerService;

/**
 * Servlet implementation class PlayerServlet
 */
@WebServlet("/PlayerServlet")
public class PlayerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PlayerServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		ArrayList<Player> players = null;
		
		try {
			PlayerService ps = new PlayerService();
			players = ps.select();
		} catch (Exception e) {
			e.printStackTrace();
		}

		request.setAttribute("players", players);

		request.getRequestDispatcher("/player.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		doGet(request, response);
	}
}
