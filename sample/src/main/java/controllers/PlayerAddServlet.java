package controllers;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import beans.Player;
import services.PlayerService;

/**
 * Servlet implementation class PlayerAddServlet
 */
@WebServlet("/PlayerAddServlet")
public class PlayerAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PlayerAddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.getRequestDispatcher("/player_add.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    request.setCharacterEncoding("UTF-8");

	    String name = request.getParameter("name");
	    String position = request.getParameter("position");

	    // 例: Player(int id, int countryId, int uniformNum, String position, String name, ...)
	    Player player = new Player(0, 0, 0, position, name, "", null, 0, 0);  // 必要に応じて他の値も修正

	    new PlayerService().insert(player);

	    // コンテキストパスを使ってリダイレクト
	    response.sendRedirect(request.getContextPath() + "/PlayerServlet");
	}


}
