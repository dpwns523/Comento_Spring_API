package dao;

import java.util.List;
import javax.inject.Inject;

import dao.MovieDAO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import vo.MovieVO;

@Repository
public class MovieDAOImpl implements MovieDAO {

    @Inject
    private SqlSession sqlSession;
    private static final String Namespace = "mybatis.sql.test";


    @Override
    public List<MovieVO> selectMovie() throws Exception {

        return sqlSession.selectList(Namespace+".selectMovie");
    }

}