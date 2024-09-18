package icon2.ttalkkag.presentation.test

import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import icon2.ttalkkag.R
import icon2.ttalkkag.databinding.ActivitiyTestBinding
import icon2.ttalkkag.presentation.base.BaseActivity
import icon2.ttalkkag.util.extension.repeatOnStarted

@AndroidEntryPoint
//@AndroidEntryPoint 를 Activity에 추가함으로써 ApplicationCompoenet의 하위 컴포넌트인 ActivityComponent가 생성되고 TestRepository 객체를 주입 받을 수 있게 된다.
class TestActivity : BaseActivity<ActivitiyTestBinding>(R.layout.activitiy_test) {
    //
    private val viewModel: TestViewModel by viewModels()
    override fun initView() {
        // viewModel의 test 함수를 이용해 api 호출
        viewModel.test()
    }

    override fun initObserver() {
        repeatOnStarted {
            // state flow 수집
            viewModel.testState.collect{
                   //로직 작성
            }
        }

        repeatOnStarted {
            // shared flow 수집
            viewModel.testShared.collect{
                   //로직 작성
            }
        }
    }

}