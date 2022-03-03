package com.luoxiaojiang.utils;
import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

// mybatis 工具类的封装
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        // Resources 读取 Mybatis 框架运行参数 , Mybatis
        try {
            InputStream inputStream = Resources
                    .getResourceAsStream("mybatis-config.xml");
            // 创建 sqlSessionFactory 对象, 工厂类型资源
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("没找到文件！");
        }
    }
    // 获取 SqlSession 对象
    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }
}
