public class Main {
    public static void main(String[] args) {
        int a = 100;
        byte b = 1;
        short c = 170;
        long d = 200;
        double e = 0.3;
        double f = 1.002;
        System.out.println("Значение пременной а с типом int равно " + a );
        System.out.println("Значение пременной b с типом byte равно " + b );
        System.out.println("Значение пременной c с типом short равно " + c );
        System.out.println("Значение пременной d с типом long равно " + d );
        System.out.println("Значение пременной e с типом double равно " + e );
        System.out.println("Значение пременной f с типом double равно " + f );

        double one = 27.12;
        long two = 987678965;
        byte three = 2;
        short four = 768;
        System.out.println (one);
        System.out.println (two);
        System.out.println (three);
        System.out.println (four);

        var lpStudents = 23;
        var asStudents = 27;
        var eaStudents = 30;
        var totalStudents = lpStudents + asStudents + eaStudents;
        var paper = 480;
        var paperPerStudent = totalStudents % paper;
        System.out.println ("На каждого ученика  рассчитано " + paperPerStudent + " листов бумаги");

        var efficiencyBottleMachinePerBaseTime = 16;
        var baseTime = 2;
        var efficiencyBottleMachine = efficiencyBottleMachinePerBaseTime / baseTime;
        var twentyMin = 20;
        var effiiciencyPerTwentyMin = efficiencyBottleMachine * twentyMin;
        System.out.println ("За " + twentyMin + " минут машина произвела бутылок " + effiiciencyPerTwentyMin + " штук");
        var day = 1440;
        var efficiencyPerDay = efficiencyBottleMachine * day;
        System.out.println ("За " + day + " минут машина произвела бутылок " + efficiencyPerDay + " штук");
        var threeDays = 4320;
        var efficiencyPerThreeDays = efficiencyBottleMachine * day;
        System.out.println ("За " + threeDays + " минут машина произвела бутылок " + efficiencyPerThreeDays + " штук");
        var month = 43200;
        var efficiencyPerMonth = efficiencyBottleMachine * month;
        System.out.println ("За " + month + " минут машина произвела бутылок " + efficiencyPerMonth + " штук");

        var totalPaint = 120;
        var whitePaintPerClass = 2;
        var brownPaintPerClass = 4;
        var classes = totalPaint / (whitePaintPerClass+brownPaintPerClass);
        var whitePaintTotal = classes * whitePaintPerClass;
        var brownPaintTotal = classes * brownPaintPerClass;
        System.out.println ("В школе, где " + classes + " классов, нужно " + whitePaintTotal + " банок белой краски и " + brownPaintTotal + " банок коричневой краски");

        float banana = 5;
        float bananaWeight = 80;
        float milk = 2;
        float milkWeight = 105;
        float iceCream = 2;
        float iceCreamWeight = 100;
        float eggs = 4;
        float eggsWeight = 70;
        float totalWeight = (banana * bananaWeight + milk * milkWeight + iceCream * iceCreamWeight + eggs * eggsWeight) / 1000;
        System.out.println (totalWeight + " кг");

        var totalLossWeight = 7000;
        var MinLossWeightPerDay = 250;
        var MaxLossWeightPerDay = 500;
        var dayMin = totalLossWeight / MinLossWeightPerDay;
        var dayMax = totalLossWeight / MaxLossWeightPerDay;
        System.out.println (" От " + dayMin + " до " + dayMax);
        float AverageWeightLoss = 250 + (500 - 250 / 2);
        System.out.println (AverageWeightLoss);
        var dayAverage = totalLossWeight / AverageWeightLoss;
        System.out.println (dayAverage + " дней в среднем");

        var salaryMaria = 67760;
        var salaryDenis = 83690;
        var salaryChristen = 76230;
        double salaryGrow = 1.1 ;
        double newSalaryMaria = salaryMaria * salaryGrow;
        double newSalaryDenis = salaryDenis * salaryGrow;
        double newSalaryChristen = salaryChristen * salaryGrow;
        var year = 12;
        double growAnnualIncomeMaria = (newSalaryMaria - salaryMaria) * year;
        double growAnnualIncomeDenis = (newSalaryDenis - salaryDenis) * year;
        double growAnnualIncomeChristen = (newSalaryChristen - salaryChristen) * year;
        System.out.println (" Маша теперь получает " + newSalaryMaria + " рублей. Годовой доход вырос на " + growAnnualIncomeMaria +" рублей");
        System.out.println (" Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + growAnnualIncomeDenis +" рублей");
        System.out.println (" Кристина теперь получает " + newSalaryChristen + " рублей. Годовой доход вырос на " + growAnnualIncomeChristen +" рублей");

    }
}