package ru.bobry.centerinvest.services

import org.springframework.stereotype.Service
import ru.bobry.centerinvest.models.Form
import ru.bobry.centerinvest.repositories.FormRepository

@Service
class FormService(private val FormRepository: FormRepository) {

    fun saveForm(form: Form): Form {
        return FormRepository.save(form)
    }

    fun getFormById(id: Long): Form? {
        return FormRepository.findById(id).orElse(null)
    }

    fun getAllForms(): List<Form> {
        return FormRepository.findAll()
    }

    fun deleteFormById(id: Long) {
        FormRepository.deleteById(id)
    }

}