public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 3");
        System.out.println(" ");
        //Задача 1
        System.out.println("Задача 1");
        int apple = 5;
        System.out.println("Значение переменной apple с типом int равно " + apple);
        byte pear = 8;
        System.out.println("Значение переменной pear с типом byte равно " + pear);
        short peach = 3;
        System.out.println("Значение переменной peach с типом short равно " + peach);
        long plum = 15L;
        System.out.println("Значение переменной plum с типом long равно " + plum);
        float plumWeight = 35.5f;
        System.out.println("Значение переменной plumWeight с типом float равно " + plumWeight);
        double appleWeight = 5.5;
        System.out.println("Значение переменной appleWeight с типом double равно " + appleWeight);
        //Задача 2
        System.out.println(" ");
        System.out.println("Задача 2");
        double boxWeight1 = 27.12;
        System.out.println("вес коробки 1 = " + boxWeight1);
        long quantityOfCells = 987678965549L;
        System.out.println("количество ячеек = " + quantityOfCells);
        float boxWeight2 = 2.786f;
        System.out.println("вес коробки 2 = " + boxWeight2);
        char outputTheCorrespondingSymbol = 569;
        System.out.println("вывести символ, соответсвующий значению 569 = " + outputTheCorrespondingSymbol);
        short answerNumber1 = -159;
        System.out.println("ответ номер 1 = " + answerNumber1);
        int quantityOfBox = 27897;
        System.out.println("количество коробок на складе = " + quantityOfBox);
        byte boxWeight3 = 67;
        System.out.println("вес коробки 3 = " + boxWeight3);
        boolean totalBoxWeight = (boxWeight1 + boxWeight2 + boxWeight3) > 100;
        double totalBoxWeight1 = (boxWeight1 + boxWeight2 + boxWeight3);
        System.out.println("Верно ли утверждение, что общий вес 3х коробок > 100? Ответ - " + totalBoxWeight + ", так как общий вес составляет " + totalBoxWeight1);
        //Задача 3
        System.out.println(" ");
        System.out.println("Задача 3");
        byte numberOfStudents1 = 23;
        byte numberOfStudents2 = 27;
        byte numberOfStudents3 = 30;
        short totalNumberOfSheets = 480;
        long totalNumberOfStudents = numberOfStudents1 + numberOfStudents2 + numberOfStudents3;
        long NumberOfSheetsToEach = totalNumberOfSheets / totalNumberOfStudents;
        System.out.println("На каждого ученика рассчитано " + NumberOfSheetsToEach + " листов бумаги");
        //Задача 4
        System.out.println(" ");
        System.out.println("Задача 4");
        System.out.println("Дано: За 2 минуты машина производит бутылок 16 штук");
        System.out.println("Найти: Сколько бутылок производит машина: за 20 минут, за сутки, за 3 дня и за месяц?");
        System.out.println("Ответ:");
        byte efficiency = 16 / 2; //производительность за минуту
        int numberOfBottles1 = efficiency * 20;
        System.out.println("За 20 минут машина производит бутылок " + numberOfBottles1 + " штук");
        int numberOfBottles2 = efficiency * 24 * 60;
        System.out.println("За сутки машина производит бутылок " + numberOfBottles2 + " штук");
        int numberOfBottles3 = efficiency * 24 * 60 * 3;
        System.out.println("За 3 дня машина производит бутылок " + numberOfBottles3 + " штук");
        int numberOfBottles4 = efficiency * 24 * 60 * 30;
        System.out.println("За месяц (30 дней) машина производит бутылок " + numberOfBottles4 + " штук");
    }
}