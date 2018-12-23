package kr.tjit.a20181216_01_projectcopy;

import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    public abstract void bindViews();           //abstract(추상화)는 반드시 abstract class 안에서 이루어져야 함
    public abstract void setupEvents();
    public abstract void setValues();


}
