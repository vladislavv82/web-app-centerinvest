package ru.bobry.centerinvest.repositories

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.bobry.centerinvest.models.Option

@Repository
interface OptionRepository : JpaRepository<Option, Long>