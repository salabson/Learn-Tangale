package com.digitaltouchlab.learntangale;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.v7.preference.ListPreference;
import android.support.v7.preference.CheckBoxPreference;
import android.support.v7.preference.Preference;
import android.support.v7.preference.PreferenceFragmentCompat;
import android.support.v7.preference.PreferenceManager;
import android.support.v7.preference.PreferenceScreen;

/**
 * Created by salabs on 19/08/2017.
 */

public class SettingsFragment extends PreferenceFragmentCompat implements SharedPreferences.OnSharedPreferenceChangeListener{
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.pref_learn_tangale);

        //  Get the preference screen, get the number of preferences and iterate through
        SharedPreferences sharedPreferences = getPreferenceScreen().getSharedPreferences();
        PreferenceScreen prefScreen = getPreferenceScreen();
        int count = prefScreen.getPreferenceCount();
        for (int i = 0; i < count; i++) {
            Preference p = prefScreen.getPreference(i);
            if (null != p) {
                if (!(p instanceof CheckBoxPreference)) {
                    String value =  sharedPreferences.getString(p.getKey(),"");
                    setPreferencesSummary(p,value);
                }
            }

        }



    }


    // This method should check if the preference is a ListPreference and, if so, find the label
    // associated with the value. You can do this by using the findIndexOfValue and getEntries methods
    // of Preference.
    private void setPreferencesSummary(Preference pref, String value) {
        if (pref instanceof ListPreference) {
            ListPreference listPreference = (ListPreference)pref;
           int prefIndex = listPreference.findIndexOfValue(value);
            if (prefIndex >= 0) {
                listPreference.setSummary(listPreference.getEntries()[prefIndex]);
            }

        }
    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
        Preference p = findPreference(key);
        if (null != p) {
            if (!(p instanceof CheckBoxPreference)) {
                String value =  sharedPreferences.getString(p.getKey(),"");
                setPreferencesSummary(p,value);
            }
        }

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getPreferenceScreen().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
    }
}
