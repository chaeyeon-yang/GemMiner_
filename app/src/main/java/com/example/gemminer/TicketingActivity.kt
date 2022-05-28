package com.example.gemminer

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.gemminer.databinding.ActivityTicketingBinding
import java.util.*

class TicketingActivity : AppCompatActivity() {
    var ticketingBinding=ActivityTicketingBinding.inflate(layoutInflater)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ticketing)

        var strArray=Array<String>(3){""}

        ticketingBinding.bookingCalendar.setOnDateChangeListener {calendarView, year, month, day->
            strArray[0] = year.toString()
            strArray[1] = (month+1).toString()
            strArray[2] = day.toString()
        }

    }

}