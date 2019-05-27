package com.anwesh.uiprojects.linkedtripluscreatevirw

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.tripluscreateview.TriPlusCreateView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        TriPlusCreateView.create(this)
    }
}
