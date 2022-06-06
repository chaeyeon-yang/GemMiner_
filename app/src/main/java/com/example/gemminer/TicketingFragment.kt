package com.example.gemminer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CalendarView.OnDateChangeListener
import android.widget.DatePicker
import androidx.fragment.app.Fragment
import com.example.gemminer.databinding.FragmentTicketingBinding
import java.util.*


class TicketingFragment : Fragment() {
    lateinit var ticketingfrgmentBinding: FragmentTicketingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        ticketingfrgmentBinding = FragmentTicketingBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

        ticketingfrgmentBinding.bookingCalendar.setOnDateChangeListener(OnDateChangeListener { view, year, month, dayOfMonth ->
            ticketingfrgmentBinding.bookingDate.text = dayOfMonth.toString()
        })

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ticketing, container, false)
    }
    

}