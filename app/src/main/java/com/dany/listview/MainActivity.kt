package com.dany.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


/*
    List View:

    Displays a vertically-scrollable collection of views, where each view is positioned immediately
    below the previous view in the list. For a more modern, flexible, and perform approach to
    displaying lists, use androidx.recyclerview.widget.RecyclerView.

 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ListViews are compose by adapter and data source:

        var arrayNames: Array<String> = arrayOf(
            "Caro", "Jero", "Dany", "Andres", "Yenni", "Ana",
            "Natalia", "Darago", "Cami", "Erika", "Edi", "Mary", "Felipe", "Jesus", "Manu",
            "Ines", "Gloria", "Edwin", "Esteban", "Melissa"
        )
        var adapterNames: ArrayAdapter<String> = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, arrayNames
        )

        list_view.adapter = adapterNames

        list_view.setOnItemClickListener { parent, view, position, id ->

            var idName: String = list_view.getItemAtPosition(position).toString()
            Toast.makeText(this, "Name: $idName", Toast.LENGTH_SHORT).show()
        }
    }
}