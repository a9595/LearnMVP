package edu.tieorange.learnmvp.repos;

import java.util.List;

import edu.tieorange.learnmvp.models.Repo;

/**
 * Created by root on 11/12/16.
 */
public interface IReposInteractorFinishedListener {
    void onNetworkSuccess(List<Repo> list);

    void onNetworkFailure(String error);
}
