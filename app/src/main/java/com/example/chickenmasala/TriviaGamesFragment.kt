package com.example.chickenmasala

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.chickenmasala.databinding.FragmentTriviaGamesBinding


class TriviaGamesFragment : BaseFragment<FragmentTriviaGamesBinding>() {
    override val LOG_TAG: String = "TriviaGamesFragment"
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentTriviaGamesBinding =
        FragmentTriviaGamesBinding::inflate


    override fun setup() {
    }

    override fun addCallBacks() {
    }

}