package org.mightyfrog.android.bottomnavigationviewsample.ui.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import org.mightyfrog.android.bottomnavigationviewsample.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment() {

    private val settingsViewModel: SettingsViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentSettingsBinding.inflate(inflater)
        settingsViewModel.text.observe(viewLifecycleOwner, Observer {
            binding.textSettings.text = it
        })
        return binding.root
    }
}