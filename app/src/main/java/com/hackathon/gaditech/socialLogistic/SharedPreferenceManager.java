package com.hackathon.gaditech.socialLogistic;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.hackathon.gaditech.socialLogistic.model.UserList;

import java.util.ArrayList;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by Habiba Abbasii on 31/03/2018.
 */

public class SharedPreferenceManager {
    static String PREFERNCE_NAME="USER_DETAIL";

    public static void putDetailsInShared(Context context,String json){

        SharedPreferences.Editor editor =context.getSharedPreferences(PREFERNCE_NAME, MODE_PRIVATE).edit();

        editor.putString("user",json);
        editor.apply();
    }

    public static ArrayList<UserList> getDetails(Context context){

        ArrayList<UserList> list=new ArrayList<>();
        String jsonList=null;

        SharedPreferences prefs = context.getSharedPreferences(PREFERNCE_NAME, MODE_PRIVATE);
         jsonList = prefs.getString("user", null);

        if (jsonList != null) {
           jsonList = prefs.getString("user", "No name defined");//"No name defined" is the default value.
        }

        list=new Gson().fromJson(jsonList, new TypeToken<ArrayList<UserList>>(){}.getType());

        return list;
    }
}
