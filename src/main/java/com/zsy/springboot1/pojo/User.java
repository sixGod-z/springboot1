package com.zsy.springboot1.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @Classname User
 * @Description TODO
 * @Date 2020/2/4 20:23
 * @Created by hero
 *
 * 将配置文件中配置的每一个属性的值，映射到这个组件中
 * 、@ConfigurationProperties：
 * 告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定；
 * prefix="user"：配置文件中哪个下面的所有属性进行一一映射
 */
@Component

@ConfigurationProperties(prefix = "user")
public class User {
    private int id;
    private String uname;
    private String pwd;
    private Map<String,Object> maps;
    private List<Object> lists;

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", pwd='" + pwd + '\'' +
                ", maps=" + maps +
                ", lists=" + lists +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }
}

