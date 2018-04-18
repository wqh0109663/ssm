package it.huanzi.test;

import it.huanzi.mapper.CountryMapper;
import it.huanzi.model.Country;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * Created by wqh on 2018/4/16.
 */
public class MybatisTest {
    public static void main(String[] args) {
        String resource = "mybatis-config.xml";
        Reader reader = null;
        try {
             reader = Resources.getResourceAsReader(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sqlSessionFactory.openSession();
        try {
            CountryMapper mapper = session.getMapper(CountryMapper.class);
            List<Country> countrys = mapper.getAllCountrys();
            for(Country country :countrys){
                System.out.println(country);
            }
            Country cn = mapper.getOneCountry("CN");
            System.out.println(cn);

        } finally {
            session.close();
        }


    }


}
