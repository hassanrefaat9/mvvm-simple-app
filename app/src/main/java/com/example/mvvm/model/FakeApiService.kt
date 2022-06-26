package com.example.mvvm.model

import com.example.mvvm.model.domin.Wisdom

class FakeApiService {
    private val wisdomsList = listOf<Wisdom>(
            Wisdom("نحن لم نخلق عبثا نحن هنا لكي نحدث تغير","19/9/2022"),
            Wisdom("لا يمكن تحقيق النجاح الأ أذا أحببت ما تقوم به ","25/5/2025"),
            Wisdom("سر النجاح هو النظام .. نظام صارم يقضي على الفوضى في حياتك","14/9/2013"),
            Wisdom("إن النجاح هو محصلة اجتهادات صغيرة تتراكم يوماً بعد يوم","7/7/2007"),
            Wisdom("اذا لم نجد طريق النجاح فعلينا ان نبتكره","2/9/2022")
    )
    fun  getRandomWisdom() :Wisdom{
        val random =(Math.random() * wisdomsList.size).toInt()
        return wisdomsList[random]
    }
}