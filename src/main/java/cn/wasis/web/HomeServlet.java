package cn.wasis.web;

import org.apache.commons.lang3.StringUtils;

import cn.wasis.entity.Movie;
import cn.wasis.service.MovieService;
import cn.wasis.util.Page;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String pageNo = req.getParameter("p");
        int p = 1;
        if(StringUtils.isNumeric(pageNo)) {
            p = Integer.parseInt(pageNo);
        }

        MovieService movieService = new MovieService();

        Page<Movie> page = movieService.findMovieByPageNo(p);
        req.setAttribute("page",page);

        req.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(req,resp);
    }
}
