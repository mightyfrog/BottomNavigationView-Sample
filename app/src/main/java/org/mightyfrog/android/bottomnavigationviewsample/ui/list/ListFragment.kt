package org.mightyfrog.android.bottomnavigationviewsample.ui.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import org.mightyfrog.android.bottomnavigationviewsample.databinding.FragmentListBinding

class ListFragment : Fragment() {

    private val listViewModel: ListViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentListBinding.inflate(inflater)
        listViewModel.text.observe(viewLifecycleOwner, Observer {
            binding.textList.text = it
        })
        return binding.root
    }
}