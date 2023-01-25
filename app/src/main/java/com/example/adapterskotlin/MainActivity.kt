package com.example.adapterskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myListView: ListView = findViewById(R.id.my_list_view)
        val layoutId : Int = android.R.layout.simple_list_item_1

        val myStringArray = ArrayList<String>();
        val myAdapterInstance = ArrayAdapter<String>(this, layoutId, myStringArray);
        myListView.setAdapter(myAdapterInstance);

        myStringArray.add("The");
        myStringArray.add("quick");
        myStringArray.add("green");
        myStringArray.add("Android");
        myStringArray.add("jumped");
        myStringArray.add("over");
        myStringArray.add("the");
        myStringArray.add("Ding");
        myStringArray.add("Dong");
        myStringArray.add("Ping");
        myStringArray.add("Pong");
        myStringArray.add("Ding");
        myStringArray.add("Dong");
        myStringArray.add("Dong")
        myStringArray.add("Android")
        myStringArray.add("jumped")
        myStringArray.add("over")
        myStringArray.add("THE")
/*
        val myClassesArray = ArrayList<MyClass>();
        myClassesArray.add(MyClass("khojo"));
        myClassesArray.add(MyClass("mojo"));
        myClassesArray.add(MyClass("tojo"));
        myClassesArray.add(MyClass("dojo"));
        myClassesArray.add(MyClass("Pojo"));
        myClassesArray.add(MyClass("Aojo"));
        myClassesArray.add(MyClass("Bojo"));
        myClassesArray.add(MyClass("Cojo"));
        myClassesArray.add(MyClass("Tojo"));
        myClassesArray.add(MyClass("Mojo"));
        myClassesArray.add(MyClass("Aojo"));
        myClassesArray.add(MyClass("Bojo"));
        myClassesArray.add(MyClass("Jojo"));
        myClassesArray.add(MyClass("Kojo"));
        myClassesArray.add(MyClass("Uojo"));
        myClassesArray.add(MyClass("Vojo"));

//        val myArrayAdapter = MyArrayAdapter(this, layoutId, myClassesArray)
//        myListView.setAdapter(myArrayAdapter)

*/
    }
}