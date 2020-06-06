import java.text.DecimalFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import static java.time.Duration.*;

public class ROICalculator{

    public static void main(String[] args) {
    System.out.println("The initial amount is: "+args[0]);
    System.out.println("The final amount is: " + args[1]);
    System.out.println("Expiration today: " + args[2]);
    double initialAmount = Double.parseDouble(args[0]);
    double finalAmount = Double.parseDouble(args[1]);
    Date input = new Date();
    LocalDate today = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    System.out.println("Start Date: " + today);
    LocalDate d2 = LocalDate.parse(args[2], DateTimeFormatter.ISO_LOCAL_DATE);
    Duration days = between(today.atStartOfDay(), d2.atStartOfDay());
    double daysBetween = days.toDays();
    System.out.println("The amount of days between " + today + " and " + args[2]+ " is " + daysBetween + " days.");
    double numOfYears = 365/daysBetween;
    double  d = finalAmount/ initialAmount;
    double AnnualizedRateOfReturn = ((Math.pow(d,numOfYears)-1)*100);
    DecimalFormat df = new DecimalFormat("#.##");
    System.out.println("Your Annualized Rate of Return is: " + df.format(AnnualizedRateOfReturn));
    }




}

