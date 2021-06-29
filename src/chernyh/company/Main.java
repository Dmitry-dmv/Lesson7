package chernyh.company;

import java.util.Calendar;


public class Main {

    public static void main(String[] args) {

        сlass Study {
            private final String course;

    public Study(String course) {
                this.course = course;
            }

            public String printCourse () {
                return this.course;
            }
        }

        class JavaProgram {
            public static void main(String[] args) {
                Study study = new Study("Изучение Java - это просто!");
                System.out.println(study.printCourse());
            }
        }

        public class House {
            private int numberFloors;
            private int yearConstruction;
            private String name;

            public static void main(String[] args) {
                House houseA = new House();
                houseA.setName("A");
                houseA.setNumberFloors(20);
                houseA.setYearConstruction(2013);

                House houseB = new House();
                houseB.setName("B");
                houseB.setNumberFloors(17);
                houseB.setYearConstruction(2021);

                System.out.println(houseA);
                System.out.println(houseB);
            }

            public int getNumberFloors() {
                return numberFloors;
            }

            public void setNumberFloors(int numberFloors) {
                this.numberFloors = numberFloors;
            }

            public int getYearConstruction() {
                return yearConstruction;
            }

            public void setYearConstruction(int yearConstruction) {
                this.yearConstruction = yearConstruction;
            }


            public int getYearsOld() {
                return Calendar.getInstance().get(Calendar.YEAR) - yearConstruction;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            @Override
            public String toString() {
                return "House{" +
                        "numberFloors=" + numberFloors +
                        ", yearConstruction=" + yearConstruction +
                        ", yearsOld='" + getYearsOld() + '\'' +
                        ", name='" + name + '\'' +
                        '}';
            }
        }
        public class Tree {
            private int age;
            private boolean alive;
            private String name;

            public static void main(String[] args) {
                Tree treeA = new Tree();
                Tree treeB = new Tree(400, "ELKA");
                Tree treeC = new Tree(50, true, "Linden");

                System.out.println(treeA);
                System.out.println(treeB);
                System.out.println(treeC);
            }

            public Tree() {
                System.out.println("Пустой конструктор без параметров сработал");
            }

            public Tree(int age, String name) {
                this.age = age;
                this.name = name;
            }

            public Tree(int age, boolean alive, String name) {
                this.age = age;
                this.alive = alive;
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public boolean isAlive() {
                return alive;
            }

            public void setAlive(boolean alive) {
                this.alive = alive;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            @Override
            public String toString() {
                return "Tree{" +
                        "age=" + age +
                        ", alive=" + alive +
                        ", name='" + name + '\'' +
                        '}';
            }
        }
        public class Plane {

            private Wing wing;

            public static void main(String[] args) {
                Plane planeA = new Plane(797);
                System.out.println(planeA);

                Plane planeB = new Plane();
                planeB.setWing(planeB.new Wing(876));
                System.out.println(planeB);
            }

            public Plane() {
            }

            public Plane(double weightWing) {
                this.wing = new Wing(weightWing);
            }

            public Wing getWing() {
                return wing;
            }

            public void setWing(Wing wing) {
                this.wing = wing;
            }

            @Override
            public String toString() {
                return "Plane{" +
                        "wing=" + wing +
                        '}';
            }

            public class Wing {
                private final double weight;

                public Wing(double weight) {
                    this.weight = weight;
                }

                public double getWeight() {
                    return weight;
                }

                @Override
                public String toString() {
                    return "Wing{" +
                            "weight=" + weight +
                            '}';
                }
            }
        }
    }
}



















// write your code here


