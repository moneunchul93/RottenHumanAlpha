/**
 * Created by moneunchul93 on 2017-05-28.
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Person {
    private String name;
    private String gender;
    private String job;
    private String star;
    private String str;
    private String email;
    private int year,month,date;
    private int age;

    public int getAge(int Year, int Month, int Date) //생년월일 바탕으로 나이계산
    {
        Calendar current = Calendar.getInstance();
        int currentYear  = current.get(Calendar.YEAR);
        int currentMonth = current.get(Calendar.MONTH) + 1;
        int currentDay   = current.get(Calendar.DAY_OF_MONTH);

        int age = currentYear - Year;

        if (Month * 100 + Date > currentMonth * 100 + currentDay){
            age--;
        }

        return age;
    }

}

