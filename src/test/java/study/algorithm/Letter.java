package study.algorithm;

public class Letter {
    public static void main(String[] args) {
        Letter letter = new Letter();
        int result = letter.calculateWidth("happy birthday!");
        System.out.println(result);
    }

    public int calculateWidth(String message) {
        return message.length()*2;
    }
}
