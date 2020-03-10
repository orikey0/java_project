package dao;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import bean.Hero;
import com.sun.org.apache.regexp.internal.RE;
import org.junit.runner.Result;

import javax.print.attribute.standard.PresentationDirection;

public class HeroDAO {
 
    public HeroDAO(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //装载需要使用的Driver类
    public Connection GetConnection(){
        try {
            return DriverManager.getConnection( "jdbc:mysql://www.orikey.top:3306/how2j?characterEncoding=UTF-8",
                    "sdustlhh","Lhh2019!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    //返回一个和数据库的Connection链接。
    public int GetTotal(){
        int total = 0;
        try(Connection connection = GetConnection();
            Statement statement = connection.createStatement()) {
            String sql = "select count(*) from hero";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                total = resultSet.getInt(1);
            }
            System.out.println("total:"+total);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return total;
    }
    //使用sql语句，通过Statement对象执行sql，通过ResultSet对象的第一个值反馈信息
    public void add(Hero hero){
        if (hero==null)
            return;
        String sql= "insert into hero values(null,?,?,?)";
        try(
                Connection connection = GetConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)
                ) {
            preparedStatement.setString(1, hero.name);
            preparedStatement.setFloat(2, hero.hp);
            preparedStatement.setInt(3, hero.damage);
            preparedStatement.execute();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next())
            {
                int id = resultSet.getInt(1);
                hero.id = id;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //insert into hero values(null,?,?,?)
    public void update(Hero hero){
        String sql ="update hero set name = ?,hp = ?,damage = ? where id = ?";
        try(Connection connection = GetConnection();
            PreparedStatement preparedStatement= connection.prepareStatement(sql)
        ) {
            preparedStatement.setString(1, hero.name);
            preparedStatement.setFloat(2, hero.hp);
            preparedStatement.setInt(3, hero.damage);
            preparedStatement.setInt(4, hero.id);

            preparedStatement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //"update hero set name = ?,hp = ?,damage = ? where id = ?"
    public void delete(int id){
        String sql = "delete from hero where id = ?";
        try(Connection connection = GetConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ) {
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //"delete from hero where id = ?
    public Hero get(int id){
        Hero hero = null;
        try (
                Connection connection = GetConnection();
                Statement statement = connection.createStatement();
                ){
                String sql ="select * from hero where id = "+id;
                ResultSet resultSet = statement.executeQuery(sql);
                while (resultSet.next()) {
                    hero = new Hero();
                    String name = resultSet.getString(2);
                    float hp = resultSet.getFloat("hp");
                    int damage = resultSet.getInt(4);
                    hero.name = name;
                    hero.hp = hp;
                    hero.damage = damage;
                    hero.id = id;
                }


            } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return hero;
    }
    //select * from hero where id = id
    public List<Hero>list(){
        return list(0,Short.MAX_VALUE);
    }
    public List<Hero>list(int start,int count){
        List<Hero>heroes = new ArrayList<>();
        String sql ="select * from hero order by id desc limit ?,?";
        try(
                Connection connection = GetConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ) {

            preparedStatement.setInt(1, start);
            preparedStatement.setInt(2, count);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Hero hero = new Hero();
                hero.id = resultSet.getInt(1);
                hero.hp = resultSet.getFloat("hp");
                hero.name =resultSet.getString(2);
                hero.damage = resultSet.getInt(4);
                heroes.add(hero);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return heroes;
    }

    public int getTotal() {
        int total=0;
        String sql = "select count(*) from hero";
        try(
                Connection connection = GetConnection();
                PreparedStatement preparedStatement =connection.prepareStatement(sql);
                ) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next())
                total = resultSet.getInt(1);


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return total;
    }
    //select * from hero order by id desc

}