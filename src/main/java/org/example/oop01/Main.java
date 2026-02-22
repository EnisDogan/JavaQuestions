package org.example.oop01;

public class Main {

    public static void main(String[] args) {
        Student[] stArr = {
                new Student("Ahmet", "Dogan", 101, "A-10",
                        new Teacher("Mahmud", "Hoca", "10-A", "Biology")),

                new Student("Ayse", "Yilmaz", 102, "A-10",
                        new Teacher("Selim", "Kaya", "10-A", "Math")),

                new Student("Mehmet", "Kaya", 103, "A-10",
                        new Teacher("Fatih", "Demir", "10-A", "Physics")),

                new Student("Zeynep", "Demir", 104, "A-10",
                        new Teacher("Emine", "Acar", "10-A", "Chemistry")),

                new Student("Ali", "Celik", 105, "A-10",
                        new Teacher("Burcu", "Yildiz", "10-A", "History")),

                new Student("Elif", "Arslan", 106, "A-10",
                        new Teacher("Murat", "Sari", "10-A", "Geography")),

                new Student("Can", "Aydin", 107, "A-10",
                        new Teacher("Hakan", "Tas", "10-A", "English")),

                new Student("Fatma", "Sahin", 108, "A-10",
                        new Teacher("Leyla", "Gunes", "10-A", "German")),

                new Student("Burak", "Kurt", 109, "A-10",
                        new Teacher("Kemal", "Cetin", "10-A", "Computer Science")),

                new Student("Ece", "Oz", 110, "A-10",
                        new Teacher("Asli", "Kurt", "10-A", "Art"))
        };


    // find the student that has the lesson "Art"
        //find the schoolnumber of the student mehmet
        for (int i = 0; i < stArr.length; i++) {
            if (stArr[i].name.equals("Mehmet")){
                System.out.println(stArr[i].schoolNr);
            }
        }

        for (Student each: stArr){
            if (each.schoolNr == 108){
                System.out.println(each.name + " " + each.surname);
            }
        }

        for (Student each: stArr){
            if (each.name.equals("Ece")){
                System.out.println(each.teacher.name + " " + each.teacher.surname);
            }
        }

        for (Student each: stArr){
            if (each.teacher.lesson.equals("Geography")){
                System.out.println(each.name + " " + each.surname);
            }
        }



    }

}
