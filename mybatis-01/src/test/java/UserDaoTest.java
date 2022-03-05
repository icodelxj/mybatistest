import com.luoxiaojiang.dao.UserMapper;
import com.luoxiaojiang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
public class UserDaoTest {
    @Test
    public void test(){
        //第一步：获取sqlSession对象
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        //第二步：执行sql
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        //第三步：调用方法

        //第四步：关闭
        sqlSession.close();
    }
}