package Lists;

public class Grade {

    public final int score;
    public final Module m;
    public final Student s;

    @Override
    public String toString() {
        return "Grade: " +
                score + " for student: "
                + s + " from module "+m;
    }

    public Grade( int score , Student s , Module m) {
        this.score = score;
        this.m = m;
        this.s = s;
    }
}