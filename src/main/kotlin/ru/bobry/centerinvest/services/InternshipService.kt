package ru.bobry.centerinvest.services

import org.springframework.stereotype.Service
import ru.bobry.centerinvest.models.Internship
import ru.bobry.centerinvest.repositories.InternshipRepository

@Service
class InternshipService(private val internshipRepository: InternshipRepository) {
    fun getAllInternships(): List<Internship> {
        return internshipRepository.findAll()
    }

    fun createInternship(internship: Internship): Internship {
        return internshipRepository.save(internship)
    }
}