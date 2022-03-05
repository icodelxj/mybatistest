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
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        //第三步：调用方法
        int res=userMapper.delUser("1010");
        if(res>0){
            System.out.println("删除成功\n");
        }
        //提交事务
        sqlSession.commit();//插入数据时必须要提交事务，否侧插入不成功
        //第四步：关闭sqlSession
        sqlSession.close();
    }
}