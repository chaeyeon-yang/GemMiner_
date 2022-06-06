package com.example.gemminer

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gemminer.databinding.FragmentMainMenuGlobalBinding


class MainMenuGlobalFragment : Fragment() {
    lateinit var  globalBinding:FragmentMainMenuGlobalBinding
    private val binding get() = globalBinding!!

    private var globalContext: Context?=null
    private val _context get() = globalContext!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        globalBinding = FragmentMainMenuGlobalBinding.inflate(inflater, container, false)
        val view = globalBinding.root

        globalBinding.performanceDetail.setOnClickListener {
            (activity as HomeActivity).btnFragment(ArtistDetailFragment())
        }
        return view
    }

    override fun onAttach(context: Context) {
        globalContext=context
        super.onAttach(context)
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}