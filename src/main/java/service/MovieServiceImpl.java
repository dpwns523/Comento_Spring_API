package service;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.MovieDAO;
import vo.MovieVO;

import javax.inject.Inject;

@Service
public class MovieServiceImpl implements MovieService {

    @Inject
    private MovieDAO dao;

    @Override
    public List<MovieVO> selectMovie() throws Exception {

        return dao.selectMovie();
    }

}