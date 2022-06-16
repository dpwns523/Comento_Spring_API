package service;

import java.util.List;
import vo.MovieVO;

public interface MovieService {
    public List<MovieVO> selectMovie() throws Exception;
}