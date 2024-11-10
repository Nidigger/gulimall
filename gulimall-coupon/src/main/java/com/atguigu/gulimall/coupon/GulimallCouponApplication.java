package com.atguigu.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1，命名空间：
 *    1），要做生产隔离，在bootstrap文件中修改spring.cloud.nacos.config.namespace=a9f4549c-0720-450e-aee6-cf8b9279bb32用来切换不同的开发生产环境
 *    2），每一个微服务之间互相隔离配置，都创建自己的命名空间，也只加载自己命名空间下的配置文件
 * 2，配置分组：
 *    1），默认所有配置集都属于DEFAULT_GROUP，可以新建多个不同名称的配置分组
 *
 *每个微服务创建自己的命名空间，使用配置分组区分环境，dev，test，prod
 *
 * 3，同时加载多个配置集
 *    1），微服务的任何配置文件都可以放在配置中心中
 *    2），只需要在bootstrap.properties中说明加载配置中心中的哪些配置文件即可
 *    3），@Value，@configurationProperties以前springBoot从配置文件中获取值的方法都可以继续使用，配置中心有的优先使用配置中心的
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
