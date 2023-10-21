package ru.bobry.centerinvest.services

import org.springframework.stereotype.Service
import ru.bobry.centerinvest.models.Practice

import ru.bobry.centerinvest.repositories.PracticeRepository

@Service
class PracticeService(private val practiceRepository: PracticeRepository) {
    fun getAllPractice(): List<Practice> {
        return practiceRepository.findAll()
    }

    fun createPractice(practice: Practice): Practice {
        return practiceRepository.save(practice)
    }
}