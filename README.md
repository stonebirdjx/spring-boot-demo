# 安装MySQL
```bash
docker run -d --name stonebird-mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=123456 mysql
```
# SQL
```sql 
create database test ;

use test;

CREATE TABLE `mybatis_test` (
  `id` int(32) NOT NULL comment "id" AUTO_INCREMENT,
  `name` varchar(32) NOT NULL  comment "名称",
  `phone` varchar(50) NOT NULL comment "手机",
  `email` varchar(32) DEFAULT NULL comment "邮箱",
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- mock数据
insert into mybatis_test(id, name, phone, email) values(1,'tom','17778568765','123456@qq.com');
```

# MyBatis
## 注解
```java
public interface MybatisTestMapper {
    @Select("select * from mybatis_test where id = #{id}")
    MybatisTest queryById(int id);

    @Insert("insert into mybatis_test(name, phone, email) values(#{name}, #{phone}, #{email})")
    int insert(MybatisTest mybatisTest);
}
```

## XML
```xml
<mapper namespace="com.example.mybatis.mapper.MybatisTestMapper">
    SELECT * FROM mybatis_test WHERE id = #{id}
</mapper>
```