import com.qfedu.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    private static SqlSessionFactory factory = null;
    static {
        try {
            Reader resourceAsReader = Resources.getResourceAsReader("mybatis.xml");
            factory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int insertData(){
        SqlSession session = factory.openSession();
        User user = new User();
        user.setName("法外狂徒");
        user.setPassword("密码正确");
        user.setAge(4800);
        int userEntitySpace = session.insert("userEntitySpace.insertData", user);
        session.commit();
        session.close();
        return userEntitySpace;
    }
    public static int insertData(User user){
        SqlSession session = factory.openSession();
        int userEntitySpace = session.insert("userEntitySpace.insertData", user);
        session.commit();
        session.close();
        return userEntitySpace;
    }
    public static int delById(int id){
        SqlSession session = factory.openSession();
        int delete = session.delete("userEntitySpace.delById", id);
        session.commit();
        session.close();
        return delete;
    }
    public static int upDate(User user){
        SqlSession session = factory.openSession();
        int update = session.update("userEntitySpace.upDate", user);
        session.commit();
        session.close();
        return update;
    }
    public static List<User> selectAll(){
        SqlSession session = factory.openSession();
        List<User> objects = session.selectList("userEntitySpace.selectAll");
        session.commit();
        session.close();
        return objects;
    }
//    public static Map selectOne(int id){
//        SqlSession session = factory.openSession();
//        Map<String, Object > map = new HashMap<>();
//        map.put("id",id);
//        Map<Object, Object> id1 = session.selectMap("userEntitySpace.selectOne", "id");
//        session.commit();
//        session.close();
//        return id1;
//    }
    public static void selectOne(){
        SqlSession session = factory.openSession();
        Object o = session.selectOne("userEntitySpace.findOne", 5);
        session.commit();
        session.close();
        System.out.println(o);
    }
    public static void main(String[] args) {
        selectOne();
        //        List<User> users = selectAll();
//        for (User user : users) {
//            System.out.println(user);
//        }
//
//        User user = new User();
//        user.setId(5);
//        user.setName("我我我枪手");
//        user.setPassword("密码正确");
//        user.setSex("男");
//        user.setAge(1500);
//        int i1 = upDate(user);
//        System.out.println(i1);
////        int i = insertData(user);
////        System.out.println("修改了：" + i);
//        int i = delById(28);
//        System.out.println(i);

    }
}
