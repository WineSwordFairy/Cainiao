package core;

import core.mapper.CainiaoMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;

@Repository
public class CainiaoDao {

    public Integer send(Mail mail) {
        SqlSession sqlSession = SqlSessionFact.sqlSessionFactory.openSession();
        try {
            CainiaoMapper mapper = sqlSession.getMapper(CainiaoMapper.class);
            mapper.insert(mail);
            System.out.println("-------send++");
            sqlSession.commit();
        } catch (Exception ex) {
            int i = 0;
        } finally {
            sqlSession.close();
            return 2;
        }
    }

    public Mail query(int id) {
        SqlSession sqlSession = SqlSessionFact.sqlSessionFactory.openSession();
        Mail mail = null;
        try {
            CainiaoMapper mapper = sqlSession.getMapper(CainiaoMapper.class);
            mail = mapper.queryById(1);
            System.out.println("-------send++");
            sqlSession.commit();
            return mail;
        } catch (Exception ex) {
            int i = 0;
        } finally {
            sqlSession.close();
            return mail;
        }
    }
}
