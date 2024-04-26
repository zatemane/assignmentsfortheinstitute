package seventeenarray;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        FootballTeam[] teams = {
                new FootballTeam("Команда1", "Москва", 2, 20),
                new FootballTeam("Команда2", "Санкт-Петербург", 1, 25),
                new FootballTeam("Команда3", "Москва", 3, 18)
        };

        findTeamsWithAboveAverageWins(teams);
        orderByLeaguePositionDescending(teams);
        findTeamsInCity(teams);
        editTeamInformation(teams);
    }

    // Поиск команд с количеством побед больше среднего
    public static void findTeamsWithAboveAverageWins(FootballTeam[] teams) {
        double totalWins = 0;
        for (FootballTeam team : teams) {
            totalWins += team.getWins();
        }
        double averageWins = totalWins / teams.length;
        System.out.println("Команды с количеством побед больше среднего:");
        for (FootballTeam team : teams) {
            if (team.getWins() > averageWins) {
                System.out.println(team);
            }
        }
    }

    // Сортировка массива по убыванию мест в лиге
    public static void orderByLeaguePositionDescending(FootballTeam[] teams) {
        for (int i = 0; i < teams.length - 1; i++) {
            for (int j = 0; j < teams.length - 1 - i; j++) {
                if (teams[j].getLeaguePosition() < teams[j + 1].getLeaguePosition()) {
                    FootballTeam temp = teams[j];
                    teams[j] = teams[j + 1];
                    teams[j + 1] = temp;
                }
            }
        }
        System.out.println("\nМассив упорядоченный по убыванию мест в лиге:");
        for (FootballTeam team : teams) {
            System.out.println(team);
        }
    }

    // Поиск и вывод команд по интересующему городу
    public static void findTeamsInCity(FootballTeam[] teams) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите интересующий город: ");
        String cityToSearch = scanner.nextLine();
        int count = 0;
        System.out.println("Команды в городе " + cityToSearch + ":");
        for (FootballTeam team : teams) {
            if (team.getCity().equalsIgnoreCase(cityToSearch)) {
                System.out.println(team);
                count++;
            }
        }
        System.out.println("Всего команд в городе " + cityToSearch + ": " + count);
    }

    // Поиск по названию команды, исправление одного из полей
    public static void editTeamInformation(FootballTeam[] teams) {
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



