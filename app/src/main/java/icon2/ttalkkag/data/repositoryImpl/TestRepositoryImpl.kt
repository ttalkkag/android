package icon2.ttalkkag.data.repositoryImpl

import icon2.ttalkkag.data.dto.BaseResponse
import icon2.ttalkkag.data.dto.request.TestRequest
import icon2.ttalkkag.data.dto.response.TestResponse
import icon2.ttalkkag.data.service.TestService
import icon2.ttalkkag.domain.model.TestModel
import icon2.ttalkkag.domain.repository.TestRepository
import icon2.ttalkkag.util.network.NetworkResult
import icon2.ttalkkag.util.network.handleApi
import javax.inject.Inject

class TestRepositoryImpl @Inject constructor(
    private val testService: TestService
) : TestRepository {
    override suspend fun fetchTest(request: TestRequest): NetworkResult<TestModel> {
        return handleApi({testService.fetchTest(request)}) {response: BaseResponse<TestResponse> -> response.data.toTestModel()} // mapper를 통해 api 결과를 TestModel로 매핑
    }

}