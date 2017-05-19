package cn.wasis.service;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.wasis.entity.Movie;
import cn.wasis.service.MovieService;
import cn.wasis.util.Page;

import java.util.List;

import static org.junit.Assert.*;

public class MovieServiceTestCase {

    private Logger logger = LoggerFactory.getLogger(MovieServiceTestCase.class);
    private MovieService movieService = new MovieService();

    @Test
    public void testFindAll() {
        List<Movie> movieList = movieService.findAllMovie();
        assertNotNull(movieList);
    }

    @Test
    public void testFindByPage() {
        Page<Movie> page = movieService.findMovieByPageNo(2);
        for(Movie movie : page.getItems()) {
            logger.debug("{}",movie);
        }
        assertEquals(10,page.getItems().size());
    }

}
