package com.company;

public class Response {
    private boolean answer;
    private int count;

    public Response(boolean answer, int count) {
        this.answer = answer;
        this.count = count;
    }

    public boolean isAnswer() {
        return answer;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Response{" +
                "answer=" + answer +
                ", count=" + count +
                '}';
    }
}
