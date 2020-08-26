package org.mightyfrog.android.bottomnavigationviewsample.ui.dashboard

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import org.mightyfrog.android.bottomnavigationviewsample.R
import org.mightyfrog.android.bottomnavigationviewsample.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private val dashboardViewModel: DashboardViewModel by viewModels()

    init {
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentDashboardBinding.inflate(inflater)
        dashboardViewModel.text.observe(viewLifecycleOwner, Observer {
            binding.textDashboard.text = it
        })
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.dashboard_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        Toast.makeText(
            context,
            getString(R.string.menu_tapped, item.title),
            Toast.LENGTH_SHORT
        ).show()

        return super.onOptionsItemSelected(item)
    }
}