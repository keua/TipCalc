package com.oktacore.android.tipcalc.fragments;

import com.oktacore.android.tipcalc.models.TipRecord;

/**
 * Created by usuario on 5/06/16.
 */
public interface TipHistoryListFragmentListener {
    void addToList(TipRecord record);
    void clearList();
}