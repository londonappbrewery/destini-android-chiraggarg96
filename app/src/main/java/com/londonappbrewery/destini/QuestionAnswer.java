package com.londonappbrewery.destini;

public class QuestionAnswer {

    int mStory;
    int mAnswerOne;
    int mAnswerTwo;

    QuestionAnswer(int mStory,int mAnswerOne,int mAnswerTwo)
    {
        this.mStory=mStory;
        this.mAnswerOne=mAnswerOne;
        this.mAnswerTwo=mAnswerTwo;
    }
    QuestionAnswer(int mStory)
    {
        this.mStory=mStory;
    }

    public int getStory() {
        return mStory;
    }

    public void setStory(int story) {
        mStory = story;
    }

    public int getAnswerOne() {
        return mAnswerOne;
    }

    public void setAnswerOne(int answerOne) {
        mAnswerOne = answerOne;
    }

    public int getAnswerTwo() {
        return mAnswerTwo;
    }

    public void setAnswerTwo(int answerTwo) {
        mAnswerTwo = answerTwo;
    }
}
