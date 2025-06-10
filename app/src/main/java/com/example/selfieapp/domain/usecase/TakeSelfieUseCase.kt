package com.example.selfieapp.domain.usecase

import com.example.selfieapp.domain.repository.SelfieRepository

class TakeSelfieUseCase(private val repository: SelfieRepository) {

    operator fun invoke() {
        return repository.takeSelfie()
    }
}