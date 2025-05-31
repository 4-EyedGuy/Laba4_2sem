package com.example.music;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.music.MusicDisplay;

public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicDisplay display = (MusicDisplay) context.getBean("musicDisplay");
        display.show();

        context.close();
    }
}
