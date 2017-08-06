package com.example.water.mymobanapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.water.mymobanapplication.templateexample.AbstractComputer;
import com.example.water.mymobanapplication.templateexample.CodeComputer;
import com.example.water.mymobanapplication.templateexample.MulitaryComputer;

/**
 * 这样做的优点，封装不变部分，开一可以扩展可变部分
 * 固定结构：Asytask，主要可以看final
 * test
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AbstractComputer computer=new CodeComputer();
        computer.startUp();
        computer=new MulitaryComputer();
        computer.startUp();
    }
}
