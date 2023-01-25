package com.example.adapterskotlin

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.TextView

@SuppressLint("NotConstructor")
class MyArrayAdapter(context: Context, resource: Int) : ArrayAdapter<MyClass>(context, resource) {
    val _resource: Int = 0
    fun MyArrayAdapter(
        context: Context?,
        _resource: Int,
        items: List<MyClass>
    ) {
    }


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val newView : LinearLayout
        if(convertView == null){
            newView = LinearLayout(getContext());
            val inflater: String = Context.LAYOUT_INFLATER_SERVICE;
            val layoutInflater: LayoutInflater
            layoutInflater = getContext().getSystemService(inflater) as LayoutInflater;
            layoutInflater.inflate(_resource, newView, true);
        }
        else{
            newView = convertView as LinearLayout;
        }

        val classInstance = getItem(position)
        val text: TextView = newView.findViewById(android.R.id.text1)
        return newView;
    }

}