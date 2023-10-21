package ru.bobry.centerinvest.controllers

import org.springframework.web.bind.annotation.*
import ru.bobry.centerinvest.dtos.TestDTO
import ru.bobry.centerinvest.models.Option
import ru.bobry.centerinvest.models.Test
import ru.bobry.centerinvest.repositories.OptionRepository
import ru.bobry.centerinvest.repositories.TestRepository

@RestController
@CrossOrigin
@RequestMapping("/api/tests")
class TestController(private val testRepository: TestRepository, private val optionRepository: OptionRepository) {

    @GetMapping
    fun getAllTests(): List<Test> = testRepository.findAll()

    @PostMapping
    fun createTest(@RequestBody testDTO: TestDTO): Test {
        val test = Test(title = testDTO.title)
        val savedTest = testRepository.save(test)
        val options = testDTO.options.map { optionDTO ->
            Option(text = optionDTO.text, isCorrect = optionDTO.isCorrect, test = savedTest)
        }
        val savedOptions = optionRepository.saveAll(options)
        savedTest.options = savedOptions
        return savedTest
    }

    @PutMapping("/{id}")
    fun updateTest(@PathVariable id: Long, @RequestBody updatedTest: Test): Test {
        val test = testRepository.findById(id).orElseThrow { RuntimeException("Тест не найден") }
        val newTest = test.copy(title = updatedTest.title, options = updatedTest.options)
        return testRepository.save(newTest)
    }

    @DeleteMapping("/{id}")
    fun deleteTest(@PathVariable id: Long) = testRepository.deleteById(id)
}