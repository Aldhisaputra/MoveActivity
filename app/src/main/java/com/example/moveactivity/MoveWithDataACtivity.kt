package com.example.moveactivity

import android.bluetooth.BluetoothDevice.EXTRA_NAME
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveWithDataACtivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data_activity)

        val tvDataRecived:TextView =findViewById(R.id.tv_data_recived)

        val name =intent.getStringExtra(EXTRA_NAME)
        val age =intent.getIntExtra(EXTRA_AGE,0)

        val text="Name:$name\nyour Age :$age"
        tvDataRecived.text=text
    }

    companion object {
        const val EXTRA_AGE="extra_age"
        const val EXTRA_NAME="extra_name"
    }
}
