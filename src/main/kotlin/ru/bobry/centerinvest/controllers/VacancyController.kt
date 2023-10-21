package ru.bobry.centerinvest.controllers

import org.springframework.web.bind.annotation.*
import ru.bobry.centerinvest.models.Vacancy
import ru.bobry.centerinvest.services.VacancyService

@RestController
@CrossOrigin
@RequestMapping("/vacancys")
class VacancyController(private val vacancyService: VacancyService) {
    @GetMapping("/all")
    fun getAllVacancys(): List<Vacancy> {
        return vacancyService.getAllVacancys()
    }

    @PostMapping("/create")
    fun createVacancy(@RequestBody vacancy: Vacancy): Vacancy {
        return vacancyService.createVacancy(vacancy)
    }
}