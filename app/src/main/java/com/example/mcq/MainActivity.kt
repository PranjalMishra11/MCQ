package com.example.mcq

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.mcq.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tV1.setOnClickListener {
            var builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Which of the Following Number/Numbers are Prime")
            val option = arrayOf("12","2","31","17")
            builder1.setMultiChoiceItems(option,null,DialogInterface.OnMultiChoiceClickListener { dialog,which, isChecked ->
                Toast.makeText(this,"You have clicked on ${option[which]}",Toast.LENGTH_SHORT).show()
            })
            builder1.setPositiveButton("SUBMIT",DialogInterface.OnClickListener { dialogInterface, i ->
                //what submit will do
            })
            builder1.setNegativeButton("Decline",DialogInterface.OnClickListener { dialogInterface, i ->
                //what decline will do
            })
            builder1.show()
        }

        binding.tV2.setOnClickListener {
            var builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Which of the Following Number/Numbers are Even")
            val option = arrayOf("12","2","31","17")
            builder1.setMultiChoiceItems(option,null,DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                Toast.makeText(this,"You have clicked on ${option[which]}",Toast.LENGTH_SHORT).show()
            })
            builder1.setPositiveButton("SUBMIT",DialogInterface.OnClickListener { dialogInterface, i ->
                //what submit will do
            })
            builder1.setNegativeButton("Decline",DialogInterface.OnClickListener { dialogInterface, i ->
                //what decline will do
            })
            builder1.show()
        }

        binding.tV3.setOnClickListener {
            var builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Which of the Number is the a perfect square")
            val option = arrayOf("12","2","25","17")
            builder1.setSingleChoiceItems(option,0,DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this,"You have clicked on ${option[which]}",Toast.LENGTH_SHORT).show()
            })
            builder1.setPositiveButton("SUBMIT",DialogInterface.OnClickListener { dialogInterface, i ->
                //what submit will do
            })
            builder1.setNegativeButton("Decline",DialogInterface.OnClickListener { dialogInterface, i ->
                //what decline will do
            })
            builder1.show()
        }

        binding.tV4.setOnClickListener {
            var builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Which of the Following is perefct cube")
            val option = arrayOf("12","2","31","27")
            builder1.setSingleChoiceItems(option,0,DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this,"You have clicked on ${option[i]}",Toast.LENGTH_SHORT).show()
            })
            builder1.setPositiveButton("SUBMIT",DialogInterface.OnClickListener { dialogInterface, i ->
                //what submit will do
            })
            builder1.setNegativeButton("Decline",DialogInterface.OnClickListener { dialogInterface, i ->
                //what decline will do
            })
            builder1.show()
        }

        binding.button.setOnClickListener {
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Are you Sure?")
            builder1.setMessage("Do you want to Submit and Exit the Exam")
            builder1.setIcon(R.drawable.baseline_exit_to_app_24)
            builder1.setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder1.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->
                //What action should be performed if No is clicked
            })
            builder1.show()
        }
    }
}