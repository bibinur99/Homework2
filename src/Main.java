public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
            System.out.println("Task One");
            var dog = 8.0;
            var cat = 3.6;
            var paper = 763789;
            System.out.println(dog);
            System.out.println(cat);
            System.out.println(paper);
    }

    public static void task2() {
            System.out.println("Task Two");
            var dog = 8.0;
            var cat = 3.6;
            var paper = 763789;
            dog = dog + 4;
            System.out.println(dog);
            cat = cat + 4;
            System.out.println(cat);
            paper = paper + 4;
            System.out.println(paper);
    }

    public static void task3() {
            System.out.println("Task Three");
            var dog = 8.0;
            var cat = 3.6;
            var paper = 763789;
            dog = dog - 3.5;
            System.out.println(dog);
            cat = cat - 1.6;
            System.out.println(cat);
            paper = paper - 7639;
            System.out.println(paper);
    }


    public static void task4() {
        System.out.println("Task Four");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }

    public static void task5() {
        System.out.println("Task Five");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog /3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }

    public static void task6() {
        System.out.println("Task Six");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        var difference = boxer2 - boxer1;
        System.out.println("Общий вес:" + totalWeight);
        System.out.println("Разница в весе:" + difference);
    }

    public static void task7() {
        System.out.println("Task Seven");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var diff1 = boxer2 - boxer1;
        System.out.println("Разница вычитанием:" + diff1);
        var diff2 = boxer2 % boxer1;
        System.out.println("Разница остатком от деления:" + diff2);
    }

    public static void task8() {
        System.out.println("Task Eight");
        var totalHours = 640;
        var hourPerPerson = 8;
        var numberOfPeople = totalHours / hourPerPerson;
        System.out.println("Всего работников в компании —" + " "+ numberOfPeople + " "+ "человек");
        var morePeople = numberOfPeople + 96;
        var totalHoursIncreased = morePeople * 8;
        System.out.println("Если в компании работает" + " " + morePeople + " " +"человек," +
                "то всего" +" "+ totalHoursIncreased+ " " + "часов работы может быть" +
                " поделено между сотрудниками");
    }
}