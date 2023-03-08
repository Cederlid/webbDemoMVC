package com.example.webbdemo2mvc.guessgame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping("/game")
    public String guessForm(Model m) {
        m.addAttribute("guessAnswers", " ");
        List<String>answerList = gameService.getAnswerList();
        m.addAttribute("answers",answerList);
        return "guesspage";
    }

    @PostMapping("/game")
    public String answer(@RequestParam int guess, Model m) {
        boolean gameOver = gameService.makeGuess(guess);
        m.addAttribute("gameover", gameOver?"You won! 🥳": "Wrong guess!! 😒");
        m.addAttribute("answers", gameService.getAnswerList());
        return "guesspage";
    }













}
