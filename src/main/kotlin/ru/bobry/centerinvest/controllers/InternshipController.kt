package ru.bobry.centerinvest.controllers


import org.springframework.web.bind.annotation.*
import ru.bobry.centerinvest.models.Internship
import ru.bobry.centerinvest.services.InternshipService

@RestController
@CrossOrigin
@RequestMapping("/api/internships")
class InternshipController(private val internshipService: InternshipService) {
    @GetMapping()
    fun getAllInternships(): List<Internship> {
        return internshipService.getAllInternships()
    }

    @PostMapping("/create")
    fun createInternship(@RequestBody internship: Internship): Internship {
        return internshipService.createInternship(internship)
    }
}