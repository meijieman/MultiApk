package com.major.multiapk;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = (TextView)findViewById(R.id.tv_main);

        text.setText(Constant.BASE_URL + "\n"
                     + getPkgInfo() + "\n"
                     + BuildConfig.AUTO_UPDATES + "\n"
                     + BuildConfig.APPLICATION_ID + "\n"
                     + BuildConfig.moreInfo + "\n"
                     + BuildConfig.DEBUG);
    }

    private String getPkgInfo(){
        try{
            PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            return packageInfo.versionName + ", " + packageInfo.versionCode;
        } catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
