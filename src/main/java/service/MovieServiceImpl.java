package service;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.MovieDAO;
import vo.MovieVO;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieDAO dao;

    @Override
    public List<MovieVO> selectMovie() throws Exception {

        return dao.selectMovie();
    }

}