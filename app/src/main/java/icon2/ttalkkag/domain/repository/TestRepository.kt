package icon2.ttalkkag.domain.repository

import icon2.ttalkkag.data.dto.request.TestRequest
import icon2.ttalkkag.domain.model.TestModel
import icon2.ttalkkag.util.network.NetworkResult


interface TestRepository {
    suspend fun fetchTest(request: TestRequest): NetworkResult<TestModel>
}