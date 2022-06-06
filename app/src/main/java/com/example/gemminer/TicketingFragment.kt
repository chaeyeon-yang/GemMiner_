package com.example.gemminer

import android.app.DatePickerDialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CalendarView.OnDateChangeListener
import android.widget.DatePicker
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.gemminer.databinding.FragmentTicketingBinding
import java.util.*


class TicketingFragment : Fragment() {
    lateinit var ticketingfrgmentBinding: FragmentTicketingBinding
    lateinit var mainActivity: HomeActivity
    var date = ""

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mainActivity = context as HomeActivity
    }

    override fun onStart() {
        super.onStart()
        mainActivity.findViewById<Button>(R.id.select_date).setOnClickListener {
            val cal = Calendar.getInstance()
            val dateSetListener = DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                date = "${year}년 ${month+1}월 ${dayOfMonth}일"
                mainActivity.findViewById<TextView>(R.id.res).text="예약날짜 : "+date
            }
            DatePickerDialog(mainActivity, dateSetListener, cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH)).show()
        }
        mainActivity.findViewById<Button>(R.id.booking_complete).setOnClickListener {
            Toast.makeText(mainActivity, "예약되었습니다.", Toast.LENGTH_SHORT).show()
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        ticketingfrgmentBinding = FragmentTicketingBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ticketing, container, false)
    }


}