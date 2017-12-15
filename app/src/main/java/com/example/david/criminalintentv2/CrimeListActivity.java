package com.example.david.criminalintentv2;

import android.support.v4.app.Fragment;

/**
 * Created by David on 11/6/2017.
 */

public class CrimeListActivity extends
        SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
