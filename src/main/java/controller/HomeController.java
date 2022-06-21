package controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import service.MovieService;
import vo.MovieVO;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Locale;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    @Autowired
    private MovieService service;

    /*
     * Simply selects the home view to render by returning its name.
     */
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String home(Model model) throws Exception{
//
//        logger.info("home");
//
//        List<MovieVO> movieList = service.selectMovie();
//
//        model.addAttribute("movieList", movieList);
//
//        return "home";
//    }
    @GetMapping("/")
    public String helloWorld(){
        return "index";
    }

    @GetMapping("/home")
    public String home(Locale locale, Model model) throws Exception{
        logger.info("home");

        List<MovieVO> movieList = service.selectMovie();
        model.addAttribute("movieList", movieList);


        return "home";
    }


}