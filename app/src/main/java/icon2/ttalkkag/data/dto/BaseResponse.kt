package icon2.ttalkkag.data.dto

data class BaseResponse<T>(
    val status: Int,
    val code: String,
    val message: String,
    val data: T,
)