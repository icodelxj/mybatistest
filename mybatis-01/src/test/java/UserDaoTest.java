import com.luoxiaojiang.dao.UserMapper;
import com.luoxiaojiang.pojo.User;
import com.luoxiaojiang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){
        //第一步：获取sqlSession对象
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        //第二步：执行sql
        UserMapper userDao=sqlSession.getMapper(UserMapper.class);
        //第三步：调用方法
//        List<User> list=userDao.getUserList();
//        for (User item:list
//             ) {
//            System.out.println(item);
//        }
        User nowUser= userDao.getUserById("1002");
        System.out.println(nowUser);
        //第四步：关闭sqlSession
        sqlSession.close();
    }
}