package icon2.ttalkkag.presentation.calendar

import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import icon2.ttalkkag.R
import icon2.ttalkkag.databinding.FragmentCalendarAddBinding
import icon2.ttalkkag.presentation.base.BaseFragment

@AndroidEntryPoint
class CalendarAddFragment : BaseFragment<FragmentCalendarAddBinding>(R.layout.fragment_calendar_add){

    private val navigator by lazy { findNavController() }

    override fun initObserver() {

    }

    override fun initView() {
        binding.tvCalendarAddSubmit.setOnClickListener {
            navigator.navigate(R.id.calendarSelectFragment)
        }
    }
}