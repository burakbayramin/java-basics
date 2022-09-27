package com.burak.oop.contructors.miniprojects.Workout;

public class Workout {
    private int dl_num;
    private int bench_num;
    private int squat_num;

    public Workout(int dl_num, int bench_num, int squat_num) {
        this.dl_num = dl_num;
        this.bench_num = bench_num;
        this.squat_num = squat_num;
    }

    public int getDl_num() {
        return dl_num;
    }

    public void setDl_num(int dl_num) {
        this.dl_num = dl_num;
    }

    public int getBench_num() {
        return bench_num;
    }

    public void setBench_num(int bench_num) {
        this.bench_num = bench_num;
    }

    public int getSquat_num() {
        return squat_num;
    }

    public void setSquat_num(int squat_num) {
        this.squat_num = squat_num;
    }

    public void doWorkout(String exercise, int num) {
        if (exercise.equals("deadlift")){
            doDL(num);
        }
        else if (exercise.equals("bench")){
            doBENCH(num);
        }
        else if (exercise.equals("squat")){
            doSQUAT(num);
        }
        else
            System.out.println("wrong exercise");
    }

    public void doDL(int num) {
        if (dl_num == 0){
            System.out.println("deadlift is done");
        }
        if(dl_num - num < 0){
            System.out.println("you did extra, this is extra num " +(num - dl_num));
            dl_num = 0;
        }
        else {
            dl_num -= num;
            System.out.println(dl_num + " deadlift left");
        }
    }

    public void doBENCH(int num) {
        if (bench_num == 0){
            System.out.println("bench is done");
        }
        if (bench_num - num < 0){
            System.out.println("you did extra, this is extra num " +(num - bench_num));
            bench_num = 0;
        }
        else {
            bench_num -= num;
            System.out.println(bench_num + " bench left");
        }
    }

    public void doSQUAT(int num) {
        if (squat_num == 0){
            System.out.println("squat is done");
        }
        if (squat_num - num < 0){
            System.out.println("you did extra, this is extra num " +(num - squat_num));
            squat_num = 0;
        }
        else {
            squat_num -= num;
            System.out.println(squat_num + " squat left");
        }
    }

    public boolean isFinished() {
        return (dl_num == 0) && (bench_num == 0) && (squat_num == 0);
    }

}
