package iloveyouboss;

import java.util.Objects;

public class Answer {
    private Question question;
    private Bool answer;

    public Answer(Question question, Bool answer) {
        this.question = question;
        this.answer = answer;
    }
    public boolean match(Answer otherAnswer){
        return this.equals(otherAnswer);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Answer)) return false;
        Answer answer1 = (Answer) o;
        return Objects.equals(question, answer1.question) &&
                answer == answer1.answer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(question, answer);
    }
}
