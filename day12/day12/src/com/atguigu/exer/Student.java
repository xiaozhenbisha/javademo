package com.atguigu.exer;

public class Student implements Sortable{

    private double score;

    public Student() {
    }

    public Student(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                '}';
    }

    @Override
    public int compare(Sortable s) {//
        if(s instanceof Student){
            Student stu = (Student) s;

            if(this.getScore() > stu.getScore()){
                return 1;
            }else if(this.getScore() < stu.getScore()){
                return -1;
            }else{
                return 0;
            }
        }

        return 666; //搞点注释
    }
}
