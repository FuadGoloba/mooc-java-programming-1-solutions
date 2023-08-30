import java.util.ArrayList;
public class GradeStatistics {
    private int count;
    private int sum;
    private int passingSum;
    private int passedCount;
    private ArrayList<Integer> points;
    private static final int passingGrade = 50;

    public GradeStatistics() {
        this.count = 0;
        this.sum = 0;
        this.passingSum = 0;
        this.passedCount = 0;
        this.points = new ArrayList<>();
    }

    public boolean isValidPoint(int number) {
        return (number >= 0) && (number <= 100);
    }
    
    public void addPoint(int number) {
        if (isValidPoint(number)) {
            this.count += 1;
            this.points.add(number);
            this.sum += number;
            if (number >= passingGrade) {
                this.passingSum += number;
                this.passedCount += 1;
            }
        }
    }
    
    public int getCount() {
        return this.count;
    }
    
    public int sum() {
        return this.sum;
    }
    
    public double average() {
        if (this.count == 0) {
            return (double) this.count;
        } else {
            return (double) this.sum / this.count;
        }
    }

    public double passingAverage() {
        if (this.passedCount == 0) {
            return (double) this.passedCount;
        } else {
            return (double) this.passingSum / this.passedCount;
        }
    }

    public double passPercentage() {
        return (100.0 * this.passedCount) / this.count;
    }

    public void printAverage() {
        System.out.println("Point average (all): " + this.average());
    }

    public void printPassingAverage() {
        String text = "Point average (passing): ";
        if (this.passingAverage() > 0) {
            text += this.passingAverage();
        } else {
            text += "-";
        }
        System.out.println(text);
    }

    public void printPassPercentage() {
        System.out.println("Pass percentage: " + this.passPercentage());
    }

    public void printGradeDistribution() {
        int[] gradeDistribution = new int[6];

        for (int point : this.points) {
            if (this.isValidPoint(point)) {
                if (point < 50) {
                    gradeDistribution[0]++;
                } else if ((point >= 50) && (point < 60)) {
                    gradeDistribution[1]++;
                } else if ((point >= 60) && (point < 70)) {
                    gradeDistribution[2]++;
                } else if ((point >= 70) && (point < 80)) {
                    gradeDistribution[3]++;
                } else if ((point >= 80) && (point < 90)) {
                    gradeDistribution[4]++;
                } else if ((point >= 90)) {
                    gradeDistribution[5]++;
                }
            }
        }

        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            String grade = Integer.toString(i) + ':';
            if (gradeDistribution[i] > 0) {
                for (int j = 0; j < gradeDistribution[i]; j++) {
                    grade += '*';
                }
                System.out.println(grade);
            } else {
                System.out.println(grade);
            }
        }
    }
}
