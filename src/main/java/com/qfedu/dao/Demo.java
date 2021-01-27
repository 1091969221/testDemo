package com.qfedu.dao;

import com.qfedu.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class Demo {
private static SqlSessionFactory ssf = null;
    static {
        try {
            Reader reader = Resources.getResourceAsReader("mybatis.xml");
            ssf = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void add(){
            SqlSession session = ssf.openSession();
            session.insert("userEntitySpace.add");
            session.commit();
            session.close();
    }



    public static void main(String[] args) {
//        add();
        try {
//            读取配置文件
            Reader resourceAsReader = Resources.getResourceAsReader("mybatis.xml");
//            创建SqlSessionFactory对象
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resourceAsReader);
//           创建SqlSession对象
            SqlSession sqlSession = factory.openSession();
//            执行插入操作 命名空间+id 找到要执行的sql语句
            int insert = sqlSession.insert("userEntitySpace.add");
            System.out.println(insert);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
