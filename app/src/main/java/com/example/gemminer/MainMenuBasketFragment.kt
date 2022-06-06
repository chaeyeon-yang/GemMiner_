package com.example.gemminer

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gemminer.databinding.FragmentMainMenuBasketBinding
import com.example.gemminer.databinding.FragmentMainMenuGlobalBinding

class MainMenuBasketFragment : Fragment() {
    lateinit var basketBinding: FragmentMainMenuBasketBinding
    private val binding get() = basketBinding!!

    private var basketContext: Context?=null
    private val _context get() = basketContext!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        basketBinding = FragmentMainMenuBasketBinding.inflate(inflater, container, false)
        val view = basketBinding.root

        basketBinding.performanceTicketing.setOnClickListener {
            (activity as HomeActivity).btnFragment(TicketingFragment())
        }
        return view
    }


    override fun onAttach(context: Context) {
        basketContext=context
        super.onAttach(context)
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}