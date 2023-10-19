package com.quizApplication.quizArt.controller;

import com.quizApplication.quizArt.model.Question;
import com.quizApplication.quizArt.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("question")
public class questionController {

   @Autowired
    QuestionService questionService;
    @GetMapping("allQuestions")
    public List<Question> getAllQuestions()
    {

        return questionService.getAllQuestions();

    }
    @PostMapping("addQuestion")
    public void addQuestion(@RequestBody Question question)
    {
        questionService.addQuestion(question);
    }

    @GetMapping("questionId/{id}")
    public Optional<Question> getQuestionById(@PathVariable Integer id)
    {
        return questionService.getQuestionById(id);
    }
    @GetMapping("category/{category}")
    public List<Question>  getQuestionsByCategory(@PathVariable String category)
    {
        return questionService.getQuestionsByCategory(category);
    }

    @DeleteMapping("deleteQuestion/{id}")
    public void deleteQuestionById(@PathVariable Integer id)
    {
             questionService.deleteQuestionById(id);
    }
    @PutMapping("updateQuestion/{id}")
    public void updateQuestionById(@PathVariable Integer id , @RequestBody Question question)
    {
        questionService.updateQuestionById(id,question);
    }
}
