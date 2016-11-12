package edu.tieorange.learnmvp.ui;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 11/12/16.
 */
public class Repo {
    public String name;

    public Repo(String name) {
        this.name = name;
    }

    static List<Repo> getDummy(int count) {
        List<Repo> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(new Repo("Repo #" + i + 1));
        }
        return list;
    }
}
