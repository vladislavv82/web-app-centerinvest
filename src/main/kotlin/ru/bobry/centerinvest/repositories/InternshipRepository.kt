package ru.bobry.centerinvest.repositories

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.bobry.centerinvest.models.Internship

@Repository
interface InternshipRepository : JpaRepository<Internship, Long>