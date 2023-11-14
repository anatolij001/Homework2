public class Main {
    public static void main(String[] args) {
        //---   Задание 1 ---
        int i = 96178;
        byte b = 126;
        short shrt = 32502;
        long l = 100000000L;
        float f = 3.14f;
        double dbl = 48.789352478;

        System.out.println("---   Задача 1   ---");
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной shrt с типом short равно " + shrt);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + dbl + "\n");

        //---   Задание 2 ---
        float flt = 27.12f;
        long lng = 987678965549L;
        float flt1 = 2.786f;
        short sht = 569;
        short sht2 = -159;
        short sht3 = 27897;
        byte bt = 67;

        //---   Задача 3   ---
        byte stdLyudPav = 23;
        byte stdAnnaSerg = 27;
        byte stdEkatAnd = 30;
        short totalQuantityPaper = 480;
        float quantityPaperPerStudent = 0f;
        quantityPaperPerStudent = totalQuantityPaper / (stdLyudPav + stdAnnaSerg + stdEkatAnd);
        System.out.println("---   Задача 3   ---");
        System.out.println("На каждого ученика рассчитано " + quantityPaperPerStudent + " листов бумаги\n");

        //---   Задача 4   ---
        byte bottlesPerTwoMinutes = 16;
        int bottlesPerTwentyMinutes = 20 * bottlesPerTwoMinutes / 2;
        int bottlesPerDay = 24 * 60 * bottlesPerTwoMinutes / 2;
        int bottlesPerThreeDays = 3 * 24 * 60 * bottlesPerTwoMinutes / 2;
        int bottlesPerOneMonth = 30 * 24 * 60 * bottlesPerTwoMinutes / 2;
        System.out.println("---   Задача 4   ---");
        System.out.println("За 20 минут машина произвела " + bottlesPerTwentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesPerThreeDays + " штук бутылок");
        System.out.println("За 1 месяц (30 дней) машина произвела " + bottlesPerOneMonth + " штук бутылок\n");

        //---   Задача 5   ---
        System.out.println("---   Задача 5   ---");
        byte totalPaintTins = 120;
        byte whiteColorTinsPerRoom = 2;
        byte brownColorTinsPerRoom = 4;
        int totalQuantityRooms = totalPaintTins / (whiteColorTinsPerRoom + brownColorTinsPerRoom);
        int totalQuantityWhiteTins = totalQuantityRooms * whiteColorTinsPerRoom;
        int totalQuantityBrownTins = totalQuantityRooms * brownColorTinsPerRoom;
        System.out.println("В школе, где " + totalQuantityRooms + " классов, нужно " + totalQuantityWhiteTins + " банок белой краски и " + totalQuantityBrownTins + " банок коричневой краски\n");

        //---   Задача 6   ---
        System.out.println("---   Задача 6   ---");
        byte banansQuantity = 5;
        byte bananWeight = 80;
        short milkQuantity = 200;
        byte milkWeightPer100 = 105;
        byte iceCreamQuantity = 2;
        byte iceCreamWeight = 100;
        byte eggsQuantity = 4;
        byte eggWeight = 70;
        int breakfastGrams = banansQuantity * bananWeight + milkQuantity * milkWeightPer100 / 100 + iceCreamQuantity * iceCreamWeight + eggsQuantity * eggWeight;
        float breakfastKilos = breakfastGrams / 1000f;
        System.out.println("Вес спортзавтрака в граммах = " + breakfastGrams);
        System.out.println("Вес спортзавтрака в килограммах = " + breakfastKilos + "\n");

        //---   Задача 7   ---
        System.out.println("---   Задача 7   ---");
        byte deltaWeightKilos = 7;
        int deltaWeightGrams = deltaWeightKilos * 1000;
        float quantityDays250 = deltaWeightGrams / 250f;
        float quantityDays500 = deltaWeightGrams / 500f;
        float averageDays = (quantityDays250 + quantityDays500) / 2f;
        System.out.print("Если спортсмен будет терять в весе 250 граммов в день, то для похудения на 7 кг потребуется " + quantityDays250 + " дней.\n");
        System.out.print("Если спортсмен будет терять в весе 500 граммов в день, то для похудения на 7 кг потребуется " + quantityDays500 + " дней.\n");
        System.out.println("В среднем для похудения на 7 кг потребуется " + averageDays + " дней.\n");

        //---   Задача 8   ---
        System.out.println("---   Задача 8   ---");
        int currentMariaSalary = 67760;
        int currentDenisSalary = 83690;
        int currentKristinaSalary = 76230;
        int currentMariaYerSalary = currentMariaSalary * 12;
        int currentDenisYerSalary = currentDenisSalary * 12;
        int currentKristinaYerSalary = currentKristinaSalary * 12;
        float newMariaSalary = currentMariaSalary + currentMariaSalary * 0.1f;
        float newDenisSalary = currentDenisSalary + currentDenisSalary * 0.1f;
        float newKristinaSalary = currentKristinaSalary + currentKristinaSalary * 0.1f;
        float newMariaYerSalary = newMariaSalary*12;
        float newDenisYerSalary = newDenisSalary*12;
        float newKristinaYerSalary = newKristinaSalary*12;
        float deltaMariaYerSalary=newMariaYerSalary-currentMariaYerSalary;
        float deltaDenisYerSalary=newDenisYerSalary-currentDenisYerSalary;
        float deltaKristinaYerSalary=newKristinaYerSalary-currentKristinaYerSalary;

        System.out.println("Мария теперь получает "+newMariaSalary+" рублей в месяц. Годовой доход вырос на "+deltaMariaYerSalary+" рублей");
        System.out.println("Денис теперь получает "+newDenisSalary+" рублей в месяц. Годовой доход вырос на "+deltaDenisYerSalary+" рублей");
        System.out.println("Кристина теперь получает "+newKristinaSalary+" рублей в месяц. Годовой доход вырос на "+deltaKristinaYerSalary+" рублей\n");
    }
}