class Holidays {
    public static void main(String[] args) {
        int holidays = 0;
        for(int month = 1; month <= 12; month++) {
            for(int week = 1; week <= 4; week++) {
                for(int day = 1; day <= 7; day++) {
                    if(day == 7 || (week == 2 && day == 6)) {
                        holidays++;
                        System.out.println("Month " + month +
                                " Week " + week +
                                " Day " + day);
                    }
                }
            }
        }
        System.out.println("Total Holidays = " + holidays);
    }
}