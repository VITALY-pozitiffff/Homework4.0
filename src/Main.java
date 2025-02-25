public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        //Возраст человека

        int age = 25; // Можно указать любой возраст
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия ,нужно немного подождать");
        }

        System.out.println("Задача 2");
        // Температура
        int temperature = 5;// Можно указать любою температуру
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, сегодня тепло можно идти без шапки");

        } else {
            System.out.println("На улице " + temperature + " градусов, холодно нужно надеть шапку");

        }
        System.out.println("Задача 3");
        //Скорость
        int carSpeed = 55;// Можно задать любое значение
        if (carSpeed > 60) {
            System.out.println("Если скорость " + carSpeed + " то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + carSpeed + " то можно ехать спокойно");
        }
        System.out.println("Задача 4");
        //Возраст человека
        int agePerson = 25;
        if (agePerson >= 2 && agePerson <= 6) {
            System.out.println("Если возраст человека равен " + agePerson + " то ему нужно ходить в детский сад");
        } else if (agePerson >= 7 && agePerson <= 17) {
            System.out.println("Если возраст человека равен " + agePerson + " то ему нужно ходить в школу");
        } else if (agePerson >= 18 && agePerson <= 24) {
            System.out.println("Если возраст человека равен " + agePerson + " то ему нужно ходить в университет");
        } else if (agePerson > 24) {
            System.out.println("Если возраст человека равен " + agePerson + " то ему пора ходить на работу");
        } else {
            System.out.println("Возраст не подходит под условия ");// В условие возраст начинается от 2 лет ,на случай если указать 1 год

        }
        System.out.println("Задача 5");
        //Возраст ребенка
        int ageChildren = 14; // Можно задать любой возраст
        // Сделаем через boolean
        boolean tooYoung = ageChildren < 5;
        boolean middleAge = ageChildren >= 5 && ageChildren <14;
        boolean oldMen = ageChildren  >= 14;
        if (tooYoung) {
            System.out.println("Если возраст ребенка равен " + ageChildren + " , то ему нельзя кататься на аттракционе ");
        } else if (middleAge) {
            System.out.println("Если возраст ребенка равен " + ageChildren + " , то ему можно кататься на аттракционе в сопровождение взрослого");

        } else if (oldMen) {
            System.out.println("Если возраст ребенка равен " + ageChildren + " , то ему можно кататься на аттракционе без  сопровождение взрослого ");

        }
        System.out.println("Задача 6");
        int totalPlaces = 102;//Общее количество мест в вагоне
        int placesSits = 60;//Сидячие места
        int placesStand = totalPlaces - placesSits;//Стоячие места
        int occupiedPlaces = 12;//Количество занятых мест.Можно ввести любое значение
        boolean hasFreePlaces = (occupiedPlaces < totalPlaces);// Проверим количество свободных мест
        boolean hasFreeSittingPlaces = (occupiedPlaces <= placesSits);//Проверим есть ли сидящие мета
        boolean hasFreeStandingPlaces = (occupiedPlaces > placesSits && occupiedPlaces < totalPlaces);
        if (hasFreePlaces) {
            System.out.println("В вагоне есть свободные места");
        }
        if (hasFreeSittingPlaces) {
            System.out.println("Есть свободные сидящие места");
        } else if (hasFreeStandingPlaces) {
            System.out.println("Нет свободных сидящих мест, но есть свободные стоячие места");
        } else {
            System.out.println("Вагон полностью забит");
        }
        System.out.println("Задача 7");
        //Задаем три числа
        int one = 7;
        int two = 789;
        int three = 45;
        //Проверка наибольшего числа
        boolean isOneMore = one >= two && one >= three;
        boolean isTwoMore = two >= one && two >= three;
        boolean isThreeMore = three >= one && three >= two;
        if (isOneMore) {
            System.out.println("Наибольшее число среди трех заданных = " + one);
        } else if (isTwoMore) {
            System.out.println("Наибольшее число среди трех заданных = " + two);
        } else if (isThreeMore) {
            System.out.println("Наибольшее число среди трех заданных = " + three);
        }
    }
    }





