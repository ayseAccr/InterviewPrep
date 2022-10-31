public class DateOfTime {
    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        //Month value in Calendar is 0-based. 
        calendar.set(year, month -1, day);
        String nameOfDay = calendar.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG,  Locale.US);
      
        return nameOfDay.toUpperCase();  
   }
}
