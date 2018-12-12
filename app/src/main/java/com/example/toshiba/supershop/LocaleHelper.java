package com.example.toshiba.supershop;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.preference.Preference;
import android.preference.PreferenceManager;

import java.util.Locale;

public class LocaleHelper {
    private static final String SELECTED_LANGUAJE = "Locale.Helper.Selected.Languaje";

    public static Context onAttach(Context context)
    {
        String lang = getPersistedData(context, Locale.getDefault().getLanguage());
        return setLocale(context,lang);
    }

    public static Context onAttach(Context context, String defaultLanguaje)
    {
        String lang = getPersistedData(context, defaultLanguaje);
        return setLocale(context,lang);
    }

    private static Context setLocale(Context context, String lang)
    {
        persist(context,lang);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.N)
            return updateResources(context,lang);

        return updateResources(context,lang);
    }

    @TargetApi(Build.VERSION_CODES.N)
    private static Context updateResources(Context context, String lang) {
        Locale locale = new Locale(lang);
        Locale.setDefault(locale);

        Configuration config = context.getResources().getConfiguration();
        config.setLocale(locale);
        config.setLayoutDirection(locale);

        return context.createConfigurationContext(config);

    }

    private static void persist(Context context, String  lang)
    {
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(SELECTED_LANGUAJE, lang);
        editor.apply();
    }

    private static String getPersistedData(Context context, String languaje) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getString(SELECTED_LANGUAJE,languaje);
    }

}
