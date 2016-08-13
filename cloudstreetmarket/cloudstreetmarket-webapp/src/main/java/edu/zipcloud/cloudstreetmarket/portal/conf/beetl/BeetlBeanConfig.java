package edu.zipcloud.cloudstreetmarket.portal.conf.beetl;

import org.beetl.core.ResourceLoader;
import org.beetl.core.resource.ClasspathResourceLoader;
import org.beetl.core.resource.WebAppResourceLoader;
import org.beetl.ext.spring.BeetlGroupUtilConfiguration;
import org.beetl.ext.spring.BeetlSpringViewResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;

@Configuration
public class BeetlBeanConfig {

    private String contentType = "text/html;charset=UTF-8";
    private String prefix = "/WEB-INF/templates";
    private String suffix = ".html";


    @Bean(initMethod = "init")
    public BeetlGroupUtilConfiguration beetlConfig() {
        return new BeetlGroupUtilConfiguration();
    }

    @Bean
    public ViewResolver viewResolver() {
        BeetlSpringViewResolver resolver = new BeetlSpringViewResolver();
        resolver.setPrefix(prefix);
        resolver.setSuffix(suffix);
        resolver.setContentType(contentType);
        resolver.setOrder(0);

        return resolver;
    }
}
