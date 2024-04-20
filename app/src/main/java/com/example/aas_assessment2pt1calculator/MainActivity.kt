package com.example.aas_assessment2pt1calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AlertDialog
import com.example.aas_assessment2pt1calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    val dropdownList1= arrayOf("Ladder", "Siege", "Paratrooper", "Infiltrator")
    val dropdownList2= arrayOf("Wall", "Gate", "AA Gun", "Dogs")

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val adapter1=ArrayAdapter(this, android.R.layout.simple_spinner_item, dropdownList1)
        val adapter2=ArrayAdapter(this, android.R.layout.simple_spinner_item, dropdownList2)

        var b1=findViewById(R.id.button) as Button

        var spinner1=findViewById(R.id.assaultlist) as Spinner
        var spinner2=findViewById(R.id.defenselist) as Spinner

        //Spinner1
        spinner1.adapter=adapter1
        spinner1.onItemSelectedListener=object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if(spinner1.selectedItemPosition==0)
                {
                    binding.assaultconfirm.setText("" + spinner1.selectedItem)
                }

                if(spinner1.selectedItemPosition==1)
                {
                    binding.assaultconfirm.setText("" + spinner1.selectedItem)
                }

                if(spinner1.selectedItemPosition==2)
                {
                    binding.assaultconfirm.setText("" + spinner1.selectedItem)
                }

                if(spinner1.selectedItemPosition==3)
                {
                    binding.assaultconfirm.setText("" + spinner1.selectedItem)
                }
            }
        }

        //Spinner2
        spinner2.adapter=adapter2
        spinner2.onItemSelectedListener=object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if(spinner2.selectedItemPosition==0)
                {
                    binding.defenseconfirm.setText("" + spinner2.selectedItem)
                }

                if(spinner2.selectedItemPosition==1)
                {
                    binding.defenseconfirm.setText("" + spinner2.selectedItem)
                }

                if(spinner2.selectedItemPosition==2)
                {
                    binding.defenseconfirm.setText("" + spinner2.selectedItem)
                }

                if(spinner2.selectedItemPosition==3)
                {
                    binding.defenseconfirm.setText("" + spinner2.selectedItem)
                }
            }
        }

        b1.setOnClickListener{
            if(spinner1.selectedItemPosition==0 && spinner2.selectedItemPosition==0)
            {binding.textView5.setText("Soldiers can now climb over the Wall!")}
            if(spinner1.selectedItemPosition==0 && spinner2.selectedItemPosition==1)
            {binding.textView5.setText("The Gate has been protected by the roof!")}
            if(spinner1.selectedItemPosition==0 && spinner2.selectedItemPosition==2)
            {binding.textView5.setText("Soldiers will get shot the moment they climb over!")}
            if(spinner1.selectedItemPosition==0 && spinner2.selectedItemPosition==3)
            {binding.textView5.setText("Guard dogs approaching to munch them!")}
            if(spinner1.selectedItemPosition==1 && spinner2.selectedItemPosition==0)
            {binding.textView5.setText("Soldiers will use climbing towers and catapults to get over the wall!")}
            if(spinner1.selectedItemPosition==1 && spinner2.selectedItemPosition==1)
            {binding.textView5.setText("Breaching the gate with the rams!")}
            if(spinner1.selectedItemPosition==1 && spinner2.selectedItemPosition==2)
            {binding.textView5.setText("AA Guns neutralized!")}
            if(spinner1.selectedItemPosition==1 && spinner2.selectedItemPosition==3)
            {binding.textView5.setText("Dogs incoming for our drivers!")}
            if(spinner1.selectedItemPosition==2 && spinner2.selectedItemPosition==0)
            {binding.textView5.setText("Paratroopers dropping in behind the wall!")}
            if(spinner1.selectedItemPosition==2 && spinner2.selectedItemPosition==1)
            {binding.textView5.setText("Paratroopers dropping in behind the gate!")}
            if(spinner1.selectedItemPosition==2 && spinner2.selectedItemPosition==2)
            {binding.textView5.setText("The AA Gun is shooting them down!")}
            if(spinner1.selectedItemPosition==2 && spinner2.selectedItemPosition==3)
            {binding.textView5.setText("50% chance that either a Paratrooper or the Dog can hit!")}
            if(spinner1.selectedItemPosition==3 && spinner2.selectedItemPosition==0)
            {binding.textView5.setText("Infiltrators can climb over the Wall!")}
            if(spinner1.selectedItemPosition==3 && spinner2.selectedItemPosition==1)
            {binding.textView5.setText("Infiltrators can unlock and slip through the gate!")}
            if(spinner1.selectedItemPosition==3 && spinner2.selectedItemPosition==2)
            {binding.textView5.setText("Infiltrators can shut down the AA Batteries!")}
            if(spinner1.selectedItemPosition==3 && spinner2.selectedItemPosition==3)
            {binding.textView5.setText("Dogs have snuffed out the Infiltrators!")}
        }

        val b2=findViewById(R.id.instructions) as Button
        b2.setOnClickListener{
            showAlert()
        }
    }
    private fun showAlert(){
        val builder=AlertDialog.Builder(this)
        builder.setTitle("Instructions")
            .setMessage("As a tactician you are to analyze the battlefield with the common tactics shown. Select any tactic for both sides and commence to see the results")
            .setNegativeButton("Dismiss"){
                    dialog, which->
                dialog.dismiss()
            }
        val alertDialog: AlertDialog=builder.create()
        alertDialog.show()
    }
}