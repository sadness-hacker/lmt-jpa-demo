# lmt-jpa-demo
# 1.初始化数据库脚本
```sql
-- 参见resources/sql目录下的文件
-- t_demo_user表
DROP TABLE IF EXISTS `t_demo_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_demo_user` (
                               `id` bigint(20) NOT NULL,
                               `username` varchar(255) DEFAULT NULL,
                               `total_amount` decimal(19,2) DEFAULT NULL,
                               `status` int(11) DEFAULT NULL,
                               `created_time` datetime(6) DEFAULT NULL,
                               PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_demo_user`
--

LOCK TABLES `t_demo_user` WRITE;
/*!40000 ALTER TABLE `t_demo_user` DISABLE KEYS */;
INSERT INTO `t_demo_user` VALUES (1,'Java牧马人',199.88,1,'2022-01-16 16:28:23.000000'),(2,'八斩刀',88888888.98,1,'2022-01-16 16:28:52.000000');
/*!40000 ALTER TABLE `t_demo_user` ENABLE KEYS */;
UNLOCK TABLES;


-- t_demo_user_ext表
DROP TABLE IF EXISTS `t_demo_user_ext`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_demo_user_ext` (
                                   `id` bigint(20) NOT NULL,
                                   `country` varchar(255) DEFAULT NULL,
                                   `province` varchar(255) DEFAULT NULL,
                                   `address` varchar(255) DEFAULT NULL,
                                   PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_demo_user_ext`
--

LOCK TABLES `t_demo_user_ext` WRITE;
/*!40000 ALTER TABLE `t_demo_user_ext` DISABLE KEYS */;
INSERT INTO `t_demo_user_ext` VALUES (1,'中国','上海','虹口体育场'),(2,'USA','LA','Space X');
/*!40000 ALTER TABLE `t_demo_user_ext` ENABLE KEYS */;
UNLOCK TABLES;

```

# 2.启动应用
```
Spring Boot应用,启动JpaDemoApp即可，注意修改application-ds.properteis里数据库配置
启动后，浏览器打开：http://localhost:19199/demo/exec-demo-4
能正常返回结果，则成功
注：UserDto整合了User/UserExt里的字段,通过UserRepository仓库查寻
UserDto里配置了@NamedNativeQuery、@SqlResultSetMapping

```
