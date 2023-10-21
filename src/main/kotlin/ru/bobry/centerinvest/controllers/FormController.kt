package ru.bobry.centerinvest.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import ru.bobry.centerinvest.models.Form
import ru.bobry.centerinvest.services.FormService

@RestController
@CrossOrigin
@RequestMapping("/api/forms")
class FormController(private val formService: FormService) {

    @PostMapping
    fun saveForm(@RequestBody form: Form): ResponseEntity<Form> {
        val savedForm = formService.saveForm(form)
        return ResponseEntity.ok(savedForm)
    }

    @GetMapping("/{id}")
    fun getFormById(@PathVariable id: Long): ResponseEntity<Form> {
        val form = formService.getFormById(id)
        return if (form != null) {
            ResponseEntity.ok(form)
        } else {
            ResponseEntity.notFound().build()
        }
    }

    @GetMapping
    fun getAllForms(): ResponseEntity<List<Form>> {
        val forms = formService.getAllForms()
        return if (forms.isNotEmpty()) {
            ResponseEntity.ok(forms)
        } else {
            ResponseEntity.noContent().build()
        }
    }

    @DeleteMapping("/{id}")
    fun deleteFormById(@PathVariable id: Long): ResponseEntity<Unit> {
        formService.deleteFormById(id)
        return ResponseEntity.noContent().build()
    }

}