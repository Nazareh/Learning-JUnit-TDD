package iloveyouboss;

public class Criterion {
    private Answer answer;
    Weight weight;
    public Criterion(Answer answer, Weight weight) {
        this.answer = answer;
        this.weight = weight;
    }

    public Answer getAnswer() {
        return answer;
    }
}
