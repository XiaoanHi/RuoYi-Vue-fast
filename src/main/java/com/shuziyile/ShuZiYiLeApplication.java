package com.shuziyile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author ruoyi
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class ShuZiYiLeApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(ShuZiYiLeApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  国防动员管理系统启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                " ____  _           ________   ___ _         \n" +
                " / ___|| |__  _   _|__  (_) \\ / (_) |    ___ \n" +
                " \\___ \\| '_ \\| | | | / /| |\\ V /| | |   / _ \\ \n" +
                "  ___) | | | | |_| |/ /_| | | | | | |__|  __/ \n" +
                " |____/|_| |_|\\__,_/____|_| |_| |_|_____\\___| \n" +
                "                                             "
        );
    }
}
