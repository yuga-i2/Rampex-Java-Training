public class Schedule {
    public static void main(String[] args) {
        int month = 1;
        int dayCompleted = 1;
        for(int week = 1; week <= 4; week++) {
            for(int day = 1; day <= 7; day++) {
                System.out.println("Month " + month +" Week " + week +" Day " + day +" Days completed " + dayCompleted++);
                System.out.println("Come to college study and go home");
            }
        }
    }
}