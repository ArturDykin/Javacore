public class MainClass {
    public static void main(String[] args) {

        Competitor[] competitors = {new Cat("Рыжик"), new Dog("Шарик")};
        Obstacle[] obstacles = {new Cross(500), new Wall(5), new Water(5)};

        Team team = new Team("Победителей", competitors);

        System.out.println("Создана новая команда");
        System.out.println(team.getTeamName());

        System.out.println("Приветствие членов команды");
        team.showResults();

        Course course = new Course(obstacles);

        System.out.println("Команда идет на препядствия");
        course.doIt(team);

        System.out.println("Результаты команды");
        team.showResults();

        System.out.println("Члены команды которые закинчили препядствия");
        team.showMembersFinishedCourse();
    }
}