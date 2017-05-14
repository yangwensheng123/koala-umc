package com.xingling.umc.security.cache;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * <p>Title:	  RedisProperties. </p>
 * <p>Description redis属性 </p>
 * <p>Company:    http://www.hnxianyi.com </p>
 *
 * @Author         <a href="190332447@qq.com"/>杨文生</a>
 * @CreateDate     2017/5/14 15:29
 */
@Configuration
@Data
@ConfigurationProperties(prefix = RedisProperties.SPRING_REDIS)
public class RedisProperties {

    public final static String SPRING_REDIS="spring.redis";
    /**
     * 服务器IP
     */
    @Value("${spring.redis.host}")
    private String host;
    /**
     * 密码
     */
    @Value("${spring.redis.password}")
    private String password;
    /**
     * 端口号
     */
    @Value("${spring.redis.port}")
    private int port;
    /**
     * 超时时间
     */
    @Value("${spring.redis.timeout}")
    private int timeout;
    /**
     * 数据库
     */
    @Value("${spring.redis.database}")
    private int database;
    /**
     * 连接池最大连接数（使用负值表示没有限制）
     */
    @Value("${spring.redis.pool.max-active}")
    private int maxActive;
    /**
     * 连接池中的最大空闲连接
     */
    @Value("${spring.redis.pool.max-idle}")
    private int maxIdle;
    /**
     * 连接池最大阻塞等待时间（使用负值表示没有限制）
     */
    @Value("${spring.redis.pool.max-wait}")
    private int maxWait;
    /**
     * 连接池中的最小空闲连接
     */
    @Value("${spring.redis.pool.max-idle}")
    private int minIdle;

}
