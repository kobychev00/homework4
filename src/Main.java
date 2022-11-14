public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int a = 0;
        System.out.println("Значение пременной а с типом int равно " + a );
        byte b = 1;
        System.out.println("Значение пременной b с типом byte равно " + b );
        short c = 170;
        System.out.println("Значение пременной c с типом short равно " + c );
        long d = 7500000000L;
        System.out.println("Значение пременной d с типом long равно " + d );
        float e = 3.151592f;
        System.out.println("Значение пременной e с типом float равно " + e );
        double f = 2.828;
        System.out.println("Значение пременной f с типом double равно " + f );

        // Задача 2
        System.out.println("Задача 2");

        float one = 27.12f;
        long two = 98767896549L;
        double three = 2.786;
        boolean five = false;
        char four = 569;
        short six = -159;
        int seven = 27897;
        byte eight = 67;
        System.out.println (one);
        System.out.println (two);
        System.out.println (three);
        System.out.println (four);
        System.out.println (five);
        System.out.println (six);
        System.out.println (seven);

        // Задача 3
        System.out.println("Задача 3");

        int lpStudents = 23;
        int asStudents = 27;
        int eaStudents = 30;
        int totalStudents = lpStudents + asStudents + eaStudents;
        int paper = 480;
        int paperPerStudent = paper / totalStudents;
        System.out.println ("На каждого ученика  рассчитано " + paperPerStudent + " листов бумаги");

        // Задача 4
        System.out.println("Задача 4");

        int efficiencyBottleMachinePerBaseTime = 16;
        int baseTime = 2;
        int efficiencyBottleMachine = efficiencyBottleMachinePerBaseTime / baseTime;
        int twentyMin = 20;
        int effiiciencyPerTwentyMin = efficiencyBottleMachine * twentyMin;
        System.out.println ("За " + twentyMin + " минут машина произвела бутылок " + effiiciencyPerTwentyMin + " штук");
        int day = 1440;
        int efficiencyPerDay = efficiencyBottleMachine * day;
        System.out.println ("За день машина произвела бутылок " + efficiencyPerDay + " штук");
        int threeDays = 4320;
        int efficiencyPerThreeDays = efficiencyBottleMachine * day;
        System.out.println ("За три дня машина произвела бутылок " + efficiencyPerThreeDays + " штук");
        int month = 43200;
        int efficiencyPerMonth = efficiencyBottleMachine * month;
        System.out.println ("За месяц машина произвела бутылок " + efficiencyPerMonth + " штук");

        // Задача 5
        System.out.println("Задача 5");

        int totalPaint = 120;
        int whitePaintPerClass = 2;
        int brownPaintPerClass = 4;
        int classes = totalPaint / (whitePaintPerClass+brownPaintPerClass);
        int whitePaintTotal = classes * whitePaintPerClass;
        int brownPaintTotal = classes * brownPaintPerClass;
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