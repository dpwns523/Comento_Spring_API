package dao;

import java.util.List;


import vo.MovieVO;

public interface MovieDAO {
    public List<MovieVO> selectMovie() throws Exception;
}
