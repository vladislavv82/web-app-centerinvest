package ru.bobry.centerinvest.services

import org.springframework.stereotype.Service
import ru.bobry.centerinvest.models.Vacancy
import ru.bobry.centerinvest.repositories.VacancyRepository

@Service
class VacancyService(private val vacancyRepository: VacancyRepository) {
    fun getAllVacancys(): List<Vacancy> {
        return vacancyRepository.findAll()
    }

    fun createVacancy(vacancy: Vacancy): Vacancy {
        return vacancyRepository.save(vacancy)
    }
}