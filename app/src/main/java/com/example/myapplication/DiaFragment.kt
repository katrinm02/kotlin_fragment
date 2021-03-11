package com.example.myapplication

import android.graphics.Paint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DiaFragment: DialogFragment(){
    private lateinit var myAdapter: Adapter
    private lateinit var LayoutManager: LinearLayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
   setStyle(STYLE_NORMAL, R.style.ThemeOverlay_AppCompat_Dialog)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.dia_fragment, container, false)
        myAdapter = Adapter()
        view.findViewById<RecyclerView>(R.id.rv).apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = myAdapter
            setHasFixedSize(true)

        }
        val list = mutableListOf<String>()
        for (i in 0..100)
            list.add("item $i")
        myAdapter.update(list)
        return view
    }

}