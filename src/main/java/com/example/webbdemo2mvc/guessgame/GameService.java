package com.example.webbdemo2mvc.guessgame;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
@SessionScope
public class GameService {

    private int secretNumber;
    List<String> answerList = new ArrayList<>();


    public GameService() {
        generateSecretNumber();
    }

    public int generateSecretNumber() {
        Random random = new Random();
        secretNumber = random.nextInt(1, 101);
        return secretNumber;
    }

    public boolean makeGuess(int guess) {
        if (guess < secretNumber) {
            answerList.add(guess + " : Too Low");
            return false;
        } else if (guess > secretNumber) {
            answerList.add(guess + " : Too high");
            return false;
        } else {
            answerList.clear();
            generateSecretNumber();
            return true;
        }
    }

    public List<String> getAnswerList() {
        return answerList;
    }

}
