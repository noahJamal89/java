package com.quizApplication.quizArt.service;

import com.quizApplication.quizArt.dao.QuestionDao;
import com.quizApplication.quizArt.model.Question;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {

    @Autowired
    private QuestionDao questionDao;

    public List<Question> getAllQuestions()
    {
        return questionDao.findAll();

    }

    public void addQuestion(Question question) {
        questionDao.save(question);
    }

    public Optional<Question> getQuestionById(Integer id) {
        return questionDao.findById(id);
    }

    public List<Question> getQuestionsByCategory(String category) {
        return questionDao.findByCategory(category);
    }

    public void deleteQuestionById(Integer id) {
        questionDao.deleteById(id);
    }

    public void updateQuestionById(Integer id, Question question) {
      question=questionDao.findById(id).orElseThrow(() -> new ResourceNotFoundException("question not exist with id: " + id));
      questionDao.save(question);
    }
}
