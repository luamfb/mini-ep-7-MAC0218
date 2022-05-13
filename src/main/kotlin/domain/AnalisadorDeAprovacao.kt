package domain

import domain.criterios.CriterioDeAprovacao

class AnalisadorDeAprovacao {

    private lateinit var criterio: CriterioDeAprovacao

    fun defineCriterio(criterio: CriterioDeAprovacao) {
        this.criterio = criterio;
    }

    fun fechaBoletim(boletim: Boletim): BoletimFechado {
        var aprovado = this.criterio.estaAprovado(boletim)
        var mediaFinal = this.criterio.mediaFinal(boletim)
        return BoletimFechado(boletim.mediaEPs, boletim.mediaMiniEPs, mediaFinal, aprovado)
    }
}