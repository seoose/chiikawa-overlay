package com.syseo.chiikawaoverlay

import androidx.annotation.DrawableRes

data class PetInfo(
    val id: String,
    val label: String,
    @DrawableRes val thumbRes: Int
)

object PetCatalog {
    val all = listOf(
        PetInfo("chiikawa", "치이카와", R.drawable.thumb_chiikawa),
        PetInfo("hachiware", "하치와레", R.drawable.thumb_hachiware),
        PetInfo("usagi", "우사기", R.drawable.thumb_usagi),
        PetInfo("momonga", "모몽가", R.drawable.thumb_momonga),
        PetInfo("shisa", "시사", R.drawable.thumb_shisa),
        PetInfo("rakko", "랏코", R.drawable.thumb_rakko),
        PetInfo("kurimanju", "쿠리만주", R.drawable.thumb_kurimanju),
        PetInfo("siren", "세이렌", R.drawable.thumb_siren),
        PetInfo("furuhonya", "후루혼야", R.drawable.thumb_furuhonya),
        PetInfo("anoko", "아노코", R.drawable.thumb_anoko),
        PetInfo("dekatsuyo", "데카츠요", R.drawable.thumb_dekatsuyo)
    )

    fun byId(id: String): PetInfo? = all.find { it.id == id }
}
