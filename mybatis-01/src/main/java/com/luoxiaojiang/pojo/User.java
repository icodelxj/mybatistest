package com.luoxiaojiang.pojo;

import org.apache.ibatis.type.Alias;

//用户实体类
@Alias("User")
public class User {
    private String Id;
    private String Name;
    private String Pwd;
    public User(){
    }
    public User(String id, String name, String pwd) {
        Id = id;
        Name = name;
        Pwd = pwd;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPwd() {
        return Pwd;
    }

    public void setPwd(String pwd) {
        Pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id='" + Id + '\'' +
                ", Name='" + Name + '\'' +
                ", Pwd='" + Pwd + '\'' +
                '}';
    }
}
