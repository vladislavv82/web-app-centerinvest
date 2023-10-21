package ru.bobry.centerinvest.dtos

data class TestDTO(
    val id: Long?,
    val title: String,
    val options: List<OptionDTO>
)