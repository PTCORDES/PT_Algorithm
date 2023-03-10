package Chapter4_정렬;

import java.util.*;

//격자 줄이기 문제 - 정렬 후 hashmap 적용 후 해결
class Student implements Comparable<Student>{

    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    //점수가 낮은 순서대로 정렬
    @Override
    public int compareTo(Student o) {
        if(this.score<o.score)
            return -1;
        return 1;
    }
    //점수가 높은 순서대로면 왼쪽 점수가 더 크게 방향 설정

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            students.add(new Student(name, score));
        }

        Collections.sort(students);

        for (int j = 0; j < students.size(); j++) {
            System.out.print(students.get(j).getName() + " ");
        }
    }
}
