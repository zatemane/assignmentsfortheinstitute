package eleven;

import eleven.teem.Team;


//    Создать класс(Футбольные команды) для обозначения сущностей(Название, город, место в лиге, количество побед, тренер).
//    Определить у него несколько конструкторов - конструктор без
//    параметров, конструктор с несколькими параметрами и конструктор со всеми
//    параметрами. Создать не менее 3 экземпляров класса и вывести их на консоль.
//    Использовать логическое поле и Enum

    public class Runner {
        public static void main(String[] args) {
            Team team1 = new Team("FC Barcelona", "Barcelona", 1, 25, "Ronald Koeman",
                    Team.CoachType.HEAD_COACH);
            Team team2 = new Team("Real Madrid", "Madrid", 2, 22, "Carlo Ancelotti",
                    Team.CoachType.HEAD_COACH);
            Team team3 = new Team("Manchester City", "Manchester", 3, 20, "Pep Guardiola",
                    Team.CoachType.HEAD_COACH);

            team1.displayTeamInfo();
            team2.displayTeamInfo();
            team3.displayTeamInfo();
        }
    }



