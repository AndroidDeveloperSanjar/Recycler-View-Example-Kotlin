package com.example.kotlinrecyclerviewexample.data

import com.example.kotlinrecyclerviewexample.data.model.MainResponse

class DataSource{
    companion object{
        fun createMainData(): ArrayList<MainResponse>{
            val list = ArrayList<MainResponse>()
            list.add(
                MainResponse(
                    "Dadam",
                    "Qayerdanligi : Buxoro viloyati Jondor tumani",
                    "Tug'ilgan yili : 04.05.1970",
                    "Ismi : Karimov Suxrob",
                    "Kasbi : Taksist"
                )
            )
            list.add(
                MainResponse(
                    "Onajonim",
                    "Qayerdanligi : Buxoro viloyati Jondor tumani",
                    "Tug'ilgan yili : 25.01.1969",
                    "Ismi : Sharipova Muazzam",
                    "Kasbi : Uy bekasi"
                )
            )
            list.add(
                MainResponse(
                    "Akam",
                    "Qayerdanligi : Buxoro viloyati Jondor tumani",
                    "Tug'ilgan yili : 25.09.1992",
                    "Ismi : Karimov Sardor",
                    "Kasbi : Inkasator"
                )
            )
            list.add(
                MainResponse(
                    "Do'stim",
                    "Qayerdanligi : Buxoro viloyati Jondor tumani",
                    "Tug'ilgan yili : 19.03.1996",
                    "Ismi : Muxtorov Miraziz",
                    "Kasbi : Bankir"
                )
            )
            list.add(
                MainResponse(
                    "Do'stim",
                    "Qayerdanligi : Buxoro viloyati Jondor tumani",
                    "Tug'ilgan yili : 07.08.1996",
                    "Ismi : Shodmonov Zubaydullo",
                    "Kasbi : Talaba(zam hokim)"
                )
            )
            list.add(
                MainResponse(
                    "Do'stim",
                    "Qayerdanligi : Buxoro viloyati Jondor tumani",
                    "Tug'ilgan yili : 14.06.1996",
                    "Ismi : Amirqulov Jalil",
                    "Kasbi : Talaba(Nachalnik partiya)"
                )
            )
            list.add(
                MainResponse(
                    "Ukam",
                    "Qayerdanligi : Xorazm viloyati Xiva tumani..",
                    "Tug'ilgan yili : .........",
                    "Ismi : Musayev Abror",
                    "Kasbi : Talaba(Elektronik)"
                )
            )
            list.add(
                MainResponse(
                    "Ukam",
                    "Qayerdanligi : Buxoro viloyati Jondor tumani",
                    "Tug'ilgan yili : 07.07.2000",
                    "Ismi : Esanov Feruz",
                    "Kasbi : Talaba(Dasturchi)"
                )
            )
            list.add(
                MainResponse(
                    "Ukam",
                    "Qayerdanligi : Buxoro viloyati Jondor tumani",
                    "Tug'ilgan yili : 26.05.2002",
                    "Ismi : Abdullayev Javohir",
                    "Kasbi : Zavzal v restorane"
                )
            )
            list.add(
                MainResponse(
                    "Kamina",
                    "Qayerdanligi : Buxoro viloyati Jondor tumani",
                    "Tug'ilgan yili : 02.07.1996",
                    "Ismi : Karimov Sanjar",
                    "Kasbi : Android Developer"
                )
            )
            return list
        }
    }
}