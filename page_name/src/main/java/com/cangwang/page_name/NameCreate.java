package com.cangwang.page_name;

import android.app.Application;
import android.util.Log;

import com.cangwang.core.util.ModuleImpl;

/**
 * Created by cangwang on 2017/2/25.
 */

public class NameCreate implements ModuleImpl{
    @Override
    public void onLoad(Application app) {
        for (int i=0;i<5;i++){
            Log.v("NameCreate","NameCreate onLoad");
        }
    }
}
