package seventeenlist;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        List<FootballTeam> teams = new ArrayList<>();
        teams.add(new FootballTeam("Команда1", "Москва", 2, 20));
        teams.add(new FootballTeam("Команда2", "Санкт-Петербург", 1, 25));
        teams.add(new FootballTeam("Команда3", "Москва", 3, 18));

        // Пункт 1: команды с количеством побед больше среднего
        double totalWins = 0;
        for (FootballTeam team : teams) {
            totalWins += team.getWins();
        }
        double averageWins = totalWins / teams.size();
        System.out.println("Команды с количеством побед больше среднего:");
        for (FootballTeam team : teams) {
            if (team.getWins() > averageWins) {
                System.out.println(team);
            }
        }

        // Пункт 2: упорядочить список по убыванию мест в лиге
        teams.sort(Comparator.comparingInt(FootballTeam::getLeaguePosition).reversed());
        System.out.println("\nСписок упорядоченный по убыванию мест в лиге:");
        for (FootballTeam team : teams) {
            System.out.println(team);
        }

        // Пункт 3: определить количество и вывести команды по интересующему городу
        String cityToSearch = "Москва";
        int count = 0;
        System.out.println("\nКоманды в городе " + cityToSearch + ":");
        for (FootballTeam team : teams) {
            if (team.getCity().equalsIgnoreCase(cityToSearch)) {
                System.out.println(team);
                count++;
            }
        }
        System.out.println("Всего команд в городе " + cityToSearch + ": " + count);

        // Пункт 4: поиск по названию команды, исправление одного из полей и вывод полной информации о команде после редактирования
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите название команды для поиска и редактирования: ");
        String teamNameToEdit = scanner.nextLine();
        boolean found = false;
        for (FootballTeam team : teams) {
            if (team.getName().equalsIgnoreCase(teamNameToEdit)) {
                found = true;
                System.out.println("Найденная команда: " + team);
                System.out.print("Введите новое количество побед: ");
                int newWins = scanner.nextInt();
                scanner.nextLine(); // Очистка буфера
                team.setWins(newWins);
                System.out.println("После редактирования: " + team);
                break;
            }
        }
        if (!found) {
            System.out.println("Команда с таким названием не найдена.");
        }
    }
}
