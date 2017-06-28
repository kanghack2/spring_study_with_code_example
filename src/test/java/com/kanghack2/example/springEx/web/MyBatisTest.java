package com.kanghack2.example.springEx.web;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.inject.Inject;

/**
 * Created by hankanghak on 2017. 6. 29..
 */

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MyBatisTest {

    @Inject
    private SqlSessionFactory sqlFactory;

    @Test
    public void testFactory(){
        System.out.println("testFactory()");
        System.out.println(sqlFactory.toString());
    }

    @Test
    public void testSession() throws Exception {
        log.info("testSession()");
        try(SqlSession session = sqlFactory.openSession()) {
            System.out.println("Here is session");
            System.out.println(session);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
