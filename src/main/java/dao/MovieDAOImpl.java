package dao;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vo.MovieVO;

@Repository
public class MovieDAOImpl implements MovieDAO {

    private final SqlSession sqlSession;
    private static final String Namespace = "mybatis.sql.test";

    public MovieDAOImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }


    @Override
    public List<MovieVO> selectMovie() throws Exception {

        return sqlSession.selectList(Namespace+".selectMovie");
    }

}