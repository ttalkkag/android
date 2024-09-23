package icon2.ttalkkag.presentation.calendar

import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import icon2.ttalkkag.R
import icon2.ttalkkag.databinding.FragmentCalendarSelectBinding
import icon2.ttalkkag.presentation.base.BaseFragment

@AndroidEntryPoint
class CalendarSelectFragment : BaseFragment<FragmentCalendarSelectBinding>(R.layout.fragment_calendar_select){

    private val navigator by lazy { findNavController() }
    override fun initObserver() {

    }

    override fun initView() {
        binding.tvCalendarSelectSubmit.setOnClickListener{
            navigator.navigate(R.id.homeFragment)
        }
    }
}