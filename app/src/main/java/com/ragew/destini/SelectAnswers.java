package com.ragew.destini;

/**
 * Created by ragew on 1/11/2018.
 */

public class SelectAnswers {
    private int m_AnswerID1;
    private int m_AnswerID2;

    public SelectAnswers(int mAnswerIDA, int mAnswerIDB){
        m_AnswerID1 = mAnswerIDA;
        m_AnswerID2 = mAnswerIDB;
    }

    public int getAnswerID1() {
        return m_AnswerID1;
    }

    public void setAnswerID1(int answerID1) {
        m_AnswerID1 = answerID1;
    }

    public int getAnswerID2() {
        return m_AnswerID2;
    }

    public void setAnswerID2(int answerID2) {
        m_AnswerID2 = answerID2;
    }
}
