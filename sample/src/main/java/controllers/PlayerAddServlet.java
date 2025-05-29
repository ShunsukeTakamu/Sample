package controllers;

import java.io.IOException;
import java.time.LocalDate;

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

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    request.setCharacterEncoding("UTF-8");

	    // フォームから値を取得
	    int countryId = Integer.parseInt(request.getParameter("country_id"));
	    int uniformNum = Integer.parseInt(request.getParameter("uniform_num"));
	    String position = request.getParameter("position");
	    String name = request.getParameter("name");
	    String club = request.getParameter("club");
	    String birthStr = request.getParameter("birth");
	    int height = Integer.parseInt(request.getParameter("height"));
	    int weight = Integer.parseInt(request.getParameter("weight"));


	    LocalDate birth = LocalDate.parse(birthStr);

	    // Playerオブジェクトにすべての値をセット
	    Player player = new Player(0, countryId, uniformNum, position, name, club, birth, height, weight);

	    System.out.println("登録データ: " + player); 
	    
	    // 登録
	    new PlayerService().insert(player);

	    // リダイレクト
	    response.sendRedirect(request.getContextPath() + "/PlayerServlet");
	}



}
