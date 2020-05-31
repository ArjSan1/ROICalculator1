import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ROICalculator{

    public static void main(String[] args) {
    System.out.println("Your initial amount is: "+args[0]);
    System.out.println("Your final amount is: " + args[1]);
    System.out.println("Start Date: " +args[2]);
    System.out.println("Expiration date: " + args[3]);
    double initialAmount = Double.parseDouble(args[0]);
    double finalAmount = Double.parseDouble(args[1]);
    LocalDate d1 = LocalDate.parse(args[2], DateTimeFormatter.ISO_LOCAL_DATE);
    LocalDate d2 = LocalDate.parse(args[3], DateTimeFormatter.ISO_LOCAL_DATE);
    Duration days = Duration.between(d1.atStartOfDay(), d2.atStartOfDay());
    double daysBetween = days.toDays();
    System.out.println("The amount of days between " + args[2] + " and " + args[3]+ " is " + daysBetween + " days.");
    double numOfYears = 365/daysBetween;
    double  d = finalAmount/ initialAmount;
    double AnnualizedRateOfReturn = ((Math.pow(d,numOfYears)-1)*100);
    DecimalFormat df = new DecimalFormat("#.##");
    System.out.println("Your Annualized Rate of Return is: " + df.format(AnnualizedRateOfReturn));
    }




}

