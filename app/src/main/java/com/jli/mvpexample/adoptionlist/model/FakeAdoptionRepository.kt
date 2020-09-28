package com.jli.mvpexample.adoptionlist.model

class FakeAdoptionRepository:
    AdoptionRepository {
    override fun getAllAdoptionEntries(): List<AdoptionEntry> {
        val one = AdoptionEntry(
            0,
            "Fido",
            2,
            AnimalType.DOG
        )
        val two = AdoptionEntry(
            1,
            "Mr. Bigglesworth",
            8,
            AnimalType.CAT
        )
        val three = AdoptionEntry(
            2,
            "Benji",
            5,
            AnimalType.DOG
        )
        val four = AdoptionEntry(
            3,
            "Roxxie",
            2,
            AnimalType.DOG
        )
        val five = AdoptionEntry(
            4,
            "Benjamin",
            1,
            AnimalType.CAT
        )
        return listOf(one, two, three, four, five)
    }
}