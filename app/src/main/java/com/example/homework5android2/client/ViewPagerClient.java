package com.example.homework5android2.client;

import com.example.homework5android2.R;

import java.util.ArrayList;

public class ViewPagerClient {
    public static ArrayList<ViewPagerModel> pagerlist = new ArrayList<>();

    public static ArrayList<ViewPagerModel> getPagerlist() {
        pagerlist.add(new ViewPagerModel("Welcome " +
                "to productive life!", "You can plan your time, add and organize" +
                "tasks. Reminders so that you don't forget" +
                "a thing - we take care of it. ", R.raw.todo_one,"Skip"));
        pagerlist.add(new ViewPagerModel("Collaboration" +
                "with students", "You can create a common study.schedule," +
                "group tasks, manage them and communicate " +
                "with other members.", R.raw.todo_two,"Skip"));
        pagerlist.add(new ViewPagerModel("How to keep up" +
                "with everything?", "You can track your productivity, see your results" +
                "and progress. Also, this is a great opportunity" +
                "to track how much time you spend studying! ", R.raw.todothree,"Get started"));
        return pagerlist;
    }
}
