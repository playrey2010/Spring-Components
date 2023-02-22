package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class FromFileFortuneService implements FortuneService {

    private String file = "fortunes.txt";

    private List<String> fortuneArray;

    private Random random = new Random();



    @PostConstruct
    public void loadFromFile() {
        File theFile = new File(file);
        fortuneArray = new ArrayList<String>();

        try (BufferedReader br = new BufferedReader(new FileReader(theFile))){
            String templine;
            while ((templine = br.readLine()) != null) {
                fortuneArray.add(templine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Override
    public String getFortune() {
        int randInt = random.nextInt(fortuneArray.size());
        return fortuneArray.get(randInt);
    }
}
