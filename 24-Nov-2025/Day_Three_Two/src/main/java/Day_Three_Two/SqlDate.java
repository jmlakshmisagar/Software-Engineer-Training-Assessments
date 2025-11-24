
package Day_Three_Two;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SqlDate {
    public static void main(String[] args) throws Exception {
        String strDate = "15-08-2025";

        // Step 1: Parse String to java.util.Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date utilDate = dateFormat.parse(strDate);
        System.out.println("java.util.Date: " + utilDate);

        // Step 2: Convert java.util.Date to java.sql.Date
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        System.out.println("java.sql.Date: " + sqlDate);

        String isoDate = new SimpleDateFormat("yyyy-MM-dd").format(utilDate);
        java.sql.Date sqlDate2 = java.sql.Date.valueOf(isoDate);
        System.out.println("java.sql.Date using valueOf(): " + sqlDate2);
    }
}
