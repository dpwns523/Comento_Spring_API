package dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import vo.MovieVO;

@Repository
public interface MovieDAO {
    public List<MovieVO> selectMovie() throws Exception;
}
