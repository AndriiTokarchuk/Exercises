import java.util.Date;
import java.text.SimpleDateFormat;
public class ex4 {
    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat format1;
        format1 = new SimpleDateFormat(
                "dd.MM.yyyy");
        System.out.println(
                format1.format(d)  // 25.02.2013 09:03
        );
}
}
