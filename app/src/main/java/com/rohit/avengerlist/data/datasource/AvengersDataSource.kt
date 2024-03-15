package com.rohit.avengerlist.data.datasource

import com.rohit.avengerlist.data.model.Avenger

interface AvengersDataSource {
    fun getAvengersMembers(): List<Avenger>
}

class AvengersDataSourceImpl : AvengersDataSource {
    override fun getAvengersMembers(): List<Avenger> {
        return mutableListOf(
            createAvenger(
                name = "Tony Stark",
                power = "The Mechanic",
                profileDesc = "Genius, Billionaire, Playboy, Philantropist",
                profilePictUrl = "https://images.bisnis.com/posts/2017/06/22/665183/tony-stark.jpg"
            ),
            createAvenger(
                name = "Thor odinson",
                power = "Tukang malu",
                profileDesc = "God of thunder di asgard, kang cukur di asgar",
                profilePictUrl = "https://static.wikia.nocookie.net/marvelcinematicuniverse/images/2/22/Thor_in_LoveAndThunder_Poster.jpg"
            ),
            createAvenger(
                name = "Black Widow",
                power = "The Double Agent",
                profileDesc = "Padahal belom pernah nikah tapi udah dipanggil widow :( ",
                profilePictUrl = "https://upload.wikimedia.org/wikipedia/en/thumb/f/f6/Scarlett_Johansson_as_Black_Widow.jpg/220px-Scarlett_Johansson_as_Black_Widow.jpg"
            ),
            createAvenger(
                name = "Bruce Banner",
                power = "Tukang Radiasi Gamma",
                profileDesc = "Katanya pinter, tapi nge-expose diri sendiri sama sinar gamma.. pie masse safety nya ",
                profilePictUrl = "https://cdn0-production-images-kly.akamaized.net/XDzZdREDSbeKoJr0WdDRcl7jtaE=/1200x675/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/700631/original/Mark-Ruffalo-Hulk-Movie-Potential.jpg"
            ),
            createAvenger(
                name = "Spider man",
                power = "Manusia laba - laba",
                profileDesc = "Experiment bapaknya... naro DNA laba laba ke anaknya. Di revamp 3 kali pemerannya",
                profilePictUrl = "https://media.gq-magazine.co.uk/photos/63468efef4f48bee2acb7062/16:9/w_2560%2Cc_limit/Tom-Holland-Spiderman-what-we-know-so-far.jpg"
            ),
            createAvenger(
                name = "Captain America",
                power = "Tukang lempar lembing tameng",
                profileDesc = "Hasil experiment orang, tadinya kurus kering eh jadi body goals. hobbynya petak umpet di es",
                profilePictUrl = "https://cdns.klimg.com/resized/1200x600/p/headline/ini-alasan-kenapa-captain-america-dibua-87ae07.jpg"
            ),
            createAvenger(
                name = "Hawkeye",
                power = "Kang panah",
                profileDesc = "Belajar panah dari kecil, awalnya ikut ekskul sekolah ngikutin sunnah nabi",
                profilePictUrl = "https://m.media-amazon.com/images/M/MV5BNTRhYTQwYWUtYTU0MC00NDdkLTk2MWQtOWVmOTBjNjFjMWE5XkEyXkFqcGdeQXZ3ZXNsZXk@._V1_QL75_UX500_CR0,0,500,281_.jpg"
            )
        )
    }

    private fun createAvenger(name: String, power: String, profileDesc: String, profilePictUrl: String): Avenger {
        return Avenger(name, power, profileDesc, profilePictUrl)
    }
}
