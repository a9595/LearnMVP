package edu.tieorange.learnmvp.repos;

import java.util.List;

import edu.tieorange.learnmvp.models.Repo;

/**
 * Created by root on 11/12/16.
 */
public interface IReposListView {

    void onReposLoadedSuccess(List<Repo> list);

    void onReposLoadedFailure(String error);
}
