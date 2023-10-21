package ru.bobry.centerinvest.controllers


import org.springframework.web.bind.annotation.*
import ru.bobry.centerinvest.models.Internship
import ru.bobry.centerinvest.models.Practice
import ru.bobry.centerinvest.services.InternshipService
import ru.bobry.centerinvest.services.PracticeService

@RestController
@CrossOrigin
@RequestMapping("/api/practice")
class PracticeController(private val practiceService: PracticeService) {

    @GetMapping()
    fun getAllPractice(): List<Practice> {
        return practiceService.getAllPractice()
    }

    @PostMapping("/create")
    fun createPractice(@RequestBody practice: Practice): Practice {
        return practiceService.createPractice(practice)
    }
}