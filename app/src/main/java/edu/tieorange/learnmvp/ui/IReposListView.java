package edu.tieorange.learnmvp.ui;

import java.util.List;

/**
 * Created by root on 11/12/16.
 */
public interface IReposListView {
    void someAction();

    void onReposLoadedSuccess(List<Repo> list);

    void onReposLoadedFailure(String error);
}
