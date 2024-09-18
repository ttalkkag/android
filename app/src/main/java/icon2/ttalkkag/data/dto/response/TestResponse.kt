package icon2.ttalkkag.data.dto.response

import icon2.ttalkkag.domain.model.TestModel


data class TestResponse (
    val body: String
){
    fun toTestModel() = TestModel(body)
}