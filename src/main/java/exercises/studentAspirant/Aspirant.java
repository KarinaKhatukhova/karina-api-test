package exercises.studentAspirant;

public final class Aspirant extends Student {
    private final String researchWork;

    public Aspirant(String firstName, String lastName, String group,
                    double averageMark, String researchWork) {
        super(firstName, lastName, group, averageMark);
        this.researchWork = researchWork;
    }

    @Override
    public int getScholarship() {
        if (averageMark == 5) {
            return 2500;
        } else {
            return 2200;
        }
    }

    public String getResearchWork() {
        return researchWork;
    }
}



