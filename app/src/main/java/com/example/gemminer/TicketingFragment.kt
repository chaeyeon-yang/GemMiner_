package com.example.gemminer

import android.app.DatePickerDialog
import android.content.Context
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
    lateinit var mainActivity: HomeActivity
    var date = ""

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mainActivity = context as HomeActivity
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        ticketingfrgmentBinding = FragmentTicketingBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        var strArray = Array<String>(3){""}

        ticketingfrgmentBinding.selectDate.setOnClickListener {
            val cal = Calendar.getInstance()
            val dateSetListener = DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                date = "${year}년 ${month+1}월 +${dayOfMonth}일"
                ticketingfrgmentBinding.res.text="예약날짜 : "+date
            }
            DatePickerDialog(mainActivity, dateSetListener, cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH)).show()
        }


    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ticketing, container, false)
    }


}