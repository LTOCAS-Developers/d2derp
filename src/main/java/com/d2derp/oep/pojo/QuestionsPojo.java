package com.d2derp.oep.pojo;

import org.springframework.stereotype.Component;

@Component
public class QuestionsPojo {

	private int questionNumber;
	private String questions;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String answer;

	private CoursePojo coursePojo;

	private QuestionsTopicPojo questionsTopicPojo;
	
	
	
	public QuestionsTopicPojo getQuestionsTopicPojo() {
		return questionsTopicPojo;
	}

	public void setQuestionsTopicPojo(QuestionsTopicPojo questionsTopicPojo) {
		this.questionsTopicPojo = questionsTopicPojo;
	}

	public int getQuestionNumber() {
		return questionNumber;
	}

	public CoursePojo getCoursePojo() {
		return coursePojo;
	}

	public void setCoursePojo(CoursePojo coursePojo) {
		this.coursePojo = coursePojo;
	}

	public void setQuestionNumber(int questionNumber) {
		this.questionNumber = questionNumber;
	}

	public String getQuestions() {
		return questions;
	}

	public void setQuestions(String questions) {
		this.questions = questions;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
