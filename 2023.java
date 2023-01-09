import java.util.Calendar;

public class CalendarGenerator {
  public static void main(String[] args) {
    int year = 2023; // The year for which the calendar is generated
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.YEAR, year);
    calendar.set(Calendar.MONTH, Calendar.JANUARY);
    
    // Print the calendar for the whole year
    for (int month = 0; month < 12; month++) {
      calendar.set(Calendar.MONTH, month);
      System.out.println("\n" + calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Calendar.US) + " " + calendar.get(Calendar.YEAR));
      System.out.println("Su Mo Tu We Th Fr Sa");
      
      // Print the calendar for the current month
      int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
      for (int i = 0; i < firstDayOfWeek - 1; i++) {
        System.out.print("   ");
      }
      while (calendar.get(Calendar.MONTH) == month) {
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        if (day < 10) {
          System.out.print(" ");
        }
        System.out.print(day + " ");
        if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
          System.out.println();
        }
        calendar.add(Calendar.DAY_OF_MONTH, 1);
      }
    }
  }
}